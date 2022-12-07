package Methods;

public class Sample5 
{
public static void main(String[] args)
{
	System.out.println("HEllo");
	
	Sample5 s5=new Sample5();
	
	s5.m5();
	s5.m6();
}
public void m5()
{
	System.out.println("running non static regular method: m5");
	
}
public void m6()
{
	System.out.println("running non static regular method: m6");
}
}
