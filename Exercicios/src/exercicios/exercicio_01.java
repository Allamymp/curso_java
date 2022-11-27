package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.retangle;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	

		Scanner sc = new Scanner(System.in);
		retangle retangulo = new retangle();

		System.out.println("Insira o valor da Largura: \n");
		retangulo.width = sc.nextDouble();

		System.out.println("Insira o valor da Altura:\n");
		retangulo.height = sc.nextDouble();

		System.out.println("Area: " + retangulo.Area());
		System.out.println("\nPerimetro: " + retangulo.Perimeter());
		System.out.println("\nDiagonal: " + retangulo.Diagonal());
		
		sc.close();

	}

}
