package com.cts.domain;

public class Vehicle implements Loan, Insurance{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	double price;
	public Vehicle() {
		super();
	}
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double issueLoan() {
		double loanAmt=0;
		//System.out.println(vehicleType);
		if(vehicleType.equals("4 wheeler"))
			loanAmt=0.8*price;
		else if(vehicleType.equals("3 wheeler"))
			loanAmt=0.75*price;
		else if(vehicleType.equals("2 wheeler"))
			loanAmt=0.5*price;
		return loanAmt;
	}
	public double takeInsurance() {
		int insuranceAmt=0;
		if(price<=150000)
			insuranceAmt=3500;
		else if(price>150000 && price<=300000)
			insuranceAmt=4000;
		else if(price>300000)
			insuranceAmt=5000;
		return insuranceAmt;
		
	}

}
