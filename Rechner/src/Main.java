import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner einlesen = new Scanner(System.in);
		
		double a = einlesen.nextDouble();
		char c = einlesen.next().charAt(0);
		double b = einlesen.nextDouble();
		
		switch(c) {
		case '+':	System.out.println("" + SimpleMath.add(a, b));
					break;
		case '-': 	System.out.println("" + SimpleMath.substract(a, b));
					break;
		case '*':   System.out.println("" + SimpleMath.multiply(a, b));
					break;
		case '/': 	System.out.println("" + SimpleMath.divide(a, b));
					break;
		default: 	System.out.println("Fehler");
		}

	}

}
