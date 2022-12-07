package Constructor;

public class sample4 
{

	int num3;   //40
	int num4;   //30
	
	//user defined constructor  --> provided by user
	//use1: to initialize global variable
	//use2: copy all members of class into object
	sample4()               //without or zero parameter constructor
	{
		num3=40;
		num4=30;
	}
	
	
	public void sub()
	{
		System.out.println(num3-num4);
	}


}
