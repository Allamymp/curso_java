package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

/*
 * fazer um programa para ler um numero inteiro N e os dados ( nome e preco ) de N produtos.  Armazene os N produtos
 * em um vetor. Em seguida, mostraro preco medio dos n produtos.
 */

public class Exercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de N");
		int n = sc.nextInt();
		
		Produtos[] vetor = new Produtos[n];
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Insira o nome do produto:");
			String name = sc.next();
			System.out.println("Insira o valor do produto:");
			double price = sc.nextDouble();
			vetor[i] = new Produtos(name,price);
			 
		}
		
		double media = 0;
		for(int i =0; i<vetor.length ; i++) {
			
			media += vetor[i].getProduct_price();
		}
		
		System.out.printf("Media de precos: %.2f", media/vetor.length);
		
		sc.close();
		
		 
	}

}
