import pandas as pd
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import linear_kernel

# Load the CSV file into a DataFrame
data = pd.read_csv('listings.csv')

# Select relevant columns for content-based recommendation
columns_for_recommendation = ['id', 'name', 'summary', 'space', 'description']

# Combine selected text columns into a single column
data['text'] = data[columns_for_recommendation].fillna('').apply(lambda x: ' '.join(x), axis=1)

# Initialize the TF-IDF vectorizer
tfidf_vectorizer = TfidfVectorizer(stop_words='english')

# Create TF-IDF matrix
tfidf_matrix = tfidf_vectorizer.fit_transform(data['text'])

# Compute the cosine similarity matrix
cosine_sim = linear_kernel(tfidf_matrix, tfidf_matrix)

# Function to get recommendations based on a listing's ID
def get_recommendations(listing_id, cosine_sim=cosine_sim):
    # Get the index of the listing that matches the ID
    idx = data[data['id'] == listing_id].index[0]
    
    # Get the pairwsie similarity scores of all listings with that listing
    sim_scores = list(enumerate(cosine_sim[idx]))
    
    # Sort the listings based on the similarity scores
    sim_scores = sorted(sim_scores, key=lambda x: x[1], reverse=True)
    
    # Get the top 10 most similar listings
    sim_scores = sim_scores[1:11]
    
    # Get the listing indices
    listing_indices = [i[0] for i in sim_scores]
    
    # Return the top 10 similar listings
    return data['id'].iloc[listing_indices]

# Example: Get recommendations for a listing with ID 12345
recommended_listings = get_recommendations(12345)
print(recommended_listings)
