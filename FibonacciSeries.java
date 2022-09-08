package week1.day2;

public class FibonacciSeries 
{

	public static void main(String[] args)
	{
		int range=8;
		int a=0,b=1,temp;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 2; i <=range; i++) {
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			
		}

	}

}
