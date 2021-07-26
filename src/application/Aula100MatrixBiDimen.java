package application;

import java.util.Locale;
import java.util.Scanner;

public class Aula100MatrixBiDimen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite numero de linhas(m):_");
		int m = sc.nextInt();
		System.out.print("Digite numero de colunas(n):_");
		int n = sc.nextInt();
		
		int[][] arrayBase = new int[m][n];
		
		for(int i =0; i< arrayBase.length; i++) {
			System.out.print("Digite os numeros da linha("+i+")");
			for(int j =0;j < arrayBase[i].length;j++) {
			arrayBase[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println();
		System.out.println("Ficou assim arrayBase:");
		for(int i =0; i< arrayBase.length; i++) {
			System.out.println("\n linha("+i+")");
			for(int j =0;j < arrayBase[i].length;j++) {
				System.out.println(arrayBase[i][j]);
			}
			
		}

		System.out.println();
		System.out.println("Digite o número para identificar a posição:");
		int num = sc.nextInt();
		
		for(int i =0; i< arrayBase.length; i++) {
			for(int j =0;j < arrayBase[i].length;j++) {
				
				if (arrayBase[i][j] == num) {
					System.out.println("Position: " + i + ","+ j);
					if(j-1 >= 0 && j-1 < arrayBase[i].length) {
					System.out.println("Left: " + arrayBase[i][j-1]);
					}
					if(j+1 >= 0 && j+1 < arrayBase[i].length) {
					System.out.println("Right: " + arrayBase[i][j+1]);
					}
					if(i+1 >= 0 && i+1 < arrayBase.length) {
					System.out.println("Down: " + arrayBase[i+1][j]);
					}
					if(i-1 >= 0 && i-1 < arrayBase.length) {
					System.out.println("Up: " + arrayBase[i-1][j]);
					}
				}
				
				
			}
			
		}		
		
		
		sc.close();
	}

}
