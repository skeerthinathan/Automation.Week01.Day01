package week1.day1;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
	
	// Fibonacci Series
	System.out.println("Assignment: FIBONACCI SERIES");
		
	int a=0;
	int b=1;
	int c=a+b;
	System.out.println(a);
	System.out.println(b);
	for (int k = 1; k < 10; k++) 
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}

	}

}
