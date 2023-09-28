const fs = require('fs');  
const axios = require('axios');  
const csv = require('csv-parser');  
  
let counter = 0; // Counter variable to track the number of processed listings  
  
// Read the CSV file and extract the first 20 listings  
const stream = fs.createReadStream('listings.csv')  
  .pipe(csv())  
  .on('data', (row) => {  
    if (counter < 20) {  
      // Process each row and extract the required fields  
      const listing = {  
        listing_url: row.listing_url,  
        scrape_id: row.scrape_id,  
        last_scraped: row.last_scraped,  
        name: row.name,  
        summary: row.summary,  
        space: row.space,  
        description: row.description,  
        experiences_offered: row.experiences_offered,  
        neighborhood_overview: row.neighborhood_overview,  
        notes: row.notes,  
        transit: row.transit,  
        thumbnail_url: row.thumbnail_url,  
        medium_url: row.medium_url,  
        picture_url: row.picture_url,  
        xl_picture_url: row.xl_picture_url,  
        host_id: row.host_id,  
        host_url: row.host_url,  
        host_name: row.host_name,  
        host_since: row.host_since,  
        host_location: row.host_location,  
        host_about: row.host_about,  
        host_response_time: row.host_response_time,  
        host_response_rate: row.host_response_rate,  
        host_acceptance_rate: row.host_acceptance_rate,  
        host_is_superhost: row.host_is_superhost,  
        host_thumbnail_url: row.host_thumbnail_url,  
        host_picture_url: row.host_picture_url,  
        host_neighbourhood: row.host_neighbourhood,  
        host_listings_count: row.host_listings_count,  
        host_total_listings_count: row.host_total_listings_count,  
        host_verifications: row.host_verifications,  
        host_has_profile_pic: row.host_has_profile_pic,  
        host_identity_verified: row.host_identity_verified,  
        street: row.street,  
        neighbourhood: row.neighbourhood,  
        neighbourhood_cleansed: row.neighbourhood_cleansed,  
        neighbourhood_group_cleansed: row.neighbourhood_group_cleansed,  
        city: row.city,  
        state: row.state,  
        zipcode: row.zipcode,  
        market: row.market,  
        country_code: row.country_code,  
        country: row.country,  
        latitude: row.latitude,  
        longitude: row.longitude,  
        is_location_exact: row.is_location_exact,  
        property_type: row.property_type,  
        room_type: row.room_type,  
        accommodates: row.accommodates,  
        bathrooms: row.bathrooms,  
        bedrooms: row.bedrooms,  
        beds: row.beds,  
        bed_type: row.bed_type,  
        amenities: row.amenities,  
        square_feet: row.square_feet,  
        price: row.price,  
        weekly_price: row.weekly_price,  
        monthly_price: row.monthly_price,  
        security_deposit: row.security_deposit,  
        cleaning_fee: row.cleaning_fee,  
        guests_included: row.guests_included,  
        extra_people: row.extra_people,  
        minimum_nights: row.minimum_nights,  
        maximum_nights: row.maximum_nights,  
        calendar_updated: row.calendar_updated,  
        has_availability: row.has_availability,  
        availability_30: row.availability_30,  
        availability_60: row.availability_60,  
        availability_90: row.availability_90,  
        availability_365: row.availability_365,  
        calendar_last_scraped: row.calendar_last_scraped,  
        number_of_reviews: row.number_of_reviews,  
        first_review: row.first_review,  
        last_review: row.last_review,  
        review_scores_rating: row.review_scores_rating,
        review_scores_accuracy: row.review_scores_accuracy,  
        review_scores_cleanliness: row.review_scores_cleanliness,  
        review_scores_checkin: row.review_scores_checkin,  
        review_scores_communication: row.review_scores_communication,  
        review_scores_location: row.review_scores_location,  
        review_scores_value: row.review_scores_value,  
        requires_license: row.requires_license,  
        license: row.license,  
        jurisdiction_names: row.jurisdiction_names,  
        instant_bookable: row.instant_bookable,  
        cancellation_policy: row.cancellation_policy,  
        require_guest_profile_picture: row.require_guest_profile_picture,  
        require_guest_phone_verification: row.require_guest_phone_verification,  
        calculated_host_listings_count: row.calculated_host_listings_count,  
        reviews_per_month: row.reviews_per_month  
      };  
  
      // Send the listing to the API endpoint  
      axios.post('http://localhost:8080/api/listings', listing)  
        .then((response) => {  
          console.log('Listing posted successfully');  
        })  
        .catch((error) => {  
          console.error('Error posting listing:', error.message);  
        });  
  
      counter++; // Increment the counter after processing each listing  
    } else {  
      // Stop reading the CSV file by destroying the stream  
      stream.destroy();  
    }  
  })  
  .on('end', () => {  
    console.log('Finished processing the first 20 listings from the CSV file.');  
  });  
