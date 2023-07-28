// src/components/SearchForm.js
import React, { useState } from 'react';


const SearchForm = () => {
  const [district, setDistrict] = useState('');
  const [city, setCity] = useState('');
  const [country, setCountry] = useState('');
  const [rentalPeriod, setRentalPeriod] = useState('');
  const [numberOfPeople, setNumberOfPeople] = useState('');

  const handleDistrictChange = (e) => {
    setDistrict(e.target.value);
  };

  const handleCityChange = (e) => {
    setCity(e.target.value);
  };

  const handleCountryChange = (e) => {
    setCountry(e.target.value);
  };

  const handleRentalPeriodChange = (e) => {
    setRentalPeriod(e.target.value);
  };

  const handleNumberOfPeopleChange = (e) => {
    setNumberOfPeople(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Implement search logic here, e.g., make API call to backend
    console.log('Search form submitted:', {
      district,
      city,
      country,
      rentalPeriod,
      numberOfPeople,
    });
  };

  return (
    <div className="search-form-container">
      <h2>Search for a Room/Residence</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="district">District:</label>
          <input
            type="text"
            id="district"
            value={district}
            onChange={handleDistrictChange}
            placeholder="Enter district"
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="city">City:</label>
          <input
            type="text"
            id="city"
            value={city}
            onChange={handleCityChange}
            placeholder="Enter city"
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="country">Country:</label>
          <input
            type="text"
            id="country"
            value={country}
            onChange={handleCountryChange}
            placeholder="Enter country"
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="rentalPeriod">Rental Period:</label>
          <input
            type="text"
            id="rentalPeriod"
            value={rentalPeriod}
            onChange={handleRentalPeriodChange}
            placeholder="Enter rental period"
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="numberOfPeople">Number of People:</label>
          <input
            type="number"
            id="numberOfPeople"
            value={numberOfPeople}
            onChange={handleNumberOfPeopleChange}
            placeholder="Enter number of people"
            required
          />
        </div>
        <button type="submit">Search</button>
      </form>
    </div>
  );
};

export default SearchForm;
