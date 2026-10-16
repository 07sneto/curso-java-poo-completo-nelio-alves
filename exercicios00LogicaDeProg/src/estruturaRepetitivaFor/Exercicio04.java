package estruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i=0; i<N; i++) {
			
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			
			if (n2 == 0) {
				System.out.println("Divisão impossível!");
			} else {
				double div = (double) n1 / n2;
				System.out.printf("%.1f",div);
			}
		}
		
		scanner.close();
	}
}
