package exercicios;

import java.util.Scanner;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do 
 * primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */


public class exercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira um numero inteiro\n");
		int n = sc.nextInt();
		
		for(int i =1 ; i<=n ; i++) {
			
			System.out.println("Por favor insira um numero\n");
			int a = sc.nextInt();
			System.out.println("Por favor insira um numero novamente\n");
			int b = sc.nextInt();
			
			if(a!=0) {
			System.out.printf("%d dividido por %d igual a : %d\n", a,b,a/b);
			}
			else {
				System.out.println("Divisao impossivel");
			}
		}
		sc.close();
	}

}
