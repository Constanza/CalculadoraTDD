package com.kodea.tdd.calc.oper;

import org.springframework.stereotype.Service;

@Service
public class Operador  implements IOperador{
	public double add(double val1, double val2) {
		return val1+val2;
	}

	public double subtract(double val1, double val2) {
		return val1-val2;
	}

	public double multiply(double val1, double val2) {
		return val1*val2;
	}

	public double divide(double val1, double val2) throws ArithmeticException{
		if (val2 == 0) {
			throw new ArithmeticException("Segundo operando debe ser distinto de cero.");
		}
		return val1/val2;
	}
}
