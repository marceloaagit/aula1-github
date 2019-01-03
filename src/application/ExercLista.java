package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee busca = buscaId(id, list);

		System.out.println(busca);

		if (busca == null) {
			System.out.println("this id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			System.out.println("Incremento=> " + busca.increaseSalary(percentage));
		}

		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static Employee buscaId(int id, List<Employee> list) {
		return list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	}

}
