package TestNGpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo6 {

	@BeforeMethod
	public void setup()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("After method");
		System.out.println("-----------------------");
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login test case");
	}
	@Test(priority=-2)
	public void home()
	{
		System.out.println("Home test case");
	}
	@Test(priority=3)
	public void pim()
	{
		System.out.println("PIM test case");
	}
	
}
