package AccessSpecifiers;

public class Sample21 
{
	//3. example of protected access specifier
	
		protected int num;
		
		protected Sample21()
		{
			num = 10;
		}
		
		protected void name()
		{
			System.out.println(num);
		}
		
		public static void main(String[] args) 
		{
			Sample21 s21=new Sample21();
			s21.name();
			System.out.println(s21.num);		
		}
		
}
