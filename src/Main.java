import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 
		 * double y = 10.35789; int x = 255; String nome = "Maria"; //%s int idade = 31;
		 * //%d double renda = 4000.0; //%f //%n quebra linha
		 * 
		 * 
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * 
		 * System.out.printf("%.2f%n", y); System.out.println("Ola mundo!");
		 * //Locale.setDefault(Locale.US); System.out.print("Formatado: ");
		 * System.out.printf("%.2f%n", y);
		 * System.out.println("Formatando Variavel em println"+ y +" em metros.");
		 * System.out.printf("Resultado = %.2f metros%n",y);
		 * //System.out.printf("Variaverl x é: %f Variável y é: %f",x,y);
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
		 * 
		 * System.out.println("========Exercicio1==============");
		 * 
		 * System.out.println("Products:");
		 * 
		 * System.out.printf("Computer with price is $ %.2f reais%n",price);
		 * System.out.printf("Office Desk with price is $ %.2f reais%n",price2);
		 * System.out.println(" ");
		 * System.out.printf("Record: %d years old, code %d and gender: %s %n",age,code,
		 * gender);
		 * System.out.printf("Measure with eight decimal places: %.8f %n",measure);
		 * System.out.printf("Rounded (three decimal places): %.3f%n",measure);
		 * Locale.setDefault(Locale.US);
		 * System.out.printf("US decimal point:: %.3f%n",measure);
		 * 
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String x2; int y2; double z; char x3;
		 * 
		 * String r; int s; double t;
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************SESSAO SCAN*************");
		 * System.out.print("Por favor, digite um nome: "); x2 = sc.next();
		 * System.out.println("Voce digitou: "+x2);
		 * 
		 * System.out.print("Por favor, digite um valor: "); y2 = sc.nextInt();
		 * System.out.println("Voce digitou: "+y2);
		 * 
		 * System.out.print("Por favor, digite um valor de saldo: "); z =
		 * sc.nextDouble(); System.out.printf(" %s tem : R$ %.2f%n",x2, z);
		 * 
		 * System.out.print("Por favor, digite palavras: "); x3 = (char)
		 * sc.next().charAt(0); System.out.println("Voce digitou: "+x3);
		 * 
		 * 
		 * System.out.print("Por favor, digite um nome, um valor, e um double: "); r =
		 * sc.next(); s = sc.nextInt(); t = sc.nextDouble();
		 * 
		 * System.out.print("Dados digitados: "); System.out.print(r);
		 * System.out.print(s); System.out.print(t);
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************FIM SESSAO SCAN*************");
		 * 
		 * 
		 * sc.close();
		 * 
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int x; String r,s,t;
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************SESSAO SCAN*************");
		 * System.out.print("Por favor, digite um numero: "); x = sc.nextInt();
		 * sc.nextLine(); System.out.print("Por favor, digite uma palavra: "); r =
		 * sc.nextLine(); System.out.print("Por favor, digite uma palavra: "); s =
		 * sc.nextLine(); System.out.print("Por favor, digite uma palavra: "); t =
		 * sc.nextLine();
		 * 
		 * System.out.println("Dados digitados: "); System.out.println(x);
		 * System.out.println(r); System.out.println(s); System.out.println(t);
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************FIM SESSAO SCAN*************"); sc.close();
		 */

		/*
		 * double x = 3.0; double y = 4.0; double z = -5.0; double a,b,c;
		 * 
		 * 
		 * a = Math.sqrt(x); b = Math.sqrt(y); c = Math.sqrt(25.0);
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************SESSAO RAIZ QUADRADA*************");
		 * 
		 * System.out.println("Raiz quadrada de " + x + " igual a : " + a);
		 * System.out.println("Raiz quadrada de " + y + " igual a : " + b);
		 * System.out.println("Raiz quadrada de 25 = " + c + " . ");
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************FIM RAIZ QUADRADA*************");
		 * 
		 * a = Math.pow(x,y); b = Math.pow(x,2.0); c = Math.pow(5.0,2.0);
		 * 
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************SESSAO POTENCIA*************");
		 * 
		 * System.out.println(x + " elevado a  " + y + " = " + a); System.out.println(x
		 * + " elevado ao quadrado =  " + b + " . ");
		 * System.out.println(" 5 elevado ao quadrado =  " + c );
		 * 
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************FIM POTENCIA*************");
		 * 
		 * a = Math.abs(y); b = Math.abs(z);
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************SESSAOVALOR ABSOLUTO*************");
		 * 
		 * 
		 * System.out.println("Valor absoluto de = " + y + " igual a  " + a);
		 * System.out.println("Valor absoluto de = " + z + " igual a  " + b);
		 * 
		 * System.out.println("                                     ");
		 * System.out.println("************FIM VALOR ABSOLUTO*************");
		 */

		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
		*/
		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
		System.out.print("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
		*/

		
		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//System.out.printf("Digite um valor: ");
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			
			soma += x;
			//System.out.printf("Dentro do while, valor de x: "+ x);
			x = sc.nextInt();			
		}
		
		System.out.printf("Valor de soma é: "+ soma);
		sc.close();
		*/
		

		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		int x = 0;
		int soma = 0;
		
		System.out.printf("Digite o número de repetições:");
		x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			
			System.out.printf("Digite o número a somar:");
			int y = sc.nextInt();
			
			soma = soma + y;			
			
		}
		System.out.printf("Valor de soma é: "+soma);
		sc.close();
		*/
		
		
		
		
		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
		System.out.printf("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		
		System.out.printf("Valor em Fahrenehit é: %.2f%n",F);
		System.out.print("Deseja repetir (s/n)? ");
		
		resp = sc.next().charAt(0);
		}while(resp != 'n');
		sc.close();	
		*/
		
		
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		System.out.println("-------------------");
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		
		
		
		
	}

}
