package com.reservation.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.entity.Payment;
import com.reservation.repository.PaymentRepository;
import com.reservation.service.PaymentService;

@Service
public class PaymentImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<Payment> findAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findPaymentById(Long pay_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePayment(Long pay_id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
