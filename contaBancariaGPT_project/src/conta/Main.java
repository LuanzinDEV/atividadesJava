package conta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria(1, 1000.5 , "Luan Tobias");
		
		do {
			System.out.println("Escolha uma opção");
			System.out.println("1-Depositar");
			System.out.println("2-Sacar");
			System.out.println("3-Ver dados da conta");
			System.out.println("0- Sair");
			
			opcao = scan.nextInt();
			
			switch(opcao) {
				case 1:
					conta.depositar(1000);
				break;
				case 2:
					conta.sacar(500);
				break;
				case 3:
					String dados = conta.toString();
					System.out.println(dados);
				break;
				default:
					System.out.println("Opção inválida");
			}
	
		}while(opcao != 0);
	}
}
