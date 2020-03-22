
public class MultiplesOf3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=1000;
		int sum=0;
		for(int i=1;i<=range;i++)
		{
			
			if(i%3==0 || i%5==0)
			{
				System.out.println("Value is "+i);
				sum=sum+i;
			}
		}
		System.out.println("Sum is "+sum);
	}

}
