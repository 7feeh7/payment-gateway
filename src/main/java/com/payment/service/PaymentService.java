package com.payment.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	public boolean processPayment(String orderId, double amount) {
		// Simulate payment processing logic
		return Math.random() > 0.5; 
	}
}
