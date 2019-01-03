package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Conta {
	
	public static void imprimir(char s, ContaBancaria c) {
		System.out.println();
		if(s == 'a')
			System.out.println("Account data: ");
		if(s == 'u')
			System.out.println("Update data: ");
		System.out.println(c);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria c;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String titular = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n): ");
		char init = sc.next().charAt(0);
		
		if (init == 'y') {
			System.out.println("Enter initial deposit value: ");
			c = new ContaBancaria(number, titular, sc.nextDouble());
		}else {
			c = new ContaBancaria(number, titular);
		}

		imprimir('a', c);

		System.out.println("Enter a deposit value: ");
		c.deposito(sc.nextDouble());
		
		imprimir('u', c);
		
		System.out.println("Enter a withdraw value: ");
		c.saque(sc.nextDouble());
		
		imprimir('u', c);
		
		sc.close();

	}
	
	

}
