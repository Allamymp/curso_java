package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * FAzer um proograma para ler um numero inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor.
 * em seguida, mostrar a altura média dessas pessoas.
 */

public class Exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n, media_index;
		double media_altura = 0;
		double[] altura_array;

		System.out.println("Insira um valor inteiro N: ");
		n = sc.nextInt();
		altura_array = new double[n];

		media_index = 0;

		for (int i = 0; i < n; i++) {

			System.out.println("Por favor, insira a altura: ");
			altura_array[i] = sc.nextDouble();
			media_altura += altura_array[i];
			media_index++;
		}
		System.out.println("Altura media: " + media_altura / media_index);

		sc.close();
	}

}
