package Loops;

public class forLoop12_printTableNum_13_and_14
{
public static void main(String[] args) 
{
	table(13);
	table(14);
	
}
public static void table(int x)
{
	System.out.println("Table of :"+x);
	for(int i=1; i<=10; i++)
	{
		System.out.println(i*x);
	}
}

}
