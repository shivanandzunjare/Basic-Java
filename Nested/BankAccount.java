package Nested;

public class BankAccount {  //Class
	
	private int actid;
	private String name;
	private double balance;
	
	private Locker locker;
	
	public BankAccount(int actid,String name, double balance)
	{
		System.out.println("--parameterized constructor---");
		this.actid=actid;
		this.name=name;
		this.balance=balance;
	}

	      //setters
	public void setName(String name)
	{
		this.name = name;
	}
	    
	     //getters
	public String getName() 
	{
		return name;
	}

	public int getActid() 
	{
		return actid;
	}

	public double getBalance()
	{
		return balance;
	}

	@Override
	public String toString() {
		if(locker==null)	
		{
			System.out.println("locker not created yet");
		
		return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
     	}
		else
		{
			return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + " locker"+locker;
		}
	}
		public void assignLocker(int duration)
		{
		 locker=new Locker(duration);
		  locker.calculateCharges();
		}
		
		
		
		
		 private class Locker {
			
		private int lockerid;
		private int duration;
		private double charges;
		
		public Locker (int duration)
		{
			this.duration=duration;
			this.charges=500;
		}
		
		public void calculateCharges()
		{
			System.out.println("total "+ duration * charges);
		}
		
		public String toString()
		{
			System.out.println("locker get created for account"+actid);
			return "duration"+ duration+ " charges :"+charges;
			
	
		}
		
			
		}
}
