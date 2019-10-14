package com.IT7320.A3_PartA;

public interface IIncomeCalculator {
	public double computeTax(double income);
	public double weeklySalary(Employee income);
	public double fortnightSalary(Employee income);
	public double computeKiwiSaver(Employee income);
}
