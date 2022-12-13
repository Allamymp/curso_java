package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 

 */

public class Exercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros ira inserir ?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i<vetor.length; i++) {
			
			System.out.println("Digite um numero: ");
			vetor[i]=sc.nextDouble();
		}
		
		double maior_num=0;
		int posicao_maiorNum=0;
		
		for(int i = 0; i<vetor.length; i++) {
			
			if(vetor[i]>maior_num) {
				
				maior_num = vetor[i];
				posicao_maiorNum = i;
			}
		}
		System.out.println("Maior valor: " + maior_num);
		System.out.println("Posicao do maior valor: "+posicao_maiorNum);
		sc.close();
		
		

	}

}
