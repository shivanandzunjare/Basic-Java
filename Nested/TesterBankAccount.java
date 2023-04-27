package Nested;

import java.util.Scanner;

public class TesterBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter actid name balance");
		Scanner sc = new Scanner(System.in);

		BankAccount ac = new BankAccount(sc.nextInt(), sc.next(), sc.nextDouble());

		System.out.println(ac);
		System.out.println("do you want have Locker y/n");
		Character ans = sc.next().charAt(0);
		if (ans.equals('y')) {
			System.out.println(" duration ");
			int d = sc.nextInt();
			ac.assignLocker(d);
			System.out.println(" Locker get Created  ");
			System.out.println(ac);

		} else
			System.out.println(" Locker not get Created  ");

	}

}
