package com.reservation.service;

import java.util.List;

import com.reservation.entity.Payment;

public interface PaymentService {
	
	public List<Payment> findAllPayments();
	public Payment findPaymentById(Long pay_id);
	public void createPayment(Payment payment);
	public void updatePayment(Payment payment);
	public void deletePayment(Long pay_id);

}
