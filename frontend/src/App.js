// src/App.js
// src/App.js
import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import SearchForm from './components/SearchForm';
import RegistrationForm from './components/RegistrationForm';
import Login from './components/Login';
import './App.css';

const WelcomePage = () => {
  return (
    <div className="welcome-page">
      <nav className="navbar">
        <div className="app-name">
          <Link to="/">Room Rental App</Link>
        </div>
        <div className="nav-buttons">
          <Link to="/register">Register</Link>
          <Link to="/login">Login</Link>
        </div>
      </nav>
      <div className="content">
        <div className="left-bar">
          <Login />
          <Link to="/register">Register</Link>
        </div>
        <div className="main-content">
          <h1>Welcome to Room Rental App</h1>
          <SearchForm />
        </div>
      </div>
    </div>
  );
};

const App = () => {
  return (
    <Router>
      <Route exact path="/" component={WelcomePage} />
      <Route path="/register" component={RegistrationForm} />
      <Route path="/login" component={Login} />
    </Router>
  );
};

export default App;
