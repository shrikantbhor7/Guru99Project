package BasePackage;

public class sample1 extends demo1 {

	public void s1(int a) 
	{
		System.out.println("s1 method in sample1 class with 1 int argument ");
	}
	public void d1(String a) 
	{
		System.out.println("d1 method in sample1 class with 1 string argument ");
	}
	public void login() 
	{
		System.out.println("login method in sample1 class");
	}
	
	public static void main(String[] args) {
		
		sample1 obj=new sample1();
		obj.d1();
		obj.d1(100);
		obj.d1("Shrikant");
        obj.s1(1000);
        obj.login();
		
	}

}
