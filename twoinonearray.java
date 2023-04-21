import java.util.Scanner;
public class twoinonearray {
	
	public static void main(String [] args )
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		int size1,size2;
		System.out.println("enter the size of array1");
		size1=sc.nextInt();
		
		System.out.println("enter the size of array2 ");
		size2=sc.nextInt();
		
		int arr1  []=new int [size1];
		int arr2 []=new int [size2];
		System.out.println("enter the arrray1 elements");
		for(int i=0; i<arr1.length; i++)
		{
		    arr1[i]=sc.nextInt();
		    		
		}
		int a=arr1.length;
         System.out.println("enter the array2 elements ");
         for(int j=0; j<arr2.length; j++)
         {
        	 arr2[j]=sc.nextInt();
         }
         int b=arr2.length;
		int arr3[]=new int [a+b];
		//to get arr1 elements
		for(int i=0; i<a; i++)
		{
			arr3[i]=arr1[i];
		}
		//to get arr2 elements 
		for (int j=0; j<b; j++)
		{
			arr3[a+j]=arr2[j];
		}
		System.out.println("third array eements are");
		for(int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]+ " ");
		}
	}
	
	
	
	

}
