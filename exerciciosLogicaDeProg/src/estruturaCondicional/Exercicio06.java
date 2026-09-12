package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		double numero = scanner.nextDouble();
		
		if (numero >= 0.0 && numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero > 25.0 && numero <= 50.0) {
			System.out.println("Intervalo [25,50]");
		} else if (numero > 50.0 && numero <= 75.0) {
			System.out.println("Intervalo [50,75]");
		} else if (numero > 75.0 && numero <= 100.00) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		scanner.close();
	}
}
