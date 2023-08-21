package com.example.bookingbackend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.bookingbackend.model.User;
import com.example.bookingbackend.repository.UserRepository;

@SpringBootTest
public class BookingBackendTests {

	@Test
	public void contextLoads() {
	}

	    @Autowired private UserRepository repo;
     
    @Test
    public void testCreateUser() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("nam2020");
         
        User newUser = new User("namcodejava", password, "nam@codejava.net", "Nam", "Nguyen", "Tenant", "0909090909");
        User savedUser = repo.save(newUser);
         
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getUser_id()).isGreaterThan(0);
    }

}
