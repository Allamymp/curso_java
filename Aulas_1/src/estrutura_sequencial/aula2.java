package estrutura_sequencial;

import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char n;

		System.out.println("Por favor, digite uma string e pressione ENTER:\n");
		x = sc.next();
		n = x.charAt(0);
		System.out.println("\nPor favor, digite um número inteiro e pressione ENTER:\n");
		y = sc.nextInt();
		System.out.println("\nPor favor, digite um número Racional e pressione ENTER:\n");
		z = sc.nextDouble();
		System.out.println("\nVoce digitou a string: " + x);
		System.out.println("\nVoce digitou o número inteiro: " + y);
		System.out.println("\nVoce digitou o número racional: " + z);
		System.out.println("\nA primeira letra da string foi: " + n);

		sc.close();
	}
}
