package gerenciamentoFuncionarioGPT_project;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;

	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public void setIdade(int idade) {
		 this.idade = idade;
	 }
}
