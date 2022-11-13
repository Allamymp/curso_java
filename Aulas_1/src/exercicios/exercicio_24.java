package exercicios;
import java.util.Scanner;


/*
 * Fazer um programa para ler um número inteiro positivo N. 
 * O programa deve então mostrar na tela N linhas, começando de 1 até N. 
 * Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
 *  conforme exemplo.
 */
public class exercicio_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira um numero inteiro");
		int n = sc.nextInt();
		
		for(float i =1 ; i<= n ; i++) {
			System.out.printf("%.0f",i);
			System.out.printf(" %.0f",Math.pow(i, 2));
			System.out.printf(" %.0f\n",Math.pow(i, 3));
		}
		
	}

}
