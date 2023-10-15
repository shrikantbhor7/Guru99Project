package TestNGpractice;

import org.testng.annotations.Test;

public class demo5 {
	
	@Test
	public void registerpage()
	{
		System.out.println("Register page test cases");
	}
	@Test(dependsOnMethods= {"registerpage"})
	public void login()
	{
		System.out.println("Login page test cases");
	}
	@Test(dependsOnMethods= {"login"},alwaysRun=true)
	public void homepage()
	{
		System.out.println("Home page test cases");
	}
	

}
