package TypesOfVariable;

public class Sample4 
{
int a=40;

public static void main(String[] args)
{
	// non- static global variable variable call from same class
	Sample4 s4=new Sample4();
	System.out.println(s4.a);
	
	System.out.println("------");
	
	//non static global variable call from different class
	
	sample33 s33=new sample33();
	System.out.println(s33.d);
}

public static void m1() 
{
	Sample4 s5=new Sample4();
	System.out.println(s5.a);		
}

public void m2() 
{
	System.out.println(a);
}
}
