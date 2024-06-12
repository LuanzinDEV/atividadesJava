package main;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da AgendaContatos
        AgendaContatos agenda = new AgendaContatos();
        
        // Adicionando alguns contatos
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Pedro", 111222333);
        
        // Exibindo todos os contatos
        System.out.println("Todos os contatos:");
        agenda.exibirContatos();
        
        // Pesquisando contatos por nome
        System.out.println("\nContatos com nome iniciado por 'M':");
        Set<Contato> contatosPorNome = agenda.pesquisarPorNome("M");
        for (Contato c : contatosPorNome) {
            System.out.println(c);
        }
        
        // Atualizando número de um contato
        System.out.println("\nAtualizando número do contato 'João' para 999999999:");
        Contato contatoAtualizado = agenda.atualizarNumeroContato("João", 999999999);
        if (contatoAtualizado != null) {
            System.out.println("Número atualizado com sucesso: " + contatoAtualizado);
        } else {
            System.out.println("Contato 'João' não encontrado.");
        }
        
        // Exibindo todos os contatos após a atualização
        System.out.println("\nTodos os contatos após a atualização:");
        agenda.exibirContatos();
    }
}