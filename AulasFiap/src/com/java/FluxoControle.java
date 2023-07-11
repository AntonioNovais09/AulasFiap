package com.java;

public class FluxoControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 85;

		if (idade < 0)
			System.out.println("Idade Invalida");

		if (idade >= 18 && idade < 50)	{
			System.out.println("Maior Idade");
		} else if (idade >= 70 ) {
			System.out.println("Terceira Idade");
		 if (idade >=  100 ) {
				System.out.println("Centenria");
		
			}
		} else	
			System.out.println("Menor Idade");
	}	
	
}


