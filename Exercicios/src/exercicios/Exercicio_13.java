package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

public class Exercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		int total_par = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Insira um valor: ");
			int valor = sc.nextInt();
			vetor[i] = valor;
				
			}
		
		System.out.println("Numeros pares: ");
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i]%2==0) {
				total_par++;
				System.out.print(vetor[i] + "  ");
				
		}
			}
		System.out.println("\nTotal de numeros pares: "+total_par);
		
		sc.close();
			
		}
		

	}


