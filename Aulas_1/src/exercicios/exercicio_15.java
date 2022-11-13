package exercicios;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
  Para cada leitura de senha  incorreta informada, escrever a mensagem "Senha Invalida".
   Quando a senha for informada corretamente deve ser impressa a mensagem 
   "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 
 */
public class exercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj_scanner = new Scanner(System.in);
		int senha = 0;

		while (senha != 2002) {

			System.out.println("Por favor, digite uma senha");
			senha = obj_scanner.nextInt();

			if (senha == 2002) {
				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha invalida\n");
			}

		}
		obj_scanner.close();
	}

}
