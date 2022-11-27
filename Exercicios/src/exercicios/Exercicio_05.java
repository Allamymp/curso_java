package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Pokedex_Class;

/*
 * Crie um programa que registre o nome e o tipo de um pokemon. Use uma classe chamada Pokedex_Class
 * e um construtor. Após registrado, o programa deve retornar o nome e tipo do
 * pokemon
 */

public class Exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do pokemon: ");
		String poke_name = sc.nextLine();
		
		System.out.println("Informe o tipo do pokemon: ");
		String poke_tipo = sc.nextLine();		
		
		Pokedex_Class pokemon = new Pokedex_Class(poke_name,poke_tipo);
		
		System.out.println("O nome do pokemon e: " + pokemon.name);
		System.out.println("O tipo do pokemon e: "+pokemon.type);
		
		
		sc.close();
	}

}
