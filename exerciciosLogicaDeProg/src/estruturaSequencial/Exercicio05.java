package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		//int cod1, cod2;
		int qte1, qte2;
	    double preco1, preco2, total;

	    //cod1 = scanner.nextInt();
	    qte1 = scanner.nextInt();
	    preco1 = scanner.nextDouble();
	    
	    //cod2 = scanner.nextInt();
	    qte2 = scanner.nextInt();
	    preco2 = scanner.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
	    scanner.close();
	}
}
