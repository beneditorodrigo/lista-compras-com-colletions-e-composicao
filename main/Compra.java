package main;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//lista de itens para a compra
	List<Item> itens = new ArrayList<>();
	
	//vou criar dois metodos para adcionar itens na compra
	//um metodo com o Produto já instanciado anteriormente
	void adcionarItemCompra(Produto produto, int quantidade) {
		itens.add(new Item(produto, quantidade));
	}
	
	//outro método que instancia um novo Produto dentro do próprio método	
	void adcionarItemCompra(String nome, double preco, int quantidade) {
		//inferencia
		var produto = new Produto(nome, preco);
		itens.add(new Item(produto, quantidade));
	}
	
	//método para retornar o valor de uma compra
	double valorDaCompra() {
		double valorTotalDaCompra = 0;
		
		for(Item item : itens) {
			valorTotalDaCompra += item.quantidade * item.produto.preco;
		}
		
		return valorTotalDaCompra;
	}
}
