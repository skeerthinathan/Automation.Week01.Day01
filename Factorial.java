package week1.day1;

public class Factorial 
{
	public static void main(String[] args) 
	{
		//Factorial of the given number
		int Num = 6;
		for (int i = Num-1; i > 0; i--) 
		{
			Num = Num * i;		
		}
		System.out.println("Assignment: FACTORIAL OF THE GIVEN NUMBER");
		System.out.println("Factorial of the given number is: "+Num);
	}

}
