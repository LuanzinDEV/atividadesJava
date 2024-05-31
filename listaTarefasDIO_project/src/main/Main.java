package main;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Comprar leite");
        listaTarefas.adicionarTarefa("Estudar para a prova");
        listaTarefas.adicionarTarefa("Pagar contas");

        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        System.out.println("Descrições das tarefas:");
        listaTarefas.obterDescricoesTarefas();

        listaTarefas.removerTarefa("Estudar para a prova");
        System.out.println("Número total de tarefas após remover uma tarefa: " + listaTarefas.obterNumeroTotalTarefas());

        System.out.println("Descrições das tarefas após remover uma tarefa:");
        listaTarefas.obterDescricoesTarefas();
    }
}
