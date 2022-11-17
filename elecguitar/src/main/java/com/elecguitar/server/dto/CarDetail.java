package com.elecguitar.server.dto;

public class CarDetail {
	private int carId;
	private String carName;
	private String company;
	private String img;
	private String manufactureDate; 
	private int price;
	private float elecMileage;
	private int batteryCapacity;
	private String carType;
	private int maximumDistance;
	private int capacity;
	private String sellStatus;
	private int maximumMotorOutput;
	private int maximumMotorTorque;
	private int weight;
	private int maximumSpeed;
	
	public CarDetail() {
		
	}
	
	
	public CarDetail(int carId, String carName, String company, String img, String manufactureDate, int price,
			float elecMileage, int batteryCapacity, String carType, int maximumDistance, int capacity,
			String sellStatus, int maximumMotorOutput, int maximumMotorTorque, int weight, int maximumSpeed) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.company = company;
		this.img = img;
		this.manufactureDate = manufactureDate;
		this.price = price;
		this.elecMileage = elecMileage;
		this.batteryCapacity = batteryCapacity;
		this.carType = carType;
		this.maximumDistance = maximumDistance;
		this.capacity = capacity;
		this.sellStatus = sellStatus;
		this.maximumMotorOutput = maximumMotorOutput;
		this.maximumMotorTorque = maximumMotorTorque;
		this.weight = weight;
		this.maximumSpeed = maximumSpeed;
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


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
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


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public int getMaximumDistance() {
		return maximumDistance;
	}


	public void setMaximumDistance(int maximumDistance) {
		this.maximumDistance = maximumDistance;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getSellStatus() {
		return sellStatus;
	}


	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}


	public int getMaximumMotorOutput() {
		return maximumMotorOutput;
	}


	public void setMaximumMotorOutput(int maximumMotorOutput) {
		this.maximumMotorOutput = maximumMotorOutput;
	}


	public int getMaximumMotorTorque() {
		return maximumMotorTorque;
	}


	public void setMaximumMotorTorque(int maximumMotorTorque) {
		this.maximumMotorTorque = maximumMotorTorque;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getMaximumSpeed() {
		return maximumSpeed;
	}


	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	
	
	
}

