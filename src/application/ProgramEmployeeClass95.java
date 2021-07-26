package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeClass95;

public class ProgramEmployeeClass95 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeClass95> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			
			System.out.println("Employee # " + i + ":");
			System.out.println("Please, inform the ID _");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.print("ID already taken, try a new one_");
				id = sc.nextInt();	
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeClass95(id, name, salary));			
			
			
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: _");
		int id = sc.nextInt();
		
		EmployeeClass95 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeClass95 obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 		
		
		
	}
	
	public static boolean hasId(List<EmployeeClass95> list, int id) {
		
		EmployeeClass95 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}

}
