package exercicios;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj_sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite um numero: \n");
		float num= obj_sc.nextFloat();
		
		if(num%2==0) {
			System.out.printf("O numero %.2f e par", num);
		}
		else {
			System.out.printf("O numero %.2f e impar", num);
		}
		
		
		
		
		obj_sc.close();
	}

}
