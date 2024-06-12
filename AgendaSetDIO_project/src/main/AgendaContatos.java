package main;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	Set<Contato> contatosSet;
	
	public AgendaContatos() {
		contatosSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		for(Contato c : contatosSet) {
			System.out.println(c);
		}
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : contatosSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}

		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		
		for(Contato c : contatosSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
			}
		}
		return contatoAtualizado;
	}
}
