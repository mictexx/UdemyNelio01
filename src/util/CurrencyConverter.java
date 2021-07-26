package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static String convert(double value, double toBuy) {
		
		return "Amount to be paid in reais = "+ String.format("%.2f",(value * toBuy)* (1.0 + IOF));
		
	}
		

}
