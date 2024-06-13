package main;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionar contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Carol", 555666777);

        // Exibir contatos
        System.out.println("Contatos após adicionar:");
        agenda.exibirContatos();

        // Pesquisar por nome
        System.out.println("Pesquisando por Alice: " + agenda.pesquisarPorNome("Alice"));
        System.out.println("Pesquisando por Carol: " + agenda.pesquisarPorNome("Carol"));
        System.out.println("Pesquisando por Dave (não existente): " + agenda.pesquisarPorNome("Dave"));

        // Remover contato
        agenda.removerContato("Bob");

        // Exibir contatos após remoção
        System.out.println("Contatos após remover Bob:");
        agenda.exibirContatos();
    }
}
