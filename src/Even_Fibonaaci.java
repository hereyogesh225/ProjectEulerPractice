import java.util.Scanner;

public class Even_Fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a range upto which you want the series");
		Scanner sc=new Scanner(System.in);
		int a =4000000;
		
		int first=1;
		int second=2;
		//System.out.print(" "+first+" "+second+" ");
		int sum=second;
		int next=0;
		while(next<=a)
		{
			next=first+second;
			//System.out.print(next+" ");
			if(next%2==0)
			{
				sum=sum+next;
			}
			first=second;
			second=next;
		}
		System.out.println("Sum of even numbers of fibonacci series is :"+sum);
	}

	
	
	
}
