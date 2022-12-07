package Inheritance;

public class totalSingle_Level_Inheritance 
{
	public static void main(String[] args) 
	{
		son s=new son();
		s.mobile();
		s.car();
		s.money();
		s.home();
		System.out.println("-------------------");
		
		Son1 s1=new Son1();
		s1.mobile();
		s1.car();
		s1.money();
		s1.home();	
		System.out.println("---------------------");
		
		Son2 s2=new Son2();
		s2.laptop();
		s2.car();
		s2.money();
		s2.home();		
		System.out.println("---------------------");
		Son3 s3=new Son3();
		s3.bike();
		s3.car();
		s3.money();
		s3.home();		
	
	
	
	}

}
