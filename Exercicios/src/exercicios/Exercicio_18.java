package exercicios;

import java.util.Locale;
import java.util.Scanner;


/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
 */
public class Exercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digita: ");
		int n = sc.nextInt();
	
		String[] vetor_nome = new String[n];
		int[] vetor_idade = new int[n];
		int pos_maisVelho = 0;
		
		for(int i=0; i<vetor_nome.length;i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.println("Nome:");
			vetor_nome[i] = sc.next();
			System.out.println("Idade:");
			vetor_idade[i] = sc.nextInt();
			if(vetor_idade[i]>vetor_idade[pos_maisVelho]) {
				pos_maisVelho = i;
			}
		}
		
		System.out.println("Pessoa mais velha: "+ vetor_nome[pos_maisVelho]);
		
		sc.close();

	}

}
