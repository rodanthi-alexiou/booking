package com.tediproject.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String representativePhoto;
    private double costPerDay;
    private String rentalType; // Values: "private room", "shared room", "entire residence"
    private int numberOfBeds;
    private int numberOfReviews;
    private double averageRating;

    // Additional search filters
    private String roomType; // Values: "single", "double", "triple", etc.
    private double maximumCost;
    private boolean hasWirelessInternet;
    private boolean hasCooling;
    private boolean hasHeating;
    private boolean hasKitchen;
    private boolean hasTV;
    private boolean hasParking;
    private boolean hasElevator;

    // Constructor
    public Listing(String representativePhoto, double costPerDay, String rentalType, int numberOfBeds, int numberOfReviews, double averageRating) {
        this.representativePhoto = representativePhoto;
        this.costPerDay = costPerDay;
        this.rentalType = rentalType;
        this.numberOfBeds = numberOfBeds;
        this.numberOfReviews = numberOfReviews;
        this.averageRating = averageRating;
    }

    // Getters and Setters

    public String getRepresentativePhoto() {
        return representativePhoto;
    }

    public void setRepresentativePhoto(String representativePhoto) {
        this.representativePhoto = representativePhoto;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getMaximumCost() {
        return maximumCost;
    }

    public void setMaximumCost(double maximumCost) {
        this.maximumCost = maximumCost;
    }

    public boolean isHasWirelessInternet() {
        return hasWirelessInternet;
    }

    public void setHasWirelessInternet(boolean hasWirelessInternet) {
        this.hasWirelessInternet = hasWirelessInternet;
    }

    public boolean isHasCooling() {
        return hasCooling;
    }

    public void setHasCooling(boolean hasCooling) {
        this.hasCooling = hasCooling;
    }

    public boolean isHasHeating() {
        return hasHeating;
    }

    public void setHasHeating(boolean hasHeating) {
        this.hasHeating = hasHeating;
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }
}

