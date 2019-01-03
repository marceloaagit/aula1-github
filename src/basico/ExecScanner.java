package basico;

import java.util.Locale;
import java.util.Scanner;

public class ExecScanner {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		int a = sc.nextInt();
		
		System.out.println("Enter com o product price:");
		double b = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
		String c = sc.next();
		int d = sc.nextInt();
		double e = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
		sc.close();
		
	}

}
