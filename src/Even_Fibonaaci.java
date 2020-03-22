import java.util.Scanner;

public class Even_Fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a range upto which you want the series");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		
		int first=1;
		int second=2;
		System.out.print(" "+first+" "+second+" ");
		int next=0;
		while(next<a)
		{
			next=first+second;
			System.out.print(next+" ");
			first=second;
			second=next;
		}
	}

}
