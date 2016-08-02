package com.kodea.tdd.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void checkInstance() {
		
		//arrange
		Calculadora calc;
		
		//act
		calc = new Calculadora();
		
		//assert
		assertNotNull(calc);
	}
	
	@Test
	public void checkAddTwoIntegers() {
		Calculadora calc;
		calc = new Calculadora();
		int val1=1;
		int val2=20;
		
		double result = calc.add(val1,val2);
		
		assertEquals(21,result,0.1);
	}
	
	@Test
	public void checkSubstractTwoIntegers() {
		Calculadora calc;
		calc = new Calculadora();
		int val1=1;
		int val2=20;
		
		double result = calc.substract(val1,val2);
		
		assertEquals(-19,result,0.1);
	}
	
	@Test
	public void checkMultiplyTwoIntegers() {
		Calculadora calc;
		calc = new Calculadora();
		int val1=2;
		int val2=3;
		
		double result = calc.multiply(val1,val2);
		
		assertEquals(6,result,0.1);
	}
	
	@Test
	public void checkDivideTwoIntegers() {
		Calculadora calc;
		calc = new Calculadora();
		int val1=6;
		int val2=2;
		
		double result = calc.divide(val1,val2);
		
		assertEquals(3,result,0.1);
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkDivideByZero() {
		Calculadora calc;
		calc = new Calculadora();
		int val1=6;
		int val2=0;
		
		calc.divide(val1, val2);
		
	}
	
	
}
