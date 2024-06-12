package main;

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastro = new CadastroProduto();
        
        // Adicionando alguns produtos
        cadastro.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto B", 5.0, 10);
        cadastro.adicionarProduto(3, "Produto C", 15.0, 3);
        
        // Exibindo produtos por nome
        System.out.println("Produtos por nome:");
        for (Produto produto : cadastro.exibirProdutosPorNome()) {
            System.out.println(produto);
        }
        
        // Exibindo produtos por preço
        System.out.println("\nProdutos por preço:");
        for (Produto produto : cadastro.exibirProdutosPorPreco()) {
            System.out.println(produto);
        }
    }
}
