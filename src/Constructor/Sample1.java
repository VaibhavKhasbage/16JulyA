package Constructor;

public class Sample1
{
int num1;
int num2;
Sample1(int a, int b)
{
	num1=a;
	num2=b;
	
//	int r=num1-num2;
//	System.out.println(r);
}

public static void main(String[] args)
{
	Sample1 s1= new Sample1(50,20);
	s1.sub();
	
}
void sub()
{
	System.out.println(num1-num2);
}
}
