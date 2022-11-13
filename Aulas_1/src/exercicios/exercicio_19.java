package exercicios;
import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" 
 para fora do intervalo).
*/

public class exercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor,insiraum numero inteiro referente a quantidade de numeros.");
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 1; i<=n ; i++) {
			System.out.println("Por favor,insiraum numero inteiro.");
			int y = sc.nextInt();
			
			if(y>=10 && y<=20) {
				in++;
			}
			else {
				out++;
			}
		}

		System.out.printf(" In:%d\n Out:%d\n",in,out);
		sc.close();
	}

}
