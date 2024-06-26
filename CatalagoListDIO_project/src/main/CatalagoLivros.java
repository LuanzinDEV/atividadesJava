package main;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
	List<Livro> livroList;
	
	public CatalagoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livroPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) 
		{
			for(Livro l : livroList) 
			{
				if(l.getAutor().equalsIgnoreCase(autor)) 
				{
					livroPorAutor.add(l);
				}
			}
		}
		
		return livroPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livroPorIntervalo = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList)
			{
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) 
				{
					livroPorIntervalo.add(l);
				}
			}
		}
		
		return livroPorIntervalo;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!livroList.isEmpty())
		{
			for(Livro l : livroList)
			{
				if(l.getTitulo().equalsIgnoreCase(titulo))
				{
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;
	}
}
