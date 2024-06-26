package main;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> comprasList;
	
	public CarrinhoDeCompras() {
		this.comprasList =  new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		comprasList.add(new Item(nome, quantidade, preco));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		for(Item item : comprasList) 
		{
			if(item.getNome().equalsIgnoreCase(nome))
			{
				itensParaRemover.add(item);
			}
		}
		
		comprasList.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		
		for(Item item : comprasList)
		{
			 valorTotal += item.getPreco();
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		for(Item item : comprasList)
		{
			System.out.println("Item: " + item.getNome() + ", preço: " + item.getPreco() + ", quantidade: " + item.getQuantidade());
		}
	}
}
