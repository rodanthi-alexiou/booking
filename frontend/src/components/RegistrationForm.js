// src/components/RegistrationForm.js
import React, { useState } from 'react';


const RegistrationForm = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
    const [name, setName] = useState('');

  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleNameChange = (e) => {
        setName(e.target.value);
    };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Implement registration logic here, e.g., make API call to backend
    console.log('Registration form submitted:', username, password, name);
  };

  return (
    /* use login-container class for styling login form */
<div className='App'>
        <div className='App-header'>
    
      <h2 > Εγγραφή</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="username">Username:  </label>
          <input
            type="text"
            id="username"
            value={username}
            onChange={handleUsernameChange}
            required
          />
        </div>
        <div>
          <label htmlFor="password">Password:  </label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={handlePasswordChange}
            required
          />
        </div>
        <div>
            <label htmlFor="name">Name: </label>
            <input
                type="text"
                id="name"
                value={name}
                onChange={handleNameChange}
                required
            />
        </div>
        <button type="submit" className='botton'>Register</button>
      </form>
    </div>
    </div>
  );
};

export default RegistrationForm;
