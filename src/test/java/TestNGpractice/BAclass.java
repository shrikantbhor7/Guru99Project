package TestNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BAclass {

	@BeforeClass
	public void setup()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void teardown()
	{
		System.out.println("After class");
	}
	@Test
	public void m1()
	{
		System.out.println("M1 test cases");
	}
	@Test
	public void m2()
	{
		System.out.println("M2 test cases");
	}
	@Test
	public void m3()
	{
		System.out.println("M3 test cases");
	}
	
}
