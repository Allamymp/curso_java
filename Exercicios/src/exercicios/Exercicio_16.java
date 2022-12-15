package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 

 */
public class Exercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double media = 0;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um numero:");
			vetor[i] = sc.nextDouble();
			media+= vetor[i];
		}
		
		System.out.printf("Media do vetor: %.3f",media/vetor.length);
		
		System.out.println("\nelementos abaixo da media:");
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i]<media/vetor.length) {
				System.out.printf(" - %.1f",vetor[i]);
			}
		}
		
		sc.close();

	}

}
