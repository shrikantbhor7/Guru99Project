package TestNGpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BAmethod {

	@BeforeMethod
	public void setup()
	{
		System.out.println("Before method test cases");
	}
	@Test
	public void m1()
	{
		System.out.println("m1 test case");
	}
	@Test
	public void m2()
	{
		System.out.println("m2 test case");
	}
	@Test
	public void m3()
	{
		System.out.println("m3 test case");
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("Aftr method test cases");
	}
}
