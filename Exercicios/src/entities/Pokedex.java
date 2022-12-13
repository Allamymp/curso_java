package entities;

import java.util.Scanner;
import java.util.ArrayList;

public class Pokedex {

	public ArrayList<String> poke_name = new ArrayList<String>();
	public ArrayList<String> poke_type = new ArrayList<String>();
	public ArrayList<Integer> poke_lvl = new ArrayList<Integer>();
	public int index = poke_name.size();

	public void add_pokemon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome do pokemon: ");
		poke_name.add(sc.nextLine());

		System.out.println("Insira o tipo do pokemon: ");
		poke_type.add(sc.nextLine());

		System.out.println("Insira o nivel do pokemon: ");
		poke_lvl.add(sc.nextInt());

		System.out.println("___________________________________________________");
		System.out.println("Pokemon adicionado!");
		sc.close();
	}

	public void show_pokemon() {

		for (int i = 0; i < poke_name.size(); i++) {
			System.out.println("\nLista de Pokemons adicionados:\n\n");
			System.out.printf("Nome: %s		\n" + "Tipo: %s		\n" + "Lvl:  %d\n" +
					"Cod:  %d\n\n", poke_name.get(i),
					poke_type.get(i), poke_lvl.get(i), i);
		}
	}

	public void remove_pokemon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInforme o codigo do pokemon que deseja remover: ");
		int codigo = sc.nextInt();
		System.out.println("Pokemon " + poke_name.get(codigo) + " removido!\n\n");
		poke_name.remove(codigo);
		poke_type.remove(codigo);
		poke_lvl.remove(codigo);
		
		sc.close();

	}

}
