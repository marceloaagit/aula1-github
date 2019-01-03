package entities;

public class Employee {

	private Integer id;
	private String name;
	private double salary;
	private double tax;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, double grossSalary) {
		this.id = id;
		this.name = name;
		this.salary = grossSalary;
	}

	public double netSalary() {
		return salary - tax;
	}

	public double increaseSalary(double percentage) {
		return salary += salary * percentage / 100.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee id= " + id + ", name= " + name + ", Salary= $" + String.format("%.2f", salary) + ".";
	}
	
	

}
