package com.mscourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.entities.Payment;
import com.mscourse.entities.Worker;
import com.mscourse.services.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentController {
	
	@Autowired
	public PaymentService service;
		
	@GetMapping(value="/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	

}
