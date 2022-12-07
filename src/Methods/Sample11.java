package Methods;

public class Sample11 
{
public static void main(String[] args)
{
	addition1(50,60,70);
	addition2(60,70,80);
	addition3(40,80,90);
	System.out.println("-------");
	
	sub(30,20);
	sub(45,15);
	sub(78,45);
}
public static void addition1(int num1, int num2, int num3)
{
	System.out.println( num1 + num2+num3);
}
public static void addition2(int num1, int num2, int num3)
{
	System.out.println(num1+ num2+num3);
}
public static void addition3(int num1, int num2, int num3)
{
	System.out.println(num1+ num2 + num3);
}
public static void sub(int num1, int num2)
{
	System.out.println(num1-num2);
}


}
