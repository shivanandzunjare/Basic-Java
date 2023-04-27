package enumm;

import java.util.Scanner;



public class TestEnumColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		Colors col=Colors.Red;
		System.out.println(col);
		

		System.out.println(" Availabe colors");
		Colors [] arrcolr=Colors.values();
		for(Colors c : arrcolr)
		{
		  System.out.println(c);
		}
		for (Colors c : Colors.values()) {
			System.out.print(c + "  ");
		}
		//accept enum values from user
		
		System.out.println("---Enter Color-----");
		Scanner sc=new Scanner(System.in);
		
		String strCol=sc.next();
	
		//:input:String   Output:enum type
		Colors userSel=Colors.valueOf(strCol);
		System.out.println("Selected Color="+userSel);
		
	}

}
