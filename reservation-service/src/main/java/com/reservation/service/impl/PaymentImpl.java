package com.reservation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.Payment;
import com.reservation.repository.PaymentRepository;
import com.reservation.service.PaymentService;

import common.exception.NotFoundException;

@Service
public class PaymentImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	
	public PaymentImpl(PaymentRepository paymentRepository) {
		super();
		this.paymentRepository = paymentRepository;
	}

	@Override
	public List<Payment> findAllPayments() {		
		return paymentRepository.findAll();
	}

	@Override
	public Payment findPaymentById(Long payId) {		
		return paymentRepository.findById(payId)
				.orElseThrow(()-> new NotFoundException(String.format("Payment not found with ID %d",payId)));		
		
	}

	@Override
	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
		
	}

	@Override
	public Payment updatePayment(Payment payment) {
		return paymentRepository.save(payment);
		
	}

	@Override
	public void deletePayment(Long payId) {
		final Payment payment = paymentRepository.findById(payId)
				.orElseThrow(()->new NotFoundException(String.format("Payment not found with ID %d",payId)));
		paymentRepository.deleteById(payment.getPayId());
	}
	
}
