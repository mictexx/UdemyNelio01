package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BookRoom;
import java.util.Random;

public class ProgramBookRoom {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int n = 0;
		BookRoom[] bookroom = new BookRoom[10];
		
		System.out.print("How many rooms will be rented?: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
			
			sc.nextLine();
			System.out.println("Rent # "+ i);
			System.out.print("Name:");
			String vname = sc.nextLine();
			
			System.out.print("Email:");
			String vemail= sc.nextLine();
			
			int vbook = aleatorio.nextInt(10) + 1;
			
			System.out.println("Room:"+ vbook);
			
			//System.out.println("i:"+ i);
			
			bookroom[i] = new BookRoom(vname,vemail,vbook);
			
			//sc.nextLine();
			
			System.out.println("Busy rooms:"+ bookroom.length);
			
			
						
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < bookroom.length; i++) {
			
			if (bookroom[i] != null) {
			
			System.out.println( bookroom[i].getRoomBooked() + ": " + bookroom[i].getNome() + ", " + bookroom[i].getEmail());
			
		}
			
		}
		
		sc.close();

	}

}
