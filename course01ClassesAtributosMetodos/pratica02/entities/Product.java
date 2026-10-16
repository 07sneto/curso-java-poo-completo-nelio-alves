package entities;

public class Product {

	// atributos
	public String name;
	public double price;
	public int quantity;
	
	// função para calcular o valor em estoque
	public double totalValueInStock() {
		return price * quantity;
	}
	
	// função para adicionar produtos
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	// função para remover produtos
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
