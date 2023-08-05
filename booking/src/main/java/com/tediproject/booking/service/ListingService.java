package com.tediproject.booking.service;

import com.tediproject.booking.model.Listing;
import com.tediproject.booking.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {
    private final ListingRepository listingRepository;

    @Autowired
    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    // Service methods

    public Listing createListing(Listing listing) {
        return listingRepository.save(listing);
    }

    public List<Listing> getAllListings() {
        return listingRepository.findAll();
    }

    public Listing getListingById(long listingId) {
        return listingRepository.findById(listingId)
                .orElseThrow(() -> new RuntimeException("Listing not found with ID: " + listingId));
    }

    public void updateListing(Listing listing) {
        listingRepository.save(listing);
    }

    public void deleteListing(long listingId) {
        listingRepository.deleteById(listingId);
    }

    // You can add additional service methods as needed
}
