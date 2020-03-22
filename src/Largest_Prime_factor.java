import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yogesh_here @ 11:08:19 pm
 *
 */
public class Largest_Prime_factor extends Even_Fibonaaci {

	public static void main(String[] args) {
		System.out.println("Please enter a number of which you want to find prime factors ");
		Scanner sc=new Scanner(System.in);
		long number=sc.nextLong();
		List<Long> list=new ArrayList<Long>();
		for(long i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				if(primeCheck(i)==true)
				{
					System.out.println("value of i "+ i);					
				}
			}
		}
	}

	public  static boolean primeCheck(long n)
	{
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
/*
 * output : Please enter a number of which you want to find prime factors 13195
 * value of i 5 
 * value of i 7
 *  value of i 13 
 *  value of i 29
 * 
 */

/*Please enter a number of which you want to find prime factors 
600851475143
value of i 71
value of i 839
value of i 1471
value of i 6857
*/