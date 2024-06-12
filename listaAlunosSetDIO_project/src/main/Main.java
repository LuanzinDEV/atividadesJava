package main;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        // Adicionando alguns alunos
        gerenciador.adicionarAluno("João", 123456L, 8.5);
        gerenciador.adicionarAluno("Maria", 654321L, 7.2);
        gerenciador.adicionarAluno("Pedro", 987654L, 6.8);

        // Exibindo todos os alunos
        System.out.println("Todos os alunos:");
        Set<Aluno> todosAlunos = gerenciador.exibirAlunos();
        exibirAlunos(todosAlunos);

        // Removendo um aluno
        System.out.println("\nRemovendo aluno com matrícula 654321...");
        gerenciador.removerAluno(654321L);
        
        // Exibindo alunos por nome
        System.out.println("\nAlunos ordenados por nome:");
        Set<Aluno> alunosPorNome = gerenciador.exibirAlunosPorNome();
        exibirAlunos(alunosPorNome);

        // Exibindo alunos por nota
        System.out.println("\nAlunos ordenados por nota:");
        Set<Aluno> alunosPorNota = gerenciador.exibirAlunosPorNota();
        exibirAlunos(alunosPorNota);
    }

    public static void exibirAlunos(Set<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
