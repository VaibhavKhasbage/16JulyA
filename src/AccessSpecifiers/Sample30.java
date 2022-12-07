package AccessSpecifiers;

public class Sample30 
{
	//4. example of public access specifier
	
		public int num;
		
		public Sample30()
		{
			num=10;
		}
		
		public void m1() 
		{
			System.out.println(num);
		}
		
		
		public static void main(String[] args) {
			
			Sample30 s30=new Sample30();
			s30.m1();
			System.out.println(s30.num);		
		}

}
