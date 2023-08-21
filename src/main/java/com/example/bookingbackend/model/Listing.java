package com.example.bookingbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "listings")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt"},
        allowGetters = true)
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "listing_id")
    private Long listing_id;


    private String listingUrl;
    private String scrapeId;
    private Date lastScraped;
    private String name;
    private String summary;
    private String space;

    @Column(length = 1000)
    private String description;

    private String experiencesOffered;

    @Column(length = 1000)
    private String neighborhoodOverview;
    
    private String notes;
    private String transit;
    private String thumbnailUrl;
    private String mediumUrl;
    private String pictureUrl;
    private String xlPictureUrl;
    private Long hostId;
    private String hostUrl;
    private String hostName;
    private Date hostSince;
    private String hostLocation;
    private String hostAbout;
    private String hostResponseTime;
    private String hostResponseRate;
    private String hostAcceptanceRate;
    private Boolean hostIsSuperhost;
    private String hostThumbnailUrl;
    private String hostPictureUrl;
    private String hostNeighbourhood;
    private Integer hostListingsCount;
    private Integer hostTotalListingsCount;

    @ElementCollection
    @CollectionTable(name = "listing_host_verifications", joinColumns = @JoinColumn(name = "listing_id"))
    @Column(name = "host_verification")
    private List<String> hostVerifications;

    private Boolean hostHasProfilePic;
    private Boolean hostIdentityVerified;
    private String street;
    private String neighbourhood;
    private String neighbourhoodCleansed;
    private String neighbourhoodGroupCleansed;
    private String city;
    private String state;
    private String zipcode;
    private String market;
    private String countryCode;
    private String country;
    private Double latitude;
    private Double longitude;
    private Boolean isLocationExact;
    private String propertyType;
    private String roomType;
    private Integer accommodates;
    private Double bathrooms;
    private Integer bedrooms;
    private Integer beds;
    private String bedType;

    @ElementCollection
    @CollectionTable(name = "listing_amenities", joinColumns = @JoinColumn(name = "listing_id"))
    @Column(name = "amenity")

    private List<String> amenities;
    private Double squareFeet;
    private Double price;
    private Double weeklyPrice;
    private Double monthlyPrice;
    private Double securityDeposit;
    private Double cleaningFee;
    private Integer guestsIncluded;
    private String extraPeople;
    private Integer minimumNights;
    private Integer maximumNights;
    private String calendarUpdated;
    private Boolean hasAvailability;
    private Integer availability30;
    private Integer availability60;
    private Integer availability90;
    private Integer availability365;
    private Date calendarLastScraped;
    private Integer numberOfReviews;
    private Date firstReview;
    private Date lastReview;
    private Double reviewScoresRating;
    private Double reviewScoresAccuracy;
    private Double reviewScoresCleanliness;
    private Double reviewScoresCheckin;
    private Double reviewScoresCommunication;
    private Double reviewScoresLocation;
    private Double reviewScoresValue;
    private Boolean requiresLicense;
    private String license;
    private String jurisdictionNames;
    private Boolean instantBookable;
    private String cancellationPolicy;
    private Boolean requireGuestProfilePicture;
    private Boolean requireGuestPhoneVerification;
    private Integer calculatedHostListingsCount;
    private Double reviewsPerMonth;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;


    // Getters and Setters
    public Long getListingId() {
        return listing_id;
    }

    public void setListingId(Long id) {
        this.listing_id = id;
    }

   

    public String getListingUrl() {
        return listingUrl;
    }

    public void setListingUrl(String listingUrl) {
        this.listingUrl = listingUrl;
    }

    public String getScrapeId() {
        return scrapeId;
    }

    public void setScrapeId(String scrapeId) {
        this.scrapeId = scrapeId;
    }

    public Date getLastScraped() {
        return lastScraped;
    }

    public void setLastScraped(Date lastScraped) {
        this.lastScraped = lastScraped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperiencesOffered() {
        return experiencesOffered;
    }

    public void setExperiencesOffered(String experiencesOffered) {
        this.experiencesOffered = experiencesOffered;
    }

    public String getNeighborhoodOverview() {
        return neighborhoodOverview;
    }

    public void setNeighborhoodOverview(String neighborhoodOverview) {
        this.neighborhoodOverview = neighborhoodOverview;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getXlPictureUrl() {
        return xlPictureUrl;
    }

    public void setXlPictureUrl(String xlPictureUrl) {
        this.xlPictureUrl = xlPictureUrl;
    }

    public Long getHostId() {
        return hostId;
    }

    public void setHostId(Long hostId) {
        this.hostId = hostId;
    }

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Date getHostSince() {
        return hostSince;
    }

    public void setHostSince(Date hostSince) {
        this.hostSince = hostSince;
    }

    public String getHostLocation() {
        return hostLocation;
    }

    public void setHostLocation(String hostLocation) {
        this.hostLocation = hostLocation;
    }

    public String getHostAbout() {
        return hostAbout;
    }

    public void setHostAbout(String hostAbout) {
        this.hostAbout = hostAbout;
    }

    public String getHostResponseTime() {
        return hostResponseTime;
    }

    public void setHostResponseTime(String hostResponseTime) {
        this.hostResponseTime = hostResponseTime;
    }

    public String getHostResponseRate() {
        return hostResponseRate;
    }

    public void setHostResponseRate(String hostResponseRate) {
        this.hostResponseRate = hostResponseRate;
    }

    public String getHostAcceptanceRate() {
        return hostAcceptanceRate;
    }

    public void setHostAcceptanceRate(String hostAcceptanceRate) {
        this.hostAcceptanceRate = hostAcceptanceRate;
    }

    public Boolean getHostIsSuperhost() {
        return hostIsSuperhost;
    }

    public void setHostIsSuperhost(Boolean hostIsSuperhost) {
        this.hostIsSuperhost = hostIsSuperhost;
    }

    public String getHostThumbnailUrl() {
        return hostThumbnailUrl;
    }

    public void setHostThumbnailUrl(String hostThumbnailUrl) {
        this.hostThumbnailUrl = hostThumbnailUrl;
    }

    public String getHostPictureUrl() {
        return hostPictureUrl;
    }

    public void setHostPictureUrl(String hostPictureUrl) {
        this.hostPictureUrl = hostPictureUrl;
    }

    public String getHostNeighbourhood() {
        return hostNeighbourhood;
    }

    public void setHostNeighbourhood(String hostNeighbourhood) {
        this.hostNeighbourhood = hostNeighbourhood;
    }

    public Integer getHostListingsCount() {
        return hostListingsCount;
    }

    public void setHostListingsCount(Integer hostListingsCount) {
        this.hostListingsCount = hostListingsCount;
    }

    public Integer getHostTotalListingsCount() {
        return hostTotalListingsCount;
    }

    public void setHostTotalListingsCount(Integer hostTotalListingsCount) {
        this.hostTotalListingsCount = hostTotalListingsCount;
    }


    public Boolean getHostHasProfilePic() {
        return hostHasProfilePic;
    }

    public void setHostHasProfilePic(Boolean hostHasProfilePic) {
        this.hostHasProfilePic = hostHasProfilePic;
    }

    public Boolean getHostIdentityVerified() {
        return hostIdentityVerified;
    }

    public void setHostIdentityVerified(Boolean hostIdentityVerified) {
        this.hostIdentityVerified = hostIdentityVerified;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getNeighbourhoodCleansed() {
        return neighbourhoodCleansed;
    }

    public void setNeighbourhoodCleansed(String neighbourhoodCleansed) {
        this.neighbourhoodCleansed = neighbourhoodCleansed;
    }

    public String getNeighbourhoodGroupCleansed() {
        return neighbourhoodGroupCleansed;
    }

    public void setNeighbourhoodGroupCleansed(String neighbourhoodGroupCleansed) {
        this.neighbourhoodGroupCleansed = neighbourhoodGroupCleansed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getIsLocationExact() {
        return isLocationExact;
    }

    public void setIsLocationExact(Boolean isLocationExact) {
        this.isLocationExact = isLocationExact;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getAccommodates() {
        return accommodates;
    }

    public void setAccommodates(Integer accommodates) {
        this.accommodates = accommodates;
    }

    public Double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Double bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }



    public Double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeeklyPrice() {
        return weeklyPrice;
    }

    public void setWeeklyPrice(Double weeklyPrice) {
        this.weeklyPrice = weeklyPrice;
    }

    public Double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(Double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public Double getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(Double securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public Double getCleaningFee() {
        return cleaningFee;
    }

    public void setCleaningFee(Double cleaningFee) {
        this.cleaningFee = cleaningFee;
    }

    public Integer getGuestsIncluded() {
        return guestsIncluded;
    }

    public void setGuestsIncluded(Integer guestsIncluded) {
        this.guestsIncluded = guestsIncluded;
    }

    public String getExtraPeople() {
        return extraPeople;
    }

    public void setExtraPeople(String extraPeople) {
        this.extraPeople = extraPeople;
    }

    public Integer getMinimumNights() {
        return minimumNights;
    }

    public void setMinimumNights(Integer minimumNights) {
        this.minimumNights = minimumNights;
    }

    public Integer getMaximumNights() {
        return maximumNights;
    }

    public void setMaximumNights(Integer maximumNights) {
        this.maximumNights = maximumNights;
    }

    public String getCalendarUpdated() {
        return calendarUpdated;
    }

    public void setCalendarUpdated(String calendarUpdated) {
        this.calendarUpdated = calendarUpdated;
    }

    public Boolean getHasAvailability() {
        return hasAvailability;
    }

    public void setHasAvailability(Boolean hasAvailability) {
        this.hasAvailability = hasAvailability;
    }

    public Integer getAvailability30() {
        return availability30;
    }

    public void setAvailability30(Integer availability30) {
        this.availability30 = availability30;
    }

    public Integer getAvailability60() {
        return availability60;
    }

    public void setAvailability60(Integer availability60) {
        this.availability60 = availability60;
    }

    public Integer getAvailability90() {
        return availability90;
    }

    public void setAvailability90(Integer availability90) {
        this.availability90 = availability90;
    }

    public Integer getAvailability365() {
        return availability365;
    }

    public void setAvailability365(Integer availability365) {
        this.availability365 = availability365;
    }

    public Date getCalendarLastScraped() {
        return calendarLastScraped;
    }

    public void setCalendarLastScraped(Date calendarLastScraped) {
        this.calendarLastScraped = calendarLastScraped;
    }

    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public Date getFirstReview() {
        return firstReview;
    }

    public void setFirstReview(Date firstReview) {
        this.firstReview = firstReview;
    }

    public Date getLastReview() {
        return lastReview;
    }

    public void setLastReview(Date lastReview) {
        this.lastReview = lastReview;
    }

    public Double getReviewScoresRating() {
        return reviewScoresRating;
    }

    public void setReviewScoresRating(Double reviewScoresRating) {
        this.reviewScoresRating = reviewScoresRating;
    }

    public Double getReviewScoresAccuracy() {
        return reviewScoresAccuracy;
    }

    public void setReviewScoresAccuracy(Double reviewScoresAccuracy) {
        this.reviewScoresAccuracy = reviewScoresAccuracy;
    }

    public Double getReviewScoresCleanliness() {
        return reviewScoresCleanliness;
    }

    public void setReviewScoresCleanliness(Double reviewScoresCleanliness) {
        this.reviewScoresCleanliness = reviewScoresCleanliness;
    }

    public Double getReviewScoresCheckin() {
        return reviewScoresCheckin;
    }

    public void setReviewScoresCheckin(Double reviewScoresCheckin) {
        this.reviewScoresCheckin = reviewScoresCheckin;
    }

    public Double getReviewScoresCommunication() {
        return reviewScoresCommunication;
    }

    public void setReviewScoresCommunication(Double reviewScoresCommunication) {
        this.reviewScoresCommunication = reviewScoresCommunication;
    }

    public Double getReviewScoresLocation() {
        return reviewScoresLocation;
    }

    public void setReviewScoresLocation(Double reviewScoresLocation) {
        this.reviewScoresLocation = reviewScoresLocation;
    }

    public Double getReviewScoresValue() {
        return reviewScoresValue;
    }

    public void setReviewScoresValue(Double reviewScoresValue) {
        this.reviewScoresValue = reviewScoresValue;
    }

    public Boolean getRequiresLicense() {
        return requiresLicense;
    }

    public void setRequiresLicense(Boolean requiresLicense) {
        this.requiresLicense = requiresLicense;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getJurisdictionNames() {
        return jurisdictionNames;
    }

    public void setJurisdictionNames(String jurisdictionNames) {
        this.jurisdictionNames = jurisdictionNames;
    }

    public Boolean getInstantBookable() {
        return instantBookable;
    }

    public void setInstantBookable(Boolean instantBookable) {
        this.instantBookable = instantBookable;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public Boolean getRequireGuestProfilePicture() {
        return requireGuestProfilePicture;
    }

    public void setRequireGuestProfilePicture(Boolean requireGuestProfilePicture) {
        this.requireGuestProfilePicture = requireGuestProfilePicture;
    }

    public Boolean getRequireGuestPhoneVerification() {
        return requireGuestPhoneVerification;
    }

    public void setRequireGuestPhoneVerification(Boolean requireGuestPhoneVerification) {
        this.requireGuestPhoneVerification = requireGuestPhoneVerification;
    }

    public Integer getCalculatedHostListingsCount() {
        return calculatedHostListingsCount;
    }

    public void setCalculatedHostListingsCount(Integer calculatedHostListingsCount) {
        this.calculatedHostListingsCount = calculatedHostListingsCount;
    }

    public Double getReviewsPerMonth() {
        return reviewsPerMonth;
    }

    public void setReviewsPerMonth(Double reviewsPerMonth) {
        this.reviewsPerMonth = reviewsPerMonth;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getHostVerifications() {
        return hostVerifications;
    }

    public void setHostVerifications(List<String> hostVerifications) {
        this.hostVerifications = hostVerifications;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    


}