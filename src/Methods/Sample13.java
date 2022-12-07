package Methods;

public class Sample13 
{
	public static void main(String[] args) 
	{
		addition(45,65);
		addition(58,89);
		
		System.out.println("------");
		
		Sample13 s13= new Sample13();
		
		s13.sub(85,55);
		s13.sub(95,35);
	}
	public static void addition(int num1, int num2)
	{
		System.out.println(num1+ num2);
		
	}
	public  void sub(int num1, int num2)
	{
		System.out.println(num1- num2);
	}

}
