package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

/*
 * Faça um programa para ler a cotacao do dolar, depois um valor em dolares a ser comprado
 * por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando
 * ainda que a pessoa tera que pagar 6% de IOF sobre esse valor em dolar. Criar uma classe
 * estatica CurrencyConverter para realizar os calculos. 
 */

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Insira cotacao do dolar: ");
		double cotacao_dolar = sc.nextDouble();

		System.out.println(" Insira valor a ser comprado em US: ");
		double valor_compraUS = sc.nextDouble();

		double total = CurrencyConverter.converter(valor_compraUS, cotacao_dolar);

		System.out.println("Valor a ser pago em reais: R$ " + total);

		sc.close();
	}

}
