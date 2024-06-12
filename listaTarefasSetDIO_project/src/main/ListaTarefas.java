package main;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	Set<Tarefa> tarefasSet;
	
	public ListaTarefas() {
		tarefasSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao){
		tarefasSet.add(new Tarefa(descricao, false));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover= null;
		boolean tarefaExiste = false;
		
		for(Tarefa t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
				tarefaExiste = true;
				break;
			}
		}
		
		if(tarefaExiste) {
			tarefasSet.remove(tarefaParaRemover);
			System.out.println("Tarefa removida com sucesso");
		}else {
			System.out.println("Tarefa não encontrada");
		}
	}
	
	public void exibirTarefas() {
		
		for(Tarefa t : tarefasSet) {
			System.out.println(t);
		}
		
	}
	
	public int contarTarefas() {
		return tarefasSet.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		
		for(Tarefa t : tarefasSet) {
			if(t.isRealizada() == true) {
				tarefasConcluidas.add(t);
			}
		}
		
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
		for(Tarefa t : tarefasSet) {
			if(t.isRealizada() == false) {
				tarefasPendentes.add(t);
			}
		}
		
		return tarefasPendentes;
	}
	
	
	public void marcarTarefaConcluida(String descricao) {
		
		
		for(Tarefa t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setRealizada(true);
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		
		for(Tarefa t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setRealizada(false);
			}
		}
	}
	
	public void limparListaTarefas() {
		tarefasSet.removeAll(tarefasSet);
	}
	
	
}
