package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.Payment;
import com.payment.service.PaymentService;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String processPayment(@RequestBody Payment request) {
    	System.out.println(request);
        boolean success = paymentService.processPayment(request.getOrderId(), request.getAmount());
        return success ? "SUCCESS" : "FAILED";
    }
}
