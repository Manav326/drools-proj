package com.manav.drools.entity;

public class OrderRequest {

	public OrderRequest() {
	}
	private int orderId;
	private String paymentType;
	private int totalPrice;
	private int discount;
	private double discountedPrice;
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "OrderRequest [orderId=" + orderId + ", paymentType=" + paymentType + ", totalPrice=" + totalPrice
				+ ", discount=" + discount + ", discountedPrice=" + discountedPrice + "]";
	}
	
	

}
