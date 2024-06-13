package main;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância do Dicionario
        Dicionario dicionario = new Dicionario();
        
        // Adiciona algumas palavras
        dicionario.adicionarPalavra("Casa", "Edificação destinada à habitação");
        dicionario.adicionarPalavra("Carro", "Veículo automotor de quatro rodas");
        dicionario.adicionarPalavra("Computador", "Máquina eletrônica de processamento de dados");

        // Exibe todas as palavras e definições
        System.out.println("Palavras no dicionário:");
        dicionario.exibirPalavras();
        
        // Pesquisa por uma palavra existente
        String definicaoCasa = dicionario.pesquisarPorPalavra("Casa");
        System.out.println("\nDefinição de 'Casa': " + definicaoCasa);
        
        // Pesquisa por uma palavra não existente
        String definicaoAviao = dicionario.pesquisarPorPalavra("Avião");
        System.out.println("Definição de 'Avião': " + definicaoAviao);
        
        // Remove uma palavra
        dicionario.removerPalavra("Carro");
        
        // Exibe novamente todas as palavras e definições
        System.out.println("\nPalavras no dicionário após remoção de 'Carro':");
        dicionario.exibirPalavras();
    }
}
