import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		/*
		String original = "abcde FGHIJ ABC abc DEFG     ";
		String s = "potato apple lemon orange";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace("a","XXXX");
		int i = original.indexOf("FG");
		int i2 = original.lastIndexOf("ab");
		
		System.out.println("Original: " + original + "-");
		System.out.println("Depois lower: " + s01 + "-");
		System.out.println("Depois upper: " + s02 + "-");
		System.out.println("Depois trim: " + s03 + "-");
		System.out.println("Depois substring(2): " + s04 + "-");
		System.out.println("Depois substring(2,9): " + s05 + "-");
		System.out.println("Depois replace: " + s06 + "-");
		System.out.println("Depois indexOf (FG): " + i + ".");
		System.out.println("Depois lastIndexOf (ab): " + i2 + ".");
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		int cc = vect.length;
		
		System.out.println("Word1: " + word1 + ".");
		System.out.println("Word2: " + word2 + ".");
		System.out.println("Word3: " + word3 + ".");
		System.out.println("Word4: " + word4 + ".");
		System.out.println("Vect tamanho: " + cc + ".");	
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 números inteiros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		
		int higher = max(a,b,c);
		
		showResult(higher);

		
		sc.close();
	}
	
	
	public static int max(int x, int y, int z ) {
		int aux;
		
		if(x > y && x > z) {			
			//System.out.println("=====================");
			//System.out.println("Higher is: "+ x);
			aux = x;
		}else if(y > z){
			//System.out.println("Higher is: "+ y);
			aux = y;
		}else {
			//System.out.println("Higher is: "+ z);
			aux = z;
		}
		
		return aux;
		
	}
	
	
	public static void showResult(int value) {
		System.out.println("Higher is: "+ value);
	}
	
}
