package main;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
	Set<String> conjuntoPalavrasSet;
	
	public ConjuntoPalavras() {
		conjuntoPalavrasSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		conjuntoPalavrasSet.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		conjuntoPalavrasSet.remove(palavra);
	}
	
	public void verificarPalavra(String palavra) {
		boolean encontrada = false;
		
		for(String p : conjuntoPalavrasSet) {
			if(p.equals(palavra)) {
				encontrada = true;
			}
		}
		
		if (encontrada) {
	        System.out.println("A palavra " + palavra + " existe");
	    } else {
	        System.out.println("A palavra " + palavra + " não existe");
	    }
	}
	
	public void exibirPalavrasUnicas() {
		for(String p : conjuntoPalavrasSet) {
			System.out.println(p);
		}
	}
	
}
