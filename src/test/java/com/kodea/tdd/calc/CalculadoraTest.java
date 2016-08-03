package com.kodea.tdd.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.kodea.tdd.calc.oper.Operador;

public class CalculadoraTest {

	@Test
	public void checkInstance() {
		
		//arrange
		Operador oper;
		
		//act
		oper = new Operador();
		
		//assert
		assertNotNull(oper);
	}
	
	@Test
	public void checkAddTwoIntegers() {
		Operador oper;
		oper = new Operador();
		int val1=1;
		int val2=20;
		
		double result = oper.add(val1,val2);
		
		assertEquals(21,result,0.1);
	}
	
	@Test
	public void checkSubstractTwoIntegers() {
		Operador oper;
		oper = new Operador();
		int val1=1;
		int val2=20;
		
		double result = oper.substract(val1,val2);
		
		assertEquals(-19,result,0.1);
	}
	
	@Test
	public void checkMultiplyTwoIntegers() {
		Operador oper;
		oper = new Operador();
		int val1=2;
		int val2=3;
		
		double result = oper.multiply(val1,val2);
		
		assertEquals(6,result,0.1);
	}
	
	@Test
	public void checkDivideTwoIntegers() {
		Operador oper;
		oper = new Operador();
		int val1=6;
		int val2=2;
		
		double result = oper.divide(val1,val2);
		
		assertEquals(3,result,0.1);
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkDivideByZero() {
		Operador oper;
		oper = new Operador();
		int val1=6;
		int val2=0;
		
		oper.divide(val1, val2);
		
	}
	
	
}
