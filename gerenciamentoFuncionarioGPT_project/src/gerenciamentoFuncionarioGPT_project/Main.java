package gerenciamentoFuncionarioGPT_project;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente("Emersin", 100, 2000, "T.I");
		Programador programador = new Programador("Luan", 21, 10000000, "T.I");

		System.out.println("O bonus do gerente é:  " + gerente.calcularBonus());

		System.out.println("O bonus do programador é:  " + programador.calcularBonus());
	}

}
