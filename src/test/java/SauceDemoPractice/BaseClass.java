package SauceDemoPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


       public class BaseClass {
       WebDriver driver;
       String title;
    	
       @BeforeClass
       public void setup() throws InterruptedException
    {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   Thread.sleep(5000);
    }
       
       @Test(priority=1)
       public void login() throws InterruptedException
    {
    	   
    	   driver.findElement(By.id("user-name")).isDisplayed();
    	   driver.findElement(By.id("user-name")).isEnabled();
    	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
    
    	   driver.findElement(By.id("password")).isDisplayed();
    	   driver.findElement(By.id("password")).isEnabled();
    	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
    
    	   driver.findElement(By.id("login-button")).isDisplayed();
    	   driver.findElement(By.id("login-button")).isDisplayed();
    	   driver.findElement(By.id("login-button")).click();
    }
       @Test(priority=2)
       public void homepage()
    {
    	   String title=driver.getTitle();
    	   System.out.println(title);
    }
       @Test(priority=3)
       public void homeurl()
    {
    	   String url=driver.getCurrentUrl();
    	   System.out.println(url);
    }
       @Test(priority=4)
       public void addchart()
    {
    	   driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    	   driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    	   driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    }
       @Test(priority=5)
       public void chartcontainer() 
    {
    	   driver.findElement(By.className("shopping_cart_link")).click();
    	   driver.findElement(By.id("checkout")).click();
    }
       @Test(priority=6)
       public void checkout() 
    {
    	   driver.findElement(By.id("first-name")).sendKeys("Shrikant");
    	   driver.findElement(By.id("last-name")).sendKeys("Bhor");
    	   driver.findElement(By.id("postal-code")).sendKeys("400084");
    	   driver.findElement(By.id("continue")).click();
    }
       @Test(priority=7)
       public void finish() 
    {
    	   driver.findElement(By.id("back-to-products"));
    }
       @Test(priority=8)
       public void verifytitle()
    {
    	   String verify=driver.getTitle();
    	   if(title.equals(verify))
    	   {
    		   System.out.println("title verified");
    	   }
    }
       @AfterClass
       public void closebrowser()
       {
    	   driver.close();
       }
       
       
       
       
       
}
