package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área 
		deste círculo com quatro casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159 */

		double raio;
		final double pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		 
		System.out.println("Insira o Raio do círculo");
		raio = sc.nextDouble();
		System.out.printf(" \n Área = %.4f", pi*(raio*raio));
		 
		 sc.close();
	}
}
