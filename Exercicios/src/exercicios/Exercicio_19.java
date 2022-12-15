package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */

public class Exercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos alunos serao inseridos?");
		int n = sc.nextInt();
		
		String[] vetor_nome  = new String[n];
		double[] vetor_nota1 = new double[n];
		double[] vetor_nota2 = new double[n];
		
		for(int i = 0; i< vetor_nome.length; i++) {
			
			System.out.println("Digite o nome do "+(i+1)+"a aluno: ");
			sc.nextLine();
			vetor_nome[i] = sc.nextLine();
			
			System.out.println("Digite a nota do primeiro semestre: ");
			vetor_nota1[i] = sc.nextDouble();
			
			System.out.println("Digite a nota do segundo semestre: ");
			vetor_nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<vetor_nome.length; i++) {
			
			double media = (vetor_nota1[i]+vetor_nota2[i])/2;
			if(media>=6) {
				System.out.println(vetor_nome[i]);
			}
		}
		
		sc.close();

	}

}