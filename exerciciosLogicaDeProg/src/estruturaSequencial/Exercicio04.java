package estruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number, hours;
		double hourlyRate, salary;
		
		number = scanner.nextInt();
		hours = scanner.nextInt();
		hourlyRate = scanner.nextDouble();
		
		salary = hourlyRate * hours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = %.2f%n", salary);
		
		scanner.close();
	}
}