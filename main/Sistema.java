package main;

public class Sistema {

	// classe e método para testar o sistema
	public static void main(String[] args) {

		// criando um cliente
		Cliente cliente = new Cliente("Benedito Rodrigo");

		// criando uma compra
		Compra compra1 = new Compra();

		// usando o primeiro construtor de Item
		compra1.adcionarItemCompra(new Produto("Notebook", 2000), 2);
		// usar o segundo construtor de Item
		compra1.adcionarItemCompra("Caneta", 1, 100);

		// criando outra compra
		Compra compra2 = new Compra();

		// usando o primeiro construtor de Item
		compra2.adcionarItemCompra(new Produto("Impressora", 1000), 1);
		// usando o segundo construtor de Item
		compra2.adcionarItemCompra("Caderno", 10, 10);

		cliente.realizarUmaCompra(compra1);
		cliente.realizarUmaCompra(compra2);

		double totalGastoPeloCliente = cliente.totalDeComprasPorCliente();
		System.out.println("Cliente gastou R$ " + totalGastoPeloCliente);
	}
}
