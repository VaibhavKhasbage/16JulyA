package Constructor;

public class sample6 
{
	int num3;     //50
	int num4;      //30
	
	//user defined constructor with parameter
	sample6(int a, int b)    //50 , 30
	{
		num3 = a;    //50
		num4 = b;    //30
	}
	
	
	public void sub() 
	{
		System.out.println(num3-num4);
	}

}
