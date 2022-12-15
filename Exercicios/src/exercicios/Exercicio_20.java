package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities_Ex20;

/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 

 */

public class Exercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao inseridas?");
		int n = sc.nextInt();

		Entities_Ex20[] vetor = new Entities_Ex20[n];
		double maior_altura = 0;
		double menor_altura = 999999999;
		double mediaAlt_fem = 0;
		int total_homens = 0;

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Altura da " + (i + 1) + "a pessoa");
			double altura = sc.nextDouble();

			System.out.println("Genero da " + (i + 1) + "a pessoa(M/F): ");
			String genero = sc.next();

			vetor[i] = new Entities_Ex20(genero, altura);

			if (altura > maior_altura) {
				maior_altura = altura;
			}
			if (altura < menor_altura) {
				menor_altura = altura;
			}
			if (genero.equals("M") ) {
				total_homens++;
			} else {
				mediaAlt_fem += altura;
			}

		}
		
		mediaAlt_fem= mediaAlt_fem/vetor.length;
		System.out.println("Menor altura: " +menor_altura);
		System.out.println("Maior altura: "+ maior_altura);
		System.out.println("Media altura feminina: "+mediaAlt_fem );
		System.out.println("Numero de homens: "+total_homens);

		sc.close();
	}

}
