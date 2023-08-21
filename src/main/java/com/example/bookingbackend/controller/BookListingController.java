package com.example.bookingbackend.controller;

import com.example.bookingbackend.exception.ResourceNotFoundException;
import com.example.bookingbackend.model.BookListing;
import com.example.bookingbackend.repository.BookListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookListingController {

    @Autowired
    private BookListingRepository bookListingRepository;

    @GetMapping("/bookings")
    public List<BookListing> getAllBookings() {
        return bookListingRepository.findAll();
    }

    @PostMapping("/bookings")
    public BookListing createBooking(@Valid @RequestBody BookListing bookListing) {
        // Set any additional fields or perform validations before saving
        return bookListingRepository.save(bookListing);
    }

    @GetMapping("/bookings/{id}")
    public BookListing getBookingById(@PathVariable(value = "id") Long bookingId) {
        return bookListingRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Booking", "bookingId", bookingId));
    }

    @PutMapping("/bookings/{id}")
    public BookListing updateBooking(@PathVariable(value = "id") Long bookingId,
                                     @Valid @RequestBody BookListing bookingDetails) {

        BookListing booking = bookListingRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Booking", "bookingId", bookingId));

        // Update the fields you want
        booking.setUser(bookingDetails.getUser());
        booking.setListing(bookingDetails.getListing());
        booking.setBookingDate(bookingDetails.getBookingDate());

        BookListing updatedBooking = bookListingRepository.save(booking);
        return updatedBooking;
    }

    @DeleteMapping("/bookings/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable(value = "id") Long bookingId) {
        BookListing booking = bookListingRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Booking", "bookingId", bookingId));

        bookListingRepository.delete(booking);

        return ResponseEntity.ok().build();
    }
}
