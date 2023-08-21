package com.example.bookingbackend.controller;

import com.example.bookingbackend.exception.ResourceNotFoundException;
import com.example.bookingbackend.model.Listing;
import com.example.bookingbackend.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ListingController {

    @Autowired
    private ListingRepository listingRepository;

    @GetMapping("/listings")
    public List<Listing> getAllListings() {
        return listingRepository.findAll();
    }

    @PostMapping("/listings")
    public Listing createListing(@Valid @RequestBody Listing listing) {
        listing.setCreatedAt(new Date());
        return listingRepository.save(listing);
    }

    @GetMapping("/listings/{id}")
    public Listing getListingById(@PathVariable(value = "id") Long listingId) {
        return listingRepository.findById(listingId)
                .orElseThrow(() -> new ResourceNotFoundException("Listing", "listing_id", listingId));
    }

    @PutMapping("/listings/{id}")
    public Listing updateListing(@PathVariable(value = "id") Long listingId,
                                 @Valid @RequestBody Listing listingDetails) {

        Listing listing = listingRepository.findById(listingId)
                .orElseThrow(() -> new ResourceNotFoundException("Listing", "listing_id", listingId));

        // Update the fields you want
        listing.setListingUrl(listingDetails.getListingUrl());
        listing.setScrapeId(listingDetails.getScrapeId());
        listing.setLastScraped(listingDetails.getLastScraped());
        listing.setName(listingDetails.getName());
        listing.setSummary(listingDetails.getSummary());
        listing.setSpace(listingDetails.getSpace());
        listing.setDescription(listingDetails.getDescription());
        listing.setExperiencesOffered(listingDetails.getExperiencesOffered());
        listing.setNeighborhoodOverview(listingDetails.getNeighborhoodOverview());
        listing.setNotes(listingDetails.getNotes());
        listing.setTransit(listingDetails.getTransit());
        listing.setThumbnailUrl(listingDetails.getThumbnailUrl());
        listing.setMediumUrl(listingDetails.getMediumUrl());
        listing.setPictureUrl(listingDetails.getPictureUrl());
        listing.setXlPictureUrl(listingDetails.getXlPictureUrl());
        listing.setHostId(listingDetails.getHostId());
        listing.setHostUrl(listingDetails.getHostUrl());
        listing.setHostName(listingDetails.getHostName());
        listing.setHostSince(listingDetails.getHostSince());
        listing.setHostLocation(listingDetails.getHostLocation());
        listing.setHostAbout(listingDetails.getHostAbout());
        listing.setHostResponseTime(listingDetails.getHostResponseTime());
        listing.setHostResponseRate(listingDetails.getHostResponseRate());
        listing.setHostAcceptanceRate(listingDetails.getHostAcceptanceRate());
        listing.setHostIsSuperhost(listingDetails.getHostIsSuperhost());
        listing.setHostThumbnailUrl(listingDetails.getHostThumbnailUrl());
        listing.setHostPictureUrl(listingDetails.getHostPictureUrl());
        listing.setHostNeighbourhood(listingDetails.getHostNeighbourhood());
        listing.setHostListingsCount(listingDetails.getHostListingsCount());
        listing.setHostTotalListingsCount(listingDetails.getHostTotalListingsCount());
        listing.setHostVerifications(listingDetails.getHostVerifications());
        listing.setHostHasProfilePic(listingDetails.getHostHasProfilePic());
        listing.setHostIdentityVerified(listingDetails.getHostIdentityVerified());
        listing.setStreet(listingDetails.getStreet());
        listing.setNeighbourhood(listingDetails.getNeighbourhood());
        listing.setNeighbourhoodCleansed(listingDetails.getNeighbourhoodCleansed());
        listing.setNeighbourhoodGroupCleansed(listingDetails.getNeighbourhoodGroupCleansed());
        listing.setCity(listingDetails.getCity());
        listing.setState(listingDetails.getState());
        listing.setZipcode(listingDetails.getZipcode());
        listing.setMarket(listingDetails.getMarket());
        listing.setCountryCode(listingDetails.getCountryCode());
        listing.setCountry(listingDetails.getCountry());
        listing.setLatitude(listingDetails.getLatitude());
        listing.setLongitude(listingDetails.getLongitude());
        listing.setIsLocationExact(listingDetails.getIsLocationExact());
        listing.setPropertyType(listingDetails.getPropertyType());
        listing.setRoomType(listingDetails.getRoomType());
        listing.setAccommodates(listingDetails.getAccommodates());
        listing.setBathrooms(listingDetails.getBathrooms());
        listing.setBedrooms(listingDetails.getBedrooms());
        listing.setBeds(listingDetails.getBeds());
        listing.setBedType(listingDetails.getBedType());
        listing.setAmenities(listingDetails.getAmenities());
        listing.setSquareFeet(listingDetails.getSquareFeet());
        listing.setPrice(listingDetails.getPrice());
        listing.setWeeklyPrice(listingDetails.getWeeklyPrice());
        listing.setMonthlyPrice(listingDetails.getMonthlyPrice());
        listing.setSecurityDeposit(listingDetails.getSecurityDeposit());
        listing.setCleaningFee(listingDetails.getCleaningFee());
        listing.setGuestsIncluded(listingDetails.getGuestsIncluded());
        listing.setExtraPeople(listingDetails.getExtraPeople());
        listing.setMinimumNights(listingDetails.getMinimumNights());
        listing.setMaximumNights(listingDetails.getMaximumNights());
        listing.setCalendarUpdated(listingDetails.getCalendarUpdated());
        listing.setHasAvailability(listingDetails.getHasAvailability());
        listing.setAvailability30(listingDetails.getAvailability30());
        listing.setAvailability60(listingDetails.getAvailability60());
        listing.setAvailability90(listingDetails.getAvailability90());
        listing.setAvailability365(listingDetails.getAvailability365());
        listing.setCalendarLastScraped(listingDetails.getCalendarLastScraped());
        listing.setNumberOfReviews(listingDetails.getNumberOfReviews());
        listing.setFirstReview(listingDetails.getFirstReview());
        listing.setLastReview(listingDetails.getLastReview());
        listing.setReviewScoresRating(listingDetails.getReviewScoresRating());
        listing.setReviewScoresAccuracy(listingDetails.getReviewScoresAccuracy());
        listing.setReviewScoresCleanliness(listingDetails.getReviewScoresCleanliness());
        listing.setReviewScoresCheckin(listingDetails.getReviewScoresCheckin());
        listing.setReviewScoresCommunication(listingDetails.getReviewScoresCommunication());
        listing.setReviewScoresLocation(listingDetails.getReviewScoresLocation());
        listing.setReviewScoresValue(listingDetails.getReviewScoresValue());
        listing.setRequiresLicense(listingDetails.getRequiresLicense());
        listing.setLicense(listingDetails.getLicense());
        listing.setJurisdictionNames(listingDetails.getJurisdictionNames());
        listing.setInstantBookable(listingDetails.getInstantBookable());
        listing.setCancellationPolicy(listingDetails.getCancellationPolicy());
        listing.setRequireGuestProfilePicture(listingDetails.getRequireGuestProfilePicture());
        listing.setRequireGuestPhoneVerification(listingDetails.getRequireGuestPhoneVerification());
        listing.setCalculatedHostListingsCount(listingDetails.getCalculatedHostListingsCount());
        listing.setReviewsPerMonth(listingDetails.getReviewsPerMonth());
    

        Listing updatedListing = listingRepository.save(listing);
        return updatedListing;
    }

    @DeleteMapping("/listings/{id}")
    public ResponseEntity<?> deleteListing(@PathVariable(value = "id") Long listingId) {
        Listing listing = listingRepository.findById(listingId)
                .orElseThrow(() -> new ResourceNotFoundException("Listing", "listing_id", listingId));

        listingRepository.delete(listing);

        return ResponseEntity.ok().build();
    }
}
