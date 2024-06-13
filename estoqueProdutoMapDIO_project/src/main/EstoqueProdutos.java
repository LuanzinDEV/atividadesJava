package main;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	Map<Integer, Produto> estoqueProdutoMap;
	
	public EstoqueProdutos() {
		estoqueProdutoMap = new HashMap<>();
	}
	
	public void adicionarProduto(int cod, String nome, int quantidade, double preco) {
		estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}			
		}
		
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if(produtoMaisCaro == null || p.getPreco() > produtoMaisCaro.getPreco()) {
					produtoMaisCaro = p;
				}
			}			
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if(produtoMaisBarato == null || p.getPreco() < produtoMaisBarato.getPreco()) {
					produtoMaisBarato = p;
				}
			}			
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeTotal =  null;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if(produtoMaiorQuantidadeTotal == null || p.getPreco() * p.getQuantidade() > produtoMaiorQuantidadeTotal.getPreco() * produtoMaiorQuantidadeTotal.getQuantidade()) {
					produtoMaiorQuantidadeTotal = p;
				}
			}			
		}
		return produtoMaiorQuantidadeTotal;
	}
}
