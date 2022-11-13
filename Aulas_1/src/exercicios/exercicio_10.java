package exercicios;


import java.util.Scanner;


//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
//sabendo que o mesmo pode começar em um dia e terminar em outro, 
//tendo uma duração mínima de 1 hora e máxima de 24 horas

public class exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj_scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo: \n");
		int hora_inicial = obj_scanner.nextInt();
		
		System.out.println("Digite a hora final do jogo: \n");
		int hora_final = obj_scanner.nextInt();
		
		int hora_total = 0;
		
		if(hora_inicial>hora_final) {
			hora_total = 24 - (hora_inicial - hora_final);
			System.out.printf("Duração: %d horas",hora_total);
		}
		else {
			if(hora_inicial<hora_final) {
				
				hora_total = hora_final - hora_inicial;
				
				System.out.printf("Duração: %d horas",hora_total);
			}
			else {
				System.out.println("O jogo durou 24 horas.");
			}
		}
		
		
		
		
		obj_scanner.close();
		

	}

}
