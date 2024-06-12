package main;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavras conjunto = new ConjuntoPalavras();

        // Adicionando algumas palavras
        conjunto.adicionarPalavra("cachorro");
        conjunto.adicionarPalavra("gato");
        conjunto.adicionarPalavra("elefante");

        // Exibindo todas as palavras únicas
        System.out.println("Palavras únicas no conjunto:");
        conjunto.exibirPalavrasUnicas();

        // Verificando se uma palavra existe no conjunto
        conjunto.verificarPalavra("cachorro"); // Deve imprimir "A palavra cachorro existe"
        conjunto.verificarPalavra("papagaio"); // Deve imprimir "A palavra papagaio não existe"

        // Removendo uma palavra
        conjunto.removerPalavra("cachorro");

        // Exibindo todas as palavras únicas após a remoção
        System.out.println("\nPalavras únicas no conjunto após a remoção:");
        conjunto.exibirPalavrasUnicas();
    }
}
