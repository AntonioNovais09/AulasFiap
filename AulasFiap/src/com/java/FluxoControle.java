package com.java;

import java.util.Scanner;

public class FluxoControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt ();
		
		

		if (idade < 0)
			System.out.println("Idade Invalida");

		if (idade >= 18 && idade < 70)	{
			System.out.println("Maior Idade");
			
		} else if (idade >= 70 && idade <= 100 ) {
			System.out.println("Terceira Idade");

			if (idade >=  100 ) {
				System.out.println("Centenria");

			}
		} else	
			System.out.println("Menor Idade");
	}	

}


