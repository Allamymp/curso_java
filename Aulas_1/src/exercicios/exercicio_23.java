package exercicios;

import java.util.Scanner;

/*
 * Ler um número inteiro N e calcular todos os seus divisores.
 */

public class exercicio_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Por favor, insira um numero inteiro");
		int n = sc.nextInt();
		System.out.println("Divisores: \n");
		
		for(int i = 1 ; i<=n ; i++) {
			if(n%i==0) {
				System.out.printf("%d\n",i);
			}
		}
		
		sc.close();
	}

}
