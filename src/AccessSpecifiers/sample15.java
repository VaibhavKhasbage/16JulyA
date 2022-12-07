package AccessSpecifiers;

public class sample15 
{
	//2. example of default access specifier
	
		int num;    //default
		
	    sample15()       //default
		{ 
		   num=10;
		}
	    
	    void m1()            //default
	    {
			System.out.println(num);
		}
	    
	    public static void main(String[] args) 
	    {
			sample15 s15=new sample15();
			s15.m1();
			System.out.println(s15.num);	
		}

}
