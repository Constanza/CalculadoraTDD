package com.kodea.tdd.calc;

public class Calculadora {

	public double add(int val1, int val2) {
		// TODO Auto-generated method stub
		return 21;
	}

	public double substract(int val1, int val2) {
		// TODO Auto-generated method stub
		return -19;
	}

	public double multiply(int val1, int val2) {
		// TODO Auto-generated method stub
		return 6;
	}

	public double divide(int val1, int val2) throws ArithmeticException{
		// TODO Auto-generated method stub
		if (val2 == 0) {
			throw new ArithmeticException("Valor 2 debe ser distinto de cero.");
		}
		return 3;
	}

	
}
