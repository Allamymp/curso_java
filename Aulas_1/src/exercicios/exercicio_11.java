package exercicios;
import java.util.Scanner;

// Com base na tabela abaixo, escreva um programa que leia o código de um item 
// e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
/* 			cod 			item			            valor
 * 			1               Cachorro quente              R$4,00
 * 			2               x-salada                     R$4,50
 * 			3               x-bacon                      R$5,00
 * 			4               torrada simples              R$2,00
 *			5               refrigerante                 R$1,50
 */


public class exercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj_scanner = new Scanner(System.in);
		
		System.out.println("Por favor, insira o codigo do produto: \n");
		int cod_produto = obj_scanner.nextInt();
		
		System.out.println("Por favor, insira a quantidade de itens do produto: \n");
		int quant_produto = obj_scanner.nextInt();
		
		double valor_produto = 0;
		switch(cod_produto) {
		
		case 1:
			valor_produto = 4;
			break;
		
		case 2:
			valor_produto = 4.5;
			break;
		case 3:
			valor_produto = 5;
			break;
		case 4:
			valor_produto = 2;
			break;
		case 5:
			valor_produto = 1.5;
			break;
		
		default: 
			System.out.println("Codigo invalido!");
		}
		
		System.out.printf("Total: R$%.2f", quant_produto * valor_produto);
		
		
		obj_scanner.close();
	}

}
