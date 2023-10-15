package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import BasePackage.BaseClass;

 public class EndToEndTelecomFlow extends BaseClass{

	@BeforeClass()
	public void setup() {
		BaseClass.initization();
	}
	
	public static void verifyStatusAndEnterText(WebElement wb,String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void verifyStatusAndClick(WebElement wb)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static String createNewCustomer(String fname,String lname,String email,String address,String mobileno)
	{
		WebElement addbutton=driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		
		
		WebElement done=driver.findElement(By.name("active"));
		
		
		WebElement name=driver.findElement(By.name("fname"));
		
		
		WebElement lastname=driver.findElement(By.name("lname"));
		
		
		WebElement emailid=driver.findElement(By.name("emailid"));
		
		
		WebElement add=driver.findElement(By.name("addr"));
		
		
		WebElement mobile=driver.findElement(By.name("telephoneno"));
		
		
		
		WebElement submit=driver.findElement(By.name("submit"));
		
		
		WebElement custid=driver.findElement(By.xpath("//b[text()='Customer ID']//following::h3"));
		String CustomerID=custid.getText();
		return CustomerID;
		
		
		
		
		
		
		
		
	}
		
		 

	}


