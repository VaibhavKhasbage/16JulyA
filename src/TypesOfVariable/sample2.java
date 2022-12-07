package TypesOfVariable;

public class sample2
{
	// static global and local variable call from same class
	static int c= 80;  // Global variable

	public static void m1()
	{
		int a= 20;  // local variable
		System.out.println(a);  //20
		System.out.println(c);  //80
		
	}
	
	public static void m2()
	{
		int b= 40;  //  local variable
		System.out.println(b);  //40
		System.out.println(c);  //80
	}
	
	

	
	
	
	
	
	
}
