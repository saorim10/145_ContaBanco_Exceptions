package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com os Dados da Conta: ");
			System.out.print("Número: ");
			int number = sc.nextInt();
			System.out.print("Cliente: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Saldo Inicial: R$ ");
			double balance = sc.nextDouble();
			System.out.print("Limite: R$ ");
			double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Valor do Saque: R$ ");
			acc.withdraw(sc.nextDouble());
			System.out.printf("Saldo Atualizado: R$ %.2f", acc.getBalance());
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
		
		sc.close();
	}

}
