package main;

import java.util.ArrayList;

public class SomaNumeros {
	ArrayList<Integer> numerosList;
	
	public SomaNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
			numerosList.add(numero);
	}
	
	public Integer calcularSoma() {
		Integer soma = 0;
		
		if(!numerosList.isEmpty())
		{
			for(Integer i : numerosList)
			{
				soma += i;
			}
		}
		return soma;
	}
	
	public Integer encontrarMaiorNumero() {
		Integer maiorNumero = 0;
		
		if(!numerosList.isEmpty())
		{
			for(Integer i : numerosList)
			{
				if(i >= maiorNumero)
				{
					maiorNumero = i;
				}
			}
		}
		return maiorNumero;
	}

	public String exibirNumeros() {
	    StringBuilder numeros = new StringBuilder();
	    
	    for (Integer num : numerosList) {
	        numeros.append(num).append(" ");
	    }
	    return "Números: " + numeros.toString();
	}

	
	
}
