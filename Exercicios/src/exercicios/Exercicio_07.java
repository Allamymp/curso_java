package exercicios;

/*
 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação. 
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Exercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank_account;

		System.out.println("Enter account number:");
		int account_number = sc.nextInt();

		System.out.println("Enter account holder:");
		sc.nextLine();
		String account_holder = sc.nextLine();

		System.out.println("Is there a initial deposit(y/n)?");
		char register_choice = sc.next().charAt(0);
		
		
		System.out.println();
		if (register_choice == 'y') {
			System.out.println("Enter initial deposit value:");
			double account_movement = sc.nextDouble();
			bank_account = new Bank(account_holder, account_number, account_movement);

		}

		else {
			bank_account = new Bank(account_holder, account_number);

		}

		bank_account.account_data();

		bank_account.account_deposit();

		bank_account.account_withdraw();
		sc.close();
	}

}
