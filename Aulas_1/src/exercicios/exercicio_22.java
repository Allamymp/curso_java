package exercicios;

import java.util.Scanner;

/* Ler um valor N. Calcular e escrever seu respectivo fatorial. 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
   Lembrando que, por definição, fatorial de 0 é 1. 
 */

public class exercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero");
		float n = sc.nextFloat();
		float fatorial = 1;
		
		for (float i = 1 ; i<= n ; i++) {
		 fatorial *=  i; 
			
		}
		System.out.printf("Resultado: %.1f", fatorial);
		sc.close();
	}

}