package com.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.entity.BookingItem;

public interface BookingItemRepository extends JpaRepository<BookingItem, Long>{

}
