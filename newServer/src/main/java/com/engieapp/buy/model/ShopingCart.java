package com.engieapp.buy.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("carts")
public class ShopingCart {
	@Id
	private String id;
	private double androidPrice;
	private double iosPrice;
	private double total;
	
	public String getId() {
		return id;
	}
	public double getAndroidPrice() {
		return androidPrice;
	}
	public double getIosPrice() {
		return iosPrice;
	}
	public double getTotal() {
		return total;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAndroidPrice(double androidPrice) {
		this.androidPrice = androidPrice;
	}
	public void setIosPrice(double iosPrice) {
		this.iosPrice = iosPrice;
	}
	public void setTotal(double toatal) {
		this.total = toatal;
	}
	

}
