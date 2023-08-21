package com.example.bookingbackend.repository;

import com.example.bookingbackend.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {

}