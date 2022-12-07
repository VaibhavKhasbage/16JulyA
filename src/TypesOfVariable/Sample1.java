package TypesOfVariable;

public class Sample1 
{
	// non static global and local variable call from different class
int c= 50;  // Global variable

public void m1()
{
	int a= 10;  // local variable
	System.out.println(a);  //10
	System.out.println(c);  //50
	
}
public void m2()
{
	int b= 20;  //  local variable
	System.out.println(b);  //20
	System.out.println(c);  //50
}




}

