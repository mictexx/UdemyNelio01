package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp = 'y';
		Employee employee = new Employee();
		
		System.out.println("Please inform employee information");
		
		do {

			
			System.out.print("Name: ");
			employee.name = sc.nextLine();
			System.out.println();

			System.out.print("Gross salary: ");
			employee.salary = sc.nextDouble();
			System.out.println();

			System.out.print("Tax: ");
			employee.tax = sc.nextDouble();
			System.out.println();


			System.out.printf(employee.name + ", $ %.2f%n", employee.NetSalary());
			System.out.println();

			System.out.print("Which percentage to increase salary?");
			employee.increase = sc.nextDouble();
			employee.IncreaseSalary(employee.increase);
			System.out.println();


			System.out.println(employee);
			
			System.out.print("Continue (y/n)? ");
			resp = sc.next().charAt(0);
			sc.nextLine();
			

		} while (resp != 'n');

		sc.close();

	}

}
