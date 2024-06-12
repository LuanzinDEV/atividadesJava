package main;

public class Main {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando algumas tarefas
        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("Fazer compras");
        listaTarefas.adicionarTarefa("Estudar para o exame");

        // Exibindo as tarefas
        System.out.println("Tarefas:");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas
        System.out.println("Número de tarefas: " + listaTarefas.contarTarefas());

        // Marcando uma tarefa como concluída
        listaTarefas.marcarTarefaConcluida("Fazer compras");

        // Exibindo as tarefas concluídas e pendentes
        System.out.println("\nTarefas Concluídas:");
        listaTarefas.obterTarefasConcluidas().forEach(System.out::println);

        System.out.println("\nTarefas Pendentes:");
        listaTarefas.obterTarefasPendentes().forEach(System.out::println);

        // Marcando uma tarefa como pendente
        listaTarefas.marcarTarefaPendente("Fazer compras");

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Lavar o carro");

        // Exibindo as tarefas após remoção
        System.out.println("\nTarefas após remoção:");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();

        // Exibindo as tarefas após limpeza
        System.out.println("\nTarefas após limpeza:");
        listaTarefas.exibirTarefas();
    }
}
