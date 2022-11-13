package exercicios;

import java.util.Scanner;

// Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
// pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em 
// benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
// Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
// segundo a tabela abaixo.
// de 0 a 2000 : isento
// de 2000,01 a 3000: 8%
// de 3000,01 a 4500: 18%
// acima de 4500: 28%
/* Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
 *  No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, 
 *  o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
 */


public class exercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj_scanner = new Scanner(System.in);
		
		System.out.println("Por favor, insira o salario");
		float salario = obj_scanner.nextFloat();
		
		float imposto = 0;
		double taxa=0;
		int control = 1;
		 
		
		if(salario<= 2000) {
			System.out.println("Isento");
		}
		else {
			while(control==1) {
				if(salario>2000 && salario<=3000) {
					taxa = 8/100;
					imposto += (salario-2000)*taxa;
					System.out.printf("Imposto: R$%.2f", imposto);
					control = 0;
					}
				else if( salario > 3000 && salario <= 4500) {
					taxa = 8/100;
					imposto += (salario - 3000)*taxa;
					salario = 3000;
				}
				else {
					taxa = 0.28;
					imposto += (salario - 4500)*taxa;
					salario = 4500;
				}
				
			}
			
		}
		
		
		 
		
		obj_scanner.close();
	}

}
