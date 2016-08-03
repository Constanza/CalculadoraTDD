package com.kodea.tdd.calc.user;

import java.util.Scanner;

public class Usuario {
	Scanner scanner = new Scanner(System.in);
	
	public int pedirPrimerOperando() {
		System.out.print("Ingrese primer operando: ");
		return scanner.nextInt();
	}
	
	public int pedirSegundoOperando() {
		System.out.print("Ingrese segundo operando: ");
		return scanner.nextInt();
	}
	
	public String pedirOperador() {
		System.out.print("Operaciones disponibles (+ - /  *)" +  
				" \nIngrese la operacion a realizar: ");
		return scanner.next();
	}
	
}
