package main;

public class Main {
    public static void main(String[] args) {
        // Criando um conjunto de convidados
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        
        // Adicionando alguns convidados
        conjunto.adicionarConvidado("João", 1001);
        conjunto.adicionarConvidado("Maria", 1002);
        conjunto.adicionarConvidado("Pedro", 1003);
        
        // Exibindo os convidados
        System.out.println("Lista de convidados:");
        conjunto.exibirConvidados();
        
        // Removendo um convidado pelo código do convite
        conjunto.removerConvidadoPorCodigoConvite(1002);
        
        // Exibindo os convidados após a remoção
        System.out.println("\nLista de convidados após remoção:");
        conjunto.exibirConvidados();
        
        // Contando o número de convidados
        System.out.println("\nNúmero total de convidados: " + conjunto.contarConvidados());
    }
}
