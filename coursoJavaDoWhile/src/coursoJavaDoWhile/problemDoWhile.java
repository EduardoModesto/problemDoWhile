package coursoJavaDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class problemDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite a temperatura em Celsius : ");
		double C = sc.nextDouble();
		double F = 9.0*C/5.0 + 32;
		System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
		
		
		
		
		sc.close();

	}

}
