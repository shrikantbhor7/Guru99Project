package BasePackage;

public class sample3 extends demo3{

	public static void abc()
	{
		System.out.println("abc static method in sample3 class");
	}
	public static void pqr()
	{
		System.out.println("pqr static method in sample3 class");
	}
	public static void main(String[] args) {
		
		sample3 obj=new sample3();
		obj.abc();
		obj.pqr();
		obj.xyz();

	}

}
