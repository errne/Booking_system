package com.codeclan.bookingsystem.BookingSystem.repositories.BookingRepository;

import com.codeclan.bookingsystem.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingsByDate(String date);
}
