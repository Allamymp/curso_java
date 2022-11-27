package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

/*
 * fazer um programa para ler os dados de um funcionário(nome, salario bruto e imposto). Em 
 * seguida, mostrar os dados do funcionario ( nome e salario liquido). Em seguida, aumentar o
 * salario do funcionario com base em uma porcentagem dada (somente o salario bruto e afetado
 * pela porcentagem )  e mostrar novamente os dados do funcionario.
 */

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		employee func_data = new employee();
		
		
		System.out.println("Insira o nome: ");
		func_data.name = sc.nextLine();
		System.out.println("\nInsira o salario bruto: ");
		func_data.grossSalary = sc.nextDouble();
		System.out.println("\nInsira o imposto: ");
		func_data.tax = sc.nextDouble();
		
		func_data.netSalary();
		System.out.println("\n Percentual para aumentar salario: ");
		func_data.increaseSalary(sc.nextDouble());
		
		
		sc.close();
	}

}
