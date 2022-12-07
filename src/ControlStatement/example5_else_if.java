package ControlStatement;

public class example5_else_if
{
public static void main(String[] args)
{
	int marks=30;
	
	if(marks>=65)
	{
		System.out.println("Distinction");
	}
	else if(marks>60 & marks<=64)
	{
		System.out.println("First class");
	}
	
	else if(marks>=50 &marks<=59)
	{
		System.out.println("second class");
	}
	
	else if(marks>=35 & marks<=49)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}
