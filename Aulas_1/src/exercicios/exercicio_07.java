package exercicios;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não



public class exercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner obj_sc = new Scanner(System.in);
	
	System.out.println("Insira um númer:\n");
	float num = obj_sc.nextFloat();
	
	if(num==0) {
		System.out.printf("O número %.2f e nulo", num);
	}
	else {
		if(num>0) {
			System.out.printf("O número %.2f e não negativo", num);
		}
		else {
			System.out.printf("Onúmero %.2f e negativo", num);
		}
	}
	obj_sc.close();
	}
}
