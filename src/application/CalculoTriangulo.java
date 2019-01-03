package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class CalculoTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangule x = new Triangule();
		Triangule y = new Triangule();
		
		System.out.println("Entre com as medidas do triangulo x:");
		
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		
		System.out.println("Entre com as medidas do triangulo y:");
		
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X area %.4f:%n", areaX);
		System.out.printf("Triangulo Y area %.4f:%n", areaY);
		
		System.out.println(areaX > areaY ? "Triangulo X é maior!" : "Triangulo Y é maior!");

		sc.close();

	}

}
