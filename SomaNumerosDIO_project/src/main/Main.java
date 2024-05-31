package main;

public class Main {

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(15);
        
        System.out.println("Números adicionados:");
        System.out.println(somaNumeros.exibirNumeros());
        
        System.out.println("\nSoma dos números: " + somaNumeros.calcularSoma());
        
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
    }
}