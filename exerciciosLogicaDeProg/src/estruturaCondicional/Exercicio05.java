package estruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoItem, quantiaItem;
		double totalPagar;
		
		codigoItem = scanner.nextInt();
		quantiaItem = scanner.nextInt();
		
		totalPagar = 0.0;
		
		if (codigoItem == 1) {
			totalPagar = quantiaItem * 4.0;
		}
		else if (codigoItem == 2) {
			totalPagar = quantiaItem * 4.5;
		}
		else if (codigoItem == 3) {
			totalPagar = quantiaItem * 5.0;
		}
		else if (codigoItem == 4) {
			totalPagar = quantiaItem * 2.0;
		}
		else if (codigoItem == 5) {
			totalPagar = quantiaItem * 11.5;
		}
		
		System.out.printf("Total: R$%.2f%n", totalPagar);
		
		scanner.close();
	}
}
