package exercicios;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Enunciado: Faça um programa para ler dois valores inteiros, 
		  e depois mostrar na tela a soma desses números com uma
		 mensagem explicativa, conforme exemplos.*/
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Por favor, insira um número inteiro e pressione ENTER\n");
		a = sc.nextInt();
		System.out.println(" Por favor, insira outro número inteiro e pressione ENTER\n");
		b = sc.nextInt();
		
		 System.out.printf("Entrada: 	        saida:\n%d 			SOMA=%d \n%d", a,a+b,b);
	 
		
		
		
		sc.close();
		
		
		
	}

}
