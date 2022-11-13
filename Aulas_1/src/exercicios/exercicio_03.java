package exercicios;
import java.util.Scanner;



/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
 * calcule e mostre a diferença do produto
  de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/


public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Por favor, insira o valor de A pressione ENTER\n");
		a = sc.nextInt();

		System.out.println(" Por favor, insira o valor de B pressione ENTER\n");
		b = sc.nextInt();
		
		System.out.println(" Por favor, insira o valor de C pressione ENTER\n");
		c = sc.nextInt();
		
		System.out.println(" Por favor, insira o valor de D pressione ENTER\n");
		d = sc.nextInt();
		
		System.out.printf("Diferença = %d",(a*b - c*d));
		
		sc.close();

	}

}
