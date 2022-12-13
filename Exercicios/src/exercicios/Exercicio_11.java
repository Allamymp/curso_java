package exercicios;

import java.util.Locale;
import java.util.Scanner;


/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Exercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
	
		
		
		System.out.println("Insira um valor N: ");
		int n = sc.nextInt();
		double[] array = new double[n];
		
		for(int i = 0; i<array.length; i++) {
			
			System.out.println("Insira um numero real : ");
			array[i]= sc.nextDouble();
		}
		double sum = 0;
		   for(int i = 0; i<array.length; i++) {
				
			   sum+= array[i];
			}
	   System.out.println("Elementos do vetor: ");
	   for(int i = 0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");
		 
		}
	   
	   
	   
	   System.out.println("\nSoma dos elementos do vetor: " + sum);
	   System.out.println("Media dos elementos do vetor: " + sum/array.length);
	   sc.close();
	}

}
