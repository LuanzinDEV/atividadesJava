package OrdenacaoPessoa_Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
		
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>();
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>();
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		
		return pessoasPorAltura;
	}
	
	
}
