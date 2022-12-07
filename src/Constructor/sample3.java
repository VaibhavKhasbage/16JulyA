package Constructor;

public class sample3 
{
	//example 2: user defined constructor --> without or zero parameter 
	
		//step1: declaration
		int num1;        //10
		int num2;        //20
		
		//step2: initialization
		//user defined constructor  --> provided by user  --> same class
		//use1: to initialize global variable
		//use2: copy all the members of class into object
		sample3()         //without or zero parameter constructor
		{
			num1=10;
			num2=20;		
		}
		
		//step3: usage
		public void addition() 
		{
			System.out.println(num1+num2);
		}
		
		public void mul() 
		{
			System.out.println(num1*num2);
		}
		
		
		public static void main(String[] args) 
		{
			sample3 s3=new sample3();
			s3.addition();
			s3.mul();
			
			System.out.println("-------------");
			
			sample4 s4=new sample4();
			s4.sub();
		}

}
