package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalagoLivros catalago = new CatalagoLivros();

        catalago.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalago.adicionarLivro("1984", "George Orwell", 1949);
        catalago.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalago.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

        String autor = "George Orwell";
        List<Livro> livrosPorAutor = catalago.pesquisarPorAutor(autor);
        System.out.println("Livros por " + autor + ":");
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro.getTitulo());
        }

        int anoInicial = 1900;
        int anoFinal = 1950;
        List<Livro> livrosPorIntervalo = catalago.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
        System.out.println("\nLivros publicados entre " + anoInicial + " e " + anoFinal + ":");
        for (Livro livro : livrosPorIntervalo) {
            System.out.println(livro.getTitulo() + " (" + livro.getAnoPublicacao() + ")");
        }

        String titulo = "O Pequeno Príncipe";
        Livro livroPorTitulo = catalago.pesquisarPorTitulo(titulo);
        if (livroPorTitulo != null) {
            System.out.println("\nLivro encontrado por título: " + livroPorTitulo.getTitulo());
        } else {
            System.out.println("\nLivro não encontrado por título: " + titulo);
        }
    }
}
