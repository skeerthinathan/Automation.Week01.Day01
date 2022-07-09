package week1.day1;

public class IsPrime {

	public static void main(String[] args) 
	{
	
	// To find whether the given number is PRIME number or not
	System.out.println("Assignment: PRIME OR NOT");
	
	int a=0;
	int Num=73;
	
	for (int i = 2; i < Num; i++) 
		{
		if(Num%i==0)
			{
			a=1;
			break;
			}
		}
	if(a==1)
		{
		System.out.println(Num+" - NOT a PRIME Number");
		}
	else
		System.out.println(Num+" - A PRIME Number");
		}
}

