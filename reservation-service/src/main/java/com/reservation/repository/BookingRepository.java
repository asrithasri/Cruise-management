package com.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
