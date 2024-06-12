package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	Set<Produto> produtosSet;
	
	public CadastroProduto() {
		produtosSet= new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtosSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
	    TreeSet<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
	    produtosPorPreco.addAll(produtosSet);
	    return produtosPorPreco;
	}
}
