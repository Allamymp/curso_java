package exercicios;

import java.util.Scanner;


/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
 Atenção: os números devem poder ser digitados em  ordem crescente ou decrescente.*/


public class exercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj_scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o numero A: \n");
		float num_a = obj_scanner.nextFloat( );
		
		System.out.println("Por favor, digite o numero B: \n");
		float num_b = obj_scanner.nextFloat();
		
		if(num_a%num_b==0 || num_b%num_a==0){
			
			System.out.printf("Os numeros %.2f e %.2f sao multiplos", num_a, num_b);
		}
		
		else {
			System.out.printf("Os numeros %.2f e %.2f nao sao multiplos", num_a, num_b);
		}
		
		obj_scanner.close();
	}

}
