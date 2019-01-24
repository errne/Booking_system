package com.codeclan.bookingsystem.BookingSystem.repositories.BookingRepository;

import com.codeclan.bookingsystem.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
