package com.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
