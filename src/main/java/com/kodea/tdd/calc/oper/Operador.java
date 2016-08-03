package com.kodea.tdd.calc.oper;

import org.springframework.stereotype.Service;

@Service
public class Operador  implements IOperador{
	public double add(int val1, int val2) {
		return val1+val2;
	}

	public double subtract(int val1, int val2) {
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
