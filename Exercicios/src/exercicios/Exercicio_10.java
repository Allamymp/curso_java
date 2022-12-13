package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */

public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor N ( maximo = 10): ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i< vetor.length; i++) {
			
			System.out.println("Insira um numero inteiro: ");
			vetor[i]= sc.nextInt();
		}
		
		System.out.println("Os numeros negativos inseridos foram : ");
		
		for(int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] < 0) {
				System.out.print(" "+ vetor[i]+",");
			}
		}
		
		sc.close();
		
	}

}
