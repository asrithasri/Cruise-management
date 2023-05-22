package com.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.entity.BookingCharges;

public interface BookingChargesRepository extends JpaRepository<BookingCharges, Long>{

}
