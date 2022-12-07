package ControlStatement;

public class Example1_nested 
{
public static void main(String[] args) 
{
	int PEM=200;  //300>=300
	
	if (PEM>=300)  //outer if
	{
		System.out.println("Eligible for mains exam");
		
	
	
		int MEM =450;
		//MEM>=500
		if (MEM>=500)  //nested if condition
		
		{
		System.out.println("Got selected");
		
		}
	
		else
		{
			System.out.println("Rejected for main exam");
		}
	
	}
	
			
	

else 
{
	System.out.println("Not eligible for main exam");
}
	



}
}
