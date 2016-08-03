package com.kodea.tdd.calc.oper;

public class Operador {
	public double add(int val1, int val2) {
		return val1+val2;
	}

	public double substract(int val1, int val2) {
		return val1-val2;
	}

	public double multiply(int val1, int val2) {
		return val1*val2;
	}

	public double divide(int val1, int val2) throws ArithmeticException{
		if (val2 == 0) {
			throw new ArithmeticException("Segundo operando debe ser distinto de cero.");
		}
		return val1/val2;
	}
}
