package main;

public class Item {
	
	//Item possui um produto associado e a quantidade
	int quantidade;
	Produto produto;
	
	//construtor da classe Item
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
}
