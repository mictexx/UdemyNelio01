package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCurrency {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		
		do {
		
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println();
		
		System.out.println("How many dollars will be bought?");
		double tobuy = sc.nextDouble();
		System.out.println();
		
		System.out.println(CurrencyConverter.convert(dollar, tobuy));
		
		System.out.println("Continue (y/n)? ");
		resp = sc.next().charAt(0);
		sc.nextLine();
		
		
		}while(resp != 'n');
		
		sc.close();

	}

}
