package com.tediproject.booking.controller;

import com.tediproject.booking.model.Listing;
import com.tediproject.booking.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {
    private final ListingService listingService;

    @Autowired
    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    // Controller methods

    @PostMapping
    public ResponseEntity<Listing> createListing(@RequestBody Listing listing) {
        Listing createdListing = listingService.createListing(listing);
        return new ResponseEntity<>(createdListing, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Listing>> getAllListings() {
        List<Listing> listings = listingService.getAllListings();
        return new ResponseEntity<>(listings, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Listing> getListingById(@PathVariable("id") long listingId) {
        Listing listing = listingService.getListingById(listingId);
        return new ResponseEntity<>(listing, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateListing(@PathVariable("id") long listingId, @RequestBody Listing listing) {
        Listing existingListing = listingService.getListingById(listingId);
        existingListing.setName(listing.getName());
        existingListing.setCostPerDay(listing.getCostPerDay());
        existingListing.setRentalType(listing.getRentalType());
        existingListing.setNumberOfBeds(listing.getNumberOfBeds());
        existingListing.setAverageRating(listing.getAverageRating());

        listingService.updateListing(existingListing);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListing(@PathVariable("id") long listingId) {
        listingService.deleteListing(listingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // You can add additional controller methods as needed
}
