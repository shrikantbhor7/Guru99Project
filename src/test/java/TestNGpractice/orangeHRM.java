package TestNGpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class orangeHRM {
    
	WebDriver driver;
	String empID;
	
	@BeforeClass
	public void setup()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=1)
	public void loginfunctinality()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@Test(priority=2)
	public void validateHomePageTitle()
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.equals("OrangeHrm"))
		{
			System.out.println("URL Test Case pass");
		}
		else
		{
			System.out.println("URL Test Case fail");
		}
		}
	
	@Test(priority=3)
	public void validateHomePage()
	{
		String actualurl=driver.getCurrentUrl();
		if(actualurl.contains("orangehrm"))
		{
			System.out.println("Home page TEst case is pass");
		}
		else
		{
			System.out.println("Home page Test case is fail");
		}
		
	}
	
	@Test(priority=4)
	public void homepagelogo()
	{
		boolean actuallogostatus=driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).isDisplayed();
	
	if(actuallogostatus)
	{
		System.out.println("logo case pass");
	}
	else
	{
		System.out.println("logo case fail");
	}
}
	
	@Test(priority=5)
	public void createnewemployee()throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Shrikant");
		driver.findElement(By.name("middleName")).sendKeys("Laxman");
		driver.findElement(By.name("lastName")).sendKeys("Bhor");
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).getAttribute(empID);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		}
	
	@Test(priority=6)
	public void moreemployeedetails() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='SIN Number']/following::input[1]")).sendKeys("987654321");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Nationality']/following::div[1]")).click();
		
		
		
		{
			WebElement abc;
		//	String b=abc.getText();
			Thread.sleep(100);
		//	if(b.equals("Indian"))
			{
		//		abc.click();
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	}
	
	@Test(priority=7)
	public void searchemployee() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]")).sendKeys(empID);

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
	}
	
	@Test(priority=8)
	
		public void deleteEmployee() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()=' Delete Selected ']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	
	}


	
	
}
