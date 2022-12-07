package Constructor;

public class sample7 
{
	//constructor overloading
	
		int num1;
		int num2;
		String name;    //rahul
		
		//constructor without parameter
		sample7()
		{
			num1=50;
			num2=60;
		}
		
		//constructor with 2 int parameter
		sample7(int a, int b)
		{
			num1=a;
			num2=b;		
		}
		
		//constructor
		sample7(String s1)  //s1= rahul
		{
			name=s1;   //rahul
		}
		
		
		public void add() 
		{
			System.out.println(num1+num2);
		}
		
		public void StudentName()
		{
			System.out.println(name);
		}
		
			
		public static void main(String[] args) 
		{
			sample7 s7=new sample7();
			s7.add();                //110
			
			System.out.println("------");
			
			sample7 s8=new sample7(9, 7);
			s8.add();
			
			System.out.println("-----");
			
			sample7 s9=new sample7("rahul");
			s9.StudentName();
		}

}
