package main;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// cada cliente possui um nome e uma lista de compras
	String nome;
	List<Compra> compras = new ArrayList<>();

	// Construtor da classe cliente
	Cliente(String nome) {
		this.nome = nome;
	}

	// cliente fazendo uma compra
	void realizarUmaCompra(Compra compra) {
		compras.add(compra);
	}

	// total gasto por um cliente em todas as compras
	double totalDeComprasPorCliente() {
		double totalGastoPorCliente = 0;

		for (Compra compra : compras) {
			totalGastoPorCliente += compra.valorDaCompra();
		}

		return totalGastoPorCliente;
	}
}
