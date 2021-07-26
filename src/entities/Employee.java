package entities;

public class Employee {
	
	public String name = "";
	public double salary = 0.00;
	public double tax = 0.00;

	public double salaryNoTax = 0.00;
	public double increase = 0.00;
	public double salaryUpdated = 0.00;
	
	public double NetSalary() {
		salaryNoTax = salary - tax;
		return salaryNoTax;
	}
	
	public void IncreaseSalary(double percentage) {
		salaryUpdated = (salary * (1 + (increase / 100))) - tax;
	}
	
	public String toString() {
		return "Updated data: " + name + ", $ " + String.format("%.2f",salaryUpdated);
	}
}
