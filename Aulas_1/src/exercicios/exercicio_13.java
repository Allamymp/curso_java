package exercicios;

import java.util.Scanner;


//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.
public class exercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj_scanner = new Scanner(System.in);
		
		System.out.println("Por favor, insira o valor de x\n");
		double valor_x = obj_scanner.nextDouble();
		
		System.out.println("Por favor, insira o valor de y\n");
		double valor_y = obj_scanner.nextDouble();
		
		
		if(valor_x==0 && valor_y==0) {
			System.out.println("Origem");
		}
		
		else if ( valor_x==0) {
			System.out.println("Eixo X");
		}
		
		else if(valor_y==0) {
			System.out.println("Eixo Y");
		}
		
		
		else{
		
			if(valor_x>0 && valor_y>0) {
				System.out.println("Q1");
			}
		
			else if(valor_x>0 && valor_y<0) {
				System.out.println("Q4");
			}
			else if(valor_x<0 && valor_y>0){
				System.out.println("Q2");
			
			}
			else {
				System.out.println("Q3");
			}
		}
		obj_scanner.close();

	}
	}
