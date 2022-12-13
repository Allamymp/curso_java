package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Entitie_Ex12;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 

 */
public class Exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um numero N:");
		int n = sc.nextInt();
		Entitie_Ex12[] vetor = new Entitie_Ex12[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Insira o nome da pessoa:");
			String name = sc.next();

			System.out.println("Insira a idade da pessoa:");
			int idade = sc.nextInt();

			System.out.println("Insira a altura da pessoa:");
			double altura = sc.nextDouble();

			vetor[i] = new Entitie_Ex12(name, idade, altura);

		}

		double sum_altura = 0;
		for (int i = 0; i < vetor.length; i++) {

			sum_altura += vetor[i].getAltura();

		}

		System.out.printf(" Media de  altura =  %.2f", sum_altura / vetor.length);
		System.out.println("\nPessoas com menos de 16 anos: ");

		double sum_under16 = 0;
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i].getIdade() < 16) {
				System.out.println("- " + vetor[i].getName());
				sum_under16++;
			}
		}
		
		double percent_under16 = (sum_under16/vetor.length)*100;
		System.out.printf("Percentual: %.2f", percent_under16,"%");

		sc.close();

	}

}
