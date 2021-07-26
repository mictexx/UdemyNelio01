package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp = 'y';
		Student student = new Student();
		
		System.out.println("Please inform student information");
		
		do {
			System.out.println("Name: ");
			student.name = sc.nextLine();
			System.out.println();
			
			System.out.println("grade 1: ");
			//student.grade[0] = sc.nextDouble();
			student.grade1= sc.nextDouble();
			System.out.println();
			
			System.out.println("grade 2: ");
			//student.grade[1] = sc.nextDouble();
			student.grade2 = sc.nextDouble();
			System.out.println();
			
			System.out.println("grade 3: ");
			//student.grade[2] = sc.nextDouble();
			student.grade3 = sc.nextDouble();
			System.out.println();
			
			student.finalGradeCalc();
			student.result();
			
			System.out.println(student);
			System.out.println();
			
			System.out.print("Continue (y/n)? ");
			resp = sc.next().charAt(0);
			sc.nextLine();
		
		}while(resp != 'n');
		
		sc.close();

	}

}
