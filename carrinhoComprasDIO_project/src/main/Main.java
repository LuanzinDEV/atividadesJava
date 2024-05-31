package main;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Camiseta", 10, 2);
        carrinho.adicionarItem("Calça Jeans", 10, 1);
        carrinho.adicionarItem("Tênis", 10, 1);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        double total = carrinho.calcularValorTotal();
        System.out.println("Valor total: $" + total);

        carrinho.removerItem("Camiseta");

        System.out.println("\nItens no carrinho após a remoção:");
        carrinho.exibirItens();

        total = carrinho.calcularValorTotal();
        System.out.println("Valor total após a remoção: $" + total);
    }
}
