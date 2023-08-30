package tester;
import bank.Account;
import tester.TesterAccount;
public class TesterMoneytransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac1=new Account(101, "Shiv","Latur", "shiv@gmail.com",20000);
	Account ac2=new Account (100, "ABC","aaaa","dssss",10000);
		
		ac1.displayAccount();
		ac2.displayAccount();
		
		double amount =10000;
		ac1.moneyTransfer(ac2, amount);
		
		ac1.displayAccount();
		ac2.displayAccount();
		
	}

}
