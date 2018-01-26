import java.util.Scanner;
public class sumInts {
	
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
