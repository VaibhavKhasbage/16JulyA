package PolyMorphism;

public class TestSample2 
{
	//example of compileTime PolyPorphism 
	
		public static void main(String[] args) 
		{		
			Sample2 s2=new Sample2();
			s2.addition(10, 20);     	//binding of 2 parameter addition method
			s2.addition(20, 30,40);     //binding of 3 parameter addition method		
		}
		

}
