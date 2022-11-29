package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Pokedex;


/*
 * crie um programa que possua um menu onde tenha 4 opções :
 *  1 - adicionar um pokemon
 * 2 - mostrar todos os pokemons em ordem
 * 3 - remover um pokemon
 * 4 - encerrar.
 */


public class Exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod_menu=1;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pokedex pokedex = new Pokedex();
		
		 
		System.out.println("\n\n___________________________________________________");
		
		System.out.println(">>>BEM-VINDO TREINADOR<<<\n\n");
		while(cod_menu!=0) {
			System.out.println("Escolha uma opção no menu abaixo: \n"
					+ "1 - Adicionar Pokemon\n"
					+ "2 - Remover Pokemon\n"
					+ "3 - Mostrar todos os pokemons\n"
					+ "4 - Sair!\n\n\n\n\n");
			cod_menu = sc.nextInt();
			switch(cod_menu) {
			
			case 1:
				pokedex.add_pokemon();
				cod_menu=1;
				break;
			case 2:
				pokedex.remove_pokemon();
				cod_menu=2;
				break;
			case 3:
				pokedex.show_pokemon();
				cod_menu=3;
				break;
			case 4:
				System.out.println("Até mais treinador!");
				cod_menu=0;
				break;
			default:
				System.out.println("Numero adicionado invalido\n\n\n\n\n");
			}
			
		}
		
		
	
	
	 
		sc.close();
	}

}
