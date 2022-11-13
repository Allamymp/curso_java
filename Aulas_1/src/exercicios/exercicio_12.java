package exercicios;
import java.util.Scanner;



//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
// Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem
// “Fora de intervalo”.
public class exercicio_12 {

	public static void main(String[] args) {
		
		Scanner obj_scanner = new Scanner(System.in);
		
		System.out.println("Por favor, insira um numero qualquer\n");
		float num = obj_scanner.nextFloat();
		
		if(num>=0 && num<=25) {
			System.out.println("O numero esta entre 0 e 25");
		}
		
		else if(num>25 && num<=50) {
			System.out.println("O numero esta entre 25 e 50");
		}
		
		else if(num>50 && num<=75) {
			System.out.println("O numero esta entre 50 e 75");
		}
		else if(num>75 && num<=100) {
			System.out.println("O numero esta entre 75 e 100");
		}
		
		else {
			System.out.println("Numero fora do intervalor.");
		}
		
		
		
		obj_scanner.close();
		// TODO Auto-generated method stub

	}

}
