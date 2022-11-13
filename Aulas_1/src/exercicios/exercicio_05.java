package exercicios;

import java.util.Scanner;



  /*  Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
   *  o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o 
   *  valor a ser pago */

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod1,cod2,numpcs1,numpcs2;
		double valor1,valor2,total;
		
		
		Scanner obj_sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira o cod de peças do tipo 1:\n");
		cod1 = obj_sc.nextInt();
		
		System.out.println("Por favor, insira o cod de peças do tipo 2:\n");
		cod2 = obj_sc.nextInt();
		
		System.out.println("Por favor, insira o número de peças do tipo 1:\n");
		numpcs1 = obj_sc.nextInt();
		
		System.out.println("Por favor, insira o número de peças do tipo 2:\n");
		numpcs2 = obj_sc.nextInt();
		
		System.out.println("Por favor, insira o valor de peças do tipo 1:\n");
		valor1 = obj_sc.nextDouble();
		
		System.out.println("Por favor, insira o valor de peças do tipo 2:\n");
		valor2 = obj_sc.nextDouble();
		
		total = (numpcs1*valor1) + (numpcs2*valor2);
		System.out.printf("\nValor Total: %.2f", total);
		
		
		
		obj_sc.close();
	}

}
