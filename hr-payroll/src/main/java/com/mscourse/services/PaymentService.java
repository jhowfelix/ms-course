package com.mscourse.services;

import org.springframework.stereotype.Service;

import com.mscourse.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long woerkerId, int days) {
		return new Payment("Bob", 200.0, days);
		
	}

}
