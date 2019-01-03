package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class CalculoRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		Rectangle r = new Rectangle();
		
		r.setWidth(sc.nextDouble());
		r.setHeight(sc.nextDouble());
		
		System.out.println("AREA = " + r.area());
		System.out.println("PERIMETER = " + r.perimeter());
		System.out.println("DIAGONAL = " + r.diagonal());

	}

}
