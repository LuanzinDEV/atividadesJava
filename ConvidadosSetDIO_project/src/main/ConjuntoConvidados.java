package main;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	Set<Convidado> convidadosList;
	
	public ConjuntoConvidados() {
		convidadosList = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadosList.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		
		for(Convidado c : convidadosList) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
			}
		}
		
		convidadosList.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadosList.size();
	}
	
	public void exibirConvidados() {
		for(Convidado c : convidadosList) {
			System.out.println(c);
		}
	}
}