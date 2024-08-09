package com.payment.model;

public class Payment {
	private String orderId;
	private double amount;
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmoung(double amount) {
		this.amount = amount;
	}
	
}
