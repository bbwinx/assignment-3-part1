package com.IT7320.A3_PartA;

public class IncomeCalcImplementation implements IIncomeCalculator {

	IIncomeCalculator obj;
	
	public double computeTax(double income) {
		return obj.computeTax(income);
	}

	public double weeklySalary(Employee income) {
		return obj.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		return obj.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee income) {
		return obj.computeKiwiSaver(income);
	}
	
	public void setObjCalculator(IIncomeCalculator objCalculator) {
		this.obj = objCalculator;
	}

}
