package Constructor;

public class sample5 
{
	int num1;   //50
	int num2;   //60
	
	//user defined with 2 int parameter constructor
	sample5(int a, int b)   //50, 60
	{
		num1=a;   //50      //assign local variable info into global variable
		num2=b;   //60
	}	
	
	public void addition() 
	{
		System.out.println(num1+num2);  //30
	}
	
	public void mul() 
	{
		System.out.println(num1*num2);  //200
	}
		
	public static void main(String[] args) 
	{		
		sample5 s5=new sample5(10,20);
		s5.addition();    //30
		s5.mul();       //200
		
		System.out.println("---");
		
		sample5 s6=new sample5(50, 60);
		s6.addition();   //110
		s6.mul();       //3000
		
System.out.println("------------");
		
		sample6 s7=new sample6( 20, 10);
		s7.sub();         //-10
		
		sample6 s8=new sample6(50, 30);
		s8.sub();            //20
	}


	

}
