package entities;

public class Rectangle {
	
	public double x,y,xarea,xperimeter,xdiagonal;
	
	public double calcArea() {
		double calc = x * y;
		return calc;
	}

	public double calcPerimeter() {
		double calc = 2*x + 2*y;
		return calc;
	}

	public double calcDiagonal() {
		double calc = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		return calc;
	}
	
	public String toString() {
		
		return "Area é igual a: "+ calcArea() + " - Perimetro é igual a: " +  calcPerimeter() + " - Diagonal é : "+ calcDiagonal(); 
	}
	
}
