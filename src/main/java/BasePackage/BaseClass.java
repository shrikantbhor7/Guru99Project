
package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   
	public class BaseClass {
    	public static WebDriver driver;
    	
	public static void initization()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	

}
}