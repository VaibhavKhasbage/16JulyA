package TypesOfVariable;

public class sample5 
{
int a=50;  //global variable

public static void main(String[] args) 
{
	//global variable call from same class
	
	sample5 s5=new sample5();  // create object of same class
	System.out.println(s5.a);  //object name . variable name
	
	System.out.println("------");
	
	//global variable call from different class
	
	sample6 s6=new sample6();  // create object of different class
	System.out.println(s6.d);  // object name. variable name
}

}
