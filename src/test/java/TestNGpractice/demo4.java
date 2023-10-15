package TestNGpractice;

import org.testng.annotations.Test;

public class demo4 {
    @Test(dependsOnMethods={"loginpage"})
	public void regiterpage()
	{
		System.out.println("Register page test cases");
	}
    @Test(dependsOnMethods= {"paymentpage"})
	public void loginpage()
	{
		System.out.println("Login page test cases");
	}
    @Test(dependsOnMethods= {"paymentpage"})
	public void homepage()
	{
		System.out.println("Home page test cases");
	}
    @Test
	public void paymentpage()
	{
		System.out.println("Payement page test cases");
	}
}
