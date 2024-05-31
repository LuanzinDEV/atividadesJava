package gerenciamentoFuncionarioGPT_project;

public class Programador extends Funcionario{
    private String linguagem;

	public Programador(String nome, int idade, double salario, String linguagem) {
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }

    public String getlinguagem() {
        return linguagem;
    }
    
    public double calcularBonus() {
        double bonus = (getSalario() * 10) / 100;
        return bonus;
    }
}
