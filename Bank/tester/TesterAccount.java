package tester;

import java.util.Scanner;
import bank.Account;

public class TesterAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------@Well-Come  To Bank  ---- ");
		System.out.println("------ ");
		System.out.println("1. Create New Account ");
		System.out.println("2. Show  Account ");
		System.out.println("3. Deposite  ");
		System.out.println("4. withdraw");
		System.out.println("5. check balance ");
		System.out.println("6. Update Email ");
		System.out.println("7. Update City ");
		System.out.println("8. Exit ");
		
		Scanner sc=new Scanner(System.in);
		int choice;
		Account ac=null;
		do {
			System.out.println("enter choice ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Actid Name city Email balance ");
				ac =new Account (sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
				System.out.println("Your Account Created");
				break;
				
			case 2: 
				if(ac!=null)
					ac.displayAccount();
				else
					System.out.println("Account created first ");
				break;
			case 3:
				System.out.println(" Enter Amount To Deposite");
				double curBal=ac.deposite(sc.nextDouble());
				System.out.println(" Your current Balance ="+curBal);
				break;
			case 4:
				System.out.println(" Enter Amount To withdraw");
			ac.withdraw(sc.nextDouble());
		
				System.out.println(" Your current Balance ="+ac.getBalance());
				break;
		case 5:
	System.out.println("welcome  =  "+ac.getBalance()+ "Account Balance= "+ac.getBalance());
    System.out.println("---Thank You----");
				break;
				
				
		case 6:
			System.out.println("Enter the  Email you want Update ");
			System.out.println(" New Email="+ac.getEmail());
			break;
			
		case 7:
			System.out.println(" Enter the  City you want Update");
			System.out.println("New city ="+ac.getCity());
			break;
			
			
		case 8:
			 System.out.println(" Enter valid option");
			break;
							
			}		
		}while(choice!=8);
		System.out.println("----end of main ------");
		
		
		Account ac1=new Account(101, "Shiv","pune", "shiv@gmail.com",20000); //sender
	  Account ac2=new Account (100, "ABC","Akurdi","dssss",10000);  //receiver
		
		ac1.displayAccount();
		ac2.displayAccount();
		
		double amount =10000;//withdraw 10000 from act
		ac1.moneyTransfer(ac2, amount);//Money Transfer from ac1 to ac2
		
		ac1.displayAccount();
		ac2.displayAccount();
		
		sc.close();
	}
	
}
