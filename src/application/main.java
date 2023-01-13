package application;

import java.util.Scanner;

import entities.Account;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: "); 	
		String holder = sc.nextLine();
		System.out.print("Initial Balance: "); 
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withDrawLimit = sc.nextDouble();
		
		Account ac = new Account(number, holder, initialBalance, withDrawLimit);
		
		System.out.print("Enter the amount to Withdraw: ");
		Double withDraw = sc.nextDouble();
		ac.withDraw(withDraw);
		
		System.out.println(ac);
		}
		catch(IllegalArgumentException e) {
			 System.out.println("Withdraw error: "+ e.getMessage());
		}finally {
			sc.close();
		}		
	}

}
