package com.elecguitar.server.dto;

public class Car {
	private int carId;
	private String carName;
	private String img;
	private String manufactureDate; 
	private int price;
	private float elecMileage;
	private int batteryCapacity;
	private String sellStatus;
	
	public Car() {
		
	}
	
	
	public Car(int carId, String carName, String img, String manufactureDate, int price, float elecMileage,
			int batteryCapacity, String sellStatus) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.img = img;
		this.manufactureDate = manufactureDate;
		this.price = price;
		this.elecMileage = elecMileage;
		this.batteryCapacity = batteryCapacity;
		this.sellStatus = sellStatus;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public float getElecMileage() {
		return elecMileage;
	}


	public void setElecMileage(float elecMileage) {
		this.elecMileage = elecMileage;
	}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}


	public String getSellStatus() {
		return sellStatus;
	}


	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}

	
}

