package bank;

public class Account {
	int actid;
	String name,email,city;
	double balance;
	
	 public Account(int actid,String name,String email,String city,double balance)
	 {   
		 System.out.println("--Parameterized Constructor ------");
		 this.actid=actid;
		 this.name=name;
		 this.email=email;
		 this.city=city;
		 this.balance=balance;
	 }
	 
	 //getter // setter
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName() 
	 {
		 return name;
	 }
	 public void setEmail(String name) 
	 {
		 this.email=email;
	 }
	 public String getEmail()
	 {
		 return email;	 
	 }
	 public void setCity(String city) {
		 this.city=city;	 
	 }
	 public String getCity()
	 {
		 return city;
		 
	 }
	 public int getActid()
	 {
		 return actid;
	 }
	 public double getBalance()
	 {
		 return balance;
	 }
	 public void withdraw(double amount)   //Method For Withdraw Amount
	 {   if(balance>amount) 
	   {
		 System.out.println("------withraw-----");
		 this.balance=this.balance-amount;
		 System.out.println("balance after withraw"+balance); 
		 
	    }
	 else
	     {
		 System.out.println(" Insufficient amount ");
	    }
	 }
	 public double deposite(double amount)  //Method For Deposite Amount
	 {
		 System.out.println("------deposite-----");
		 this.balance=this.balance+amount;
		 System.out.println("balance after deposite "+this.balance); 
		 return balance;
		 
	 }
	 public void displayAccount()
	 {
		 System.out.println("------Account Details -----");
		 System.out.println("Actid= "+ actid+ " Name "+name+" city "+city+" balance :"+balance);
		 
 
	 }
	 public void moneyTransfer(Account receiver ,double amount)  ////Method For Money Transfer
	 { 
		 System.out.println("------Money Transfer -----");
		 this.balance=balance-amount;
		 receiver.balance=receiver.balance+amount;
		 System.out.println("Money Transfered from :"+this.getName()+  " to "+receiver.getName());
		 System.out.println("After Money Transfer  "+this.getName()  +" Your Total Amount is: "+this.balance);
		 
		 
		 
	 }
		 
	 
	 
	


}
