package Methods;

public class Sample14eg1
{
public static void main(String[] args) 
{
	familymemberName("Aishwarya");
	familymemberName("Ashwini");
	familymemberName("Vaibhav");
	familymemberName("Surekha");
	familymemberName("Keshav");
	
	System.out.println("------------");
	
	familymemberFullName("Aishwarya","Khasbage");
	familymemberFullName("Ashwini","Khasbage");
	familymemberFullName("Vaibhav","Khasbage");
	familymemberFullName("Surekha","Khasbage");
	familymemberFullName("Keshav","Khasbage");
	
}
public static void familymemberName(String name)
{
	System.out.println(name);
}
public static void familymemberFullName(String FN, String LN)
{
	System.out.println(FN+" "+LN);
	
}

}
