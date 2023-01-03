package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Entitie_Ex21;

/*
 * A dona de um pessionato possui dez quartos numerados de 0 a 9. Faça um programa que inicie todos os 10 quartos
 * vazios e depois leia uma quantidade N de estudantes que vão alugar os quartos ( N de 1 a 10). Em seguida, registre
 * o aluguel dos N estudantes. Para cada registro de aluguel, informar nome e email dos estudantes, assim como qual
 * quarto escolheu. Suponha que sempre serão escolhidos quartos vagos. Ao final, imprimir relatorio de ocupacao
 * 
 * Exemplo: 
 * 
 * quantos quartos foram alugados: 1 
 * Inquilino #1
 * Nome: joaozinho zezinho
 * email: qualquercoisa@email.com
 * quarto: 5 
 * 
 * quartos ocupados: 
 * n do quarto - nome do inquilino - email do inquilino.
 */

public class Exercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos quartos serao alugados ? ");
		int n = sc.nextInt();
		
		Entitie_Ex21[] vetor = new Entitie_Ex21[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Inquilino #"+(1+i));
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Quarto: ");
			int quarto  = sc.nextInt();
		    vetor[i] = new Entitie_Ex21(nome, email, quarto);

		}
		
		System.out.println("Quantos quartos foram alugados:");
		System.out.println("- +"+n);
		
		 
		System.out.println("Quartos ocupados:");
		
		for(int i = 0; i<n; i++) {
		System.out.println(vetor[i].getQuarto()
				+": "
				+vetor[i].getNome()
				+", "
				+vetor[i].getEmail());
			
		}
		sc.close();
		
	}

}
