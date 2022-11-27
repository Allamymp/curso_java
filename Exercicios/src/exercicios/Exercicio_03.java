package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
 * trimestres do ano (primeiro trimestre vale 0 a 30, segundo e terceiro 0 a 35 cada). 
 * Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado 
 * ( PASS) ou não  * (FAILED) e, em caso  negativo, quantos pontos faltam para o aluno obter 
 * o mínimo para ser  * aprovado (60% da nota ). Você deve criar uma classe Student para 
 * resolver o problema. 
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		
		System.out.println("Insira o nome do aluno: ");
		estudante.name = sc.nextLine();
		System.out.println("Insira a nota do primeiro Trimestre: ");
		estudante.notaA = sc.nextDouble();
		System.out.println("Insira a nota do segundo Trimestre: ");
		estudante.notaB = sc.nextDouble();
		System.out.println("Insira a nota do terceiro Trimestre: ");
		estudante.notaC = sc.nextDouble();
		
		System.out.println("Nota final: "+ estudante.nota_final());
		estudante.pontos_faltando();
		
		sc.close();
		

	}

}
