package exercicios;

import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
 * Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/




public class exercicio_06 {
	public static void main(String[] args) {
	
		float a,b,c;
		final double pi = 3.14159;
		
		Scanner obj_sc = new Scanner(System.in);
		
		System.out.println(" Por favor, insira o valor de A: \n");
		a = obj_sc.nextFloat();
		
		System.out.println(" Por favor, insira o valor de B: \n");
		b = obj_sc.nextFloat();
		
		System.out.println(" Por favor, insira o valor de C: \n");
		c = obj_sc.nextFloat();
		
		System.out.printf("\n Area triangulo retangulo : %.3f",((a*c)/2));
		System.out.printf("\n Area do circulo  : %.3f", pi*(c*c));
		System.out.printf("\n Area do trapezio : %.3f", (0.5*c)*(a+b));
		System.out.printf("\n Area do quadrado : %.3f",b*b);
		System.out.printf("\n Area do Retangulo: %.3f",a*b);
		
		
		obj_sc.close();
		
	}
}
