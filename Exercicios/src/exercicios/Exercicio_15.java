package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores tera cada vetor?");
		int n = sc.nextInt();

		int[] vetor_a = new int[n];
		int[] vetor_b = new int[n];
		int[] vetor_c = new int[n];

		System.out.println("Digite os valores do vetor A ");
		for (int i = 0; i < vetor_a.length; i++) {

			System.out.println("Insira um numero: ");
			vetor_a[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B ");
		for (int i = 0; i < vetor_b.length; i++) {

			System.out.println("Insira um numero: ");
			vetor_b[i] = sc.nextInt();
		}

		System.out.println("Vetor resultante(C) :");
		for (int i = 0; i < vetor_c.length; i++) {

			vetor_c[i]=vetor_a[i]+ vetor_b[i];
			System.out.println(vetor_c[i]);
		}
		sc.close();

	}

}
