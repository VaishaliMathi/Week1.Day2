package week1.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		int num=1331;
		int temp = num;
		int num1,num2=0;
		while (temp!=0) 
		{
			num1=temp%10;
			temp=temp/10;
			num2= (num2*10)+num1;
		}
		if (num2==num) 
		{
		System.out.println("It is a Palindrome Number");	
		}
		else 
		{
			System.out.println("It is not a Palindrome Number");
		}
	}

}
