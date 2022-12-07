package ControlStatement;

public class example7_nested1
{
public static void main(String[] args)
{
	int PEM= 350;
	//350>= 300;
	
	if(PEM>=300)
	{
		System.out.println("eligible for main exam");
	}
	
	int MEM = 500;
	//500>= 700
	if(MEM>=700)    //nested/ inner if
	{
		System.out.println("Got select");
	}
	else
	{
		System.out.println("Rejected from main exam");
	}
}


}
