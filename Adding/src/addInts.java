import java.util.Scanner;
public class addInts {

	public static void main(String[] args) {
		 Scanner keyboard=new Scanner(System.in);
		 int n;
		 System.out.println("Enter your number of integers:");
		  n=keyboard.nextInt();
		  System.out.println("Enter your number of integers one per line:");
		 int firstInt=keyboard.nextInt();
		 int[] nextint=new int[n];
		 for ( n=0; n<nextint.length;n++)
			 
		   nextint[n]=keyboard.nextInt();
		 //for ( n=0; n<nextint.length;n++)
			 //nextint[n]=nextint[n]+firstInt;
		 //int answer[]=arrayOfInts(firstInt,nextint);
		  
		 for (n=0; n<nextint.length;n++)
		 {    int answer[]=arrayOfInts(firstInt,nextint);
			 System.out.println("Adding the integers in the array "+nextint[n]);
			 System.out.println("gives a total of "+answer[n]);	
		 }
	}
	public static int[]arrayOfInts(int firstInt,int[]nextInt)
	{
		int[] sum=new int[nextInt.length];
		for(int i=0; i<sum.length; i++)
		 sum[i]=getSum(firstInt,nextInt[i]);
		return sum;
	}
	public static int getSum(int n1,int n2)
	{
		return(n1+n2);
	}
	

}
