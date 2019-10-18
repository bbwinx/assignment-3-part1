package com.IT7320.A3_PartA;

import org.junit.Before;
import org.mockito.Mockito;
import junit.framework.TestCase;
import org.junit.Test;

public class IncomeCalcTest extends TestCase {
	
	IncomeCalcImplementation obj;
	IIncomeCalculator mockObj;
	Employee emp;
	double income;	
	double expected, actual;

	@Before
	public void setUp() throws Exception {
		obj = new IncomeCalcImplementation();
		mockObj = Mockito.mock(IIncomeCalculator.class);
		
		income = 40000;
		emp = new Employee(income);
	}
	
	@Test
	public void testComputeTax() {
		expected = (30 / 100) * income;
		Mockito.when(mockObj.computeTax(income)).thenReturn((30 / 100) * income);
		obj.setObjCalculator(mockObj);
		
		actual = obj.computeTax(income);
		
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testWeeklySalary() {
		expected = 60000 / 52;
		Mockito.when(mockObj.weeklySalary(emp)).thenReturn(emp.getIncome() / 52);
		obj.setObjCalculator(mockObj);
		
		actual = obj.weeklySalary(emp);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMonthlySalary() {
		expected = emp.getIncome() / 26;
		Mockito.when(mockObj.fortnightSalary(emp)).thenReturn(emp.getIncome() / 26);
		obj.setObjCalculator(mockObj);
		
		actual = obj.fortnightSalary(emp);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testKiwisaver() {
		expected = emp.getIncome() * (3 / 100);
		Mockito.when(mockObj.computeKiwiSaver(emp)).thenReturn(emp.getIncome() * (3 / 100));
		obj.setObjCalculator(mockObj);
		
		actual = obj.computeKiwiSaver(emp);
		
		assertEquals(expected, actual);
	}
}
