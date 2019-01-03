package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class CalculoEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
	
		Employee e = new Employee();
		
		System.out.println("Enter you name: ");
		e.setName(sc.nextLine());
		
		System.out.println("Enter gross salary: ");
//		e.setGrossSalary(sc.nextDouble());
		
		System.out.println("Enter you tax: ");
		e.setTax(sc.nextDouble());
		
		System.out.println("--------------------------");
		System.out.println("Employee: " + e.getName() + ", $ " + e.netSalary());
		System.out.println("Which percentage to increase salary? ");
		double percent  = sc.nextDouble();
		System.out.println("Updated data: " + e.getName() + ", $ " + e.increaseSalary(percent));
		
		
		
	}
	

}
