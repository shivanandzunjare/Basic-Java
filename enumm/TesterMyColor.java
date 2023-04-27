package enumm;
import java.util.Scanner;
public class TesterMyColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		for(MyColors m: MyColors.values())
		{
			System.out.println( m + " ");
		}
		
		System.out.println("enter the colors");
		Scanner sc=new Scanner(System.in);
		String col=sc.next();
		
		MyColors m=MyColors.valueOf(col.toUpperCase());
		System.out.println("your color "+ m+ " price "+m.getPrice());
		
		m.setPrice(4000);
		System.out.println(m+ " "+m.getPrice());
		
		for(MyColors m3: MyColors.values())
		{
			System.out.println(m3+" "); 
		}
		
		MyColors m2=MyColors.purple;
		System.out.println(m2+" "+m2.getPrice());
		
		
		
		
		
		
		
		
		
	}
	

}
