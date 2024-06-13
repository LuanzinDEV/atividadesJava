package main;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        
        // Adicionando produtos ao estoque
        estoque.adicionarProduto(1, "Produto A", 30, 5.0);
        estoque.adicionarProduto(2, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3, "Produto C", 1, 2.5);
        
        // Exibindo produtos
        System.out.println("Exibindo produtos no estoque:");
        estoque.exibirProdutos();
        
        // Calculando valor total do estoque
        double valorTotal = estoque.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: " + valorTotal);
        
        // Obtendo o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
        
        // Obtendo o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
        
        // Obtendo o produto com maior quantidade total em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade total em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
