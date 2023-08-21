package com.example.bookingbackend.repository;

import com.example.bookingbackend.model.BookListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookListingRepository extends JpaRepository<BookListing, Long> {

}