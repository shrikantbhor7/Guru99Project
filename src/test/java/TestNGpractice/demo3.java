package TestNGpractice;

import org.testng.annotations.Test;

public class demo3 {


	@Test(priority=5)
	public void google()
	{
		System.out.println("Google test cases");
	}
	@Test(priority=4)
	public void facebook()
	{
		System.out.println("Facebook test cases");
	}
	@Test(priority=3)
	public void redbus()
	{
		System.out.println("Redbus test cases");
	}
	@Test(priority=2)
	public void wikipedia()
	{
		System.out.println("Wikipedia test cases");
	}
	@Test(priority=2)
	public void gmail()
	{
		System.out.println("Gmail test cases");
	}
}
