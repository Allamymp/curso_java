package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Entitie_Ex22;

/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada
 */

public class Exercicio_22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		List<Entitie_Ex22> list = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #"+(i+1)+":");
			System.out.println("id:");
			int id = sc.nextInt();
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary:");
			float salary = sc.nextFloat();
			
			list.add(new Entitie_Ex22(id,name,salary));
			
			
		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int id_ToSearch = sc.nextInt();
		
		int id_ToIncrease = -1;
		
		
		for(Entitie_Ex22 id : list) {
			if(id.getId()==id_ToSearch) {
				id_ToIncrease = list.indexOf(id);
			}
		}
		
		if(id_ToIncrease == -1) {
			System.out.println("This id does not exist!");
		}
		else {
			 System.out.println("Enter the percentage:");
			 float percentage= sc.nextFloat();
			 float salary = list.get(id_ToIncrease).getSalario();
			 salary += list.get(id_ToIncrease).getSalario()*(percentage/100);
			 
			 list.get(id_ToIncrease).setSalario(salary);
		}
		
		
		
		
		System.out.println(id_ToIncrease);
		System.out.println(list.get(id_ToIncrease).getSalario());
		for(Entitie_Ex22 x: list) {
			System.out.println(x.getId()+", "+ x.getNome()+", "+x.getSalario());
		}
		
		sc.close();

	}

}
