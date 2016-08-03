package com.kodea.tdd.calc;

import java.util.Scanner;

import com.kodea.tdd.calc.oper.IOperador;
import com.kodea.tdd.calc.oper.Operador;
import com.kodea.tdd.calc.user.Usuario;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Usuario user = new Usuario();
		Operador oper = new Operador();
		String listo;
		double result = 0.0;
		do {
			switch (user.pedirOperador()) {
			case "+":
				result = oper.add(user.pedirPrimerOperando(), user.pedirSegundoOperando());
				break;
			case "-":
				result = oper.subtract(user.pedirPrimerOperando(), user.pedirSegundoOperando());
				break;
			case "/":
				result = oper.divide(user.pedirPrimerOperando(), user.pedirSegundoOperando());
				break;
			case "*":
				result = oper.multiply(user.pedirPrimerOperando(), user.pedirSegundoOperando());
				break;

			}
			System.out.println("Resultado: " + result + " \nPresione tecla s para salir");
			listo = scanner.next();
		} while (!listo.equalsIgnoreCase("s"));
	}

}
