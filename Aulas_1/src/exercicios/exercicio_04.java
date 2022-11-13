package exercicios;
import java.util.Scanner;

public class exercicio_04 {

	/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
	 * o valor que recebe por
	   hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, 
	   com duas casas decimais.
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matricula;
		double valor_hora, horas_trabalhadas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira o número do funcionário e pressione enter:\n");
		matricula = sc.nextInt();
		
		System.out.println("Por favor, insira o número de horas trabalhadas e pressione enter:\n");
		horas_trabalhadas=sc.nextDouble();
		
		System.out.println("Por favor, insira o número do valor/hora e pressione enter:\n");
		valor_hora = sc.nextDouble();
		
		System.out.printf("  Número do funcionário: %d\n  Salário: %.2f\n  ", matricula, (horas_trabalhadas * valor_hora));
 
		sc.close();
	}

}
