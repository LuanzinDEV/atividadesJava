package gerenciamentoFuncionarioGPT_project;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public double calcularBonus() {
        double bonus = (getSalario() * 20) / 100;
        return bonus;
    }
}
