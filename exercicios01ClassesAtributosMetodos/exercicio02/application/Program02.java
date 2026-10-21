package application;

import java.util.Scanner;

import entities.Employee;

public class Program02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = scanner.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = scanner.nextDouble();
		System.out.print("Tax: ");
		employee.tax = scanner.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? % ");
		double percentage = scanner.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		scanner.close();
	}
}
