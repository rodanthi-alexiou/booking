package com.tediproject.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long listingId;

    private String name;
    private double costPerDay;
    private String rentalType; // Values: "private room", "shared room", "entire residence"
    private int numberOfBeds;
    private double averageRating;

    // Constructors (default and parameterized)

    public Listing() {
        // Default constructor required by JPA
    }

    public Listing(String name, double costPerDay, String rentalType, int numberOfBeds, double averageRating) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.rentalType = rentalType;
        this.numberOfBeds = numberOfBeds;
        this.averageRating = averageRating;
    }

    // Getters and Setters

    public long getListingId() {
        return listingId;
    }

    public void setListingId(long listingId) {
        this.listingId = listingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

}
