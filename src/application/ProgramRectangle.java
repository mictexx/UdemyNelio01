package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.x = sc.nextDouble();
		System.out.println();
		rectangle.y = sc.nextDouble();
		System.out.println();
				
		System.out.println("Resultados=====:");
		System.out.println(rectangle);
		System.out.println("=====Fim=====:");
		
		sc.close();
	}

}
