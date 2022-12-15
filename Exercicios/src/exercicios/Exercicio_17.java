package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

 */

public class Exercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos o vetor tera?");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		int sum_par = 0;
		int total_par = 0;

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Digite um numero:");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {

				sum_par += vetor[i];
				total_par++;
			}
		}

		if (sum_par != 0) {
			double media_par = sum_par/total_par;
			System.out.printf("Media dos pares: %.1f",media_par);
		} else {
			System.out.println("Nenhum numero par!");
		}

		sc.close();

	}

}
