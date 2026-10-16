package application;

import java.util.Scanner;

import entities.Product;

public class Program02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// importação da classe Product
		Product product = new Product();
		
		// guardando as informações do produto
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scanner.nextLine();
		System.out.print("Price: ");
		product.price = scanner.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scanner.nextInt();
		
		
		// imprimindo e atualizando o produto
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		scanner.close();
	}
}
