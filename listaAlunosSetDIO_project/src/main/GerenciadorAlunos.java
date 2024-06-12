package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	Set<Aluno> alunosSet;
	
	public GerenciadorAlunos() {
		alunosSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunosSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		boolean alunoExiste = false;
		Aluno alunoParaRemover = null;
		
		for(Aluno a : alunosSet) {
			if(a.getMatricula() == matricula) {
				alunoParaRemover = a;
				alunoExiste = true;
			}
		}
		
		if(alunoExiste) {
			alunosSet.remove(alunoParaRemover);
			System.out.println("Aluno removido com sucesso");
		}else {
			System.out.println("Aluno não encontrado");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		TreeSet<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunosSet);
		return alunosPorNota;
	}
	
	public Set<Aluno> exibirAlunos(){
		return alunosSet;
	}
}
