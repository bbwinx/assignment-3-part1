package com.IT7320.A3_PartA;

public class Employee {
	private double income;
	private double kiwiSaver;
	
	public Employee(double income) {
		this.income = income;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public double getIncome() {
		return income;
	}
	
	public void setKiwiSaver(double kiwiSaver) {
		this.kiwiSaver = kiwiSaver;
	}
	
	public double getKiwiSaver() {
		return kiwiSaver;
	}

}
