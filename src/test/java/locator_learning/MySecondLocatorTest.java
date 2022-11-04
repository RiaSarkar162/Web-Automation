package locator_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySecondLocatorTest {
	@Test
	
       public void myFirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();
		
		//go to google web page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Maximize the browser window
		driver.manage().window().maximize();
		
		 
		 
		
		//wait for 5 seconds
				Thread.sleep(5000);
				
		
		//close the browser all active windows
		driver.quit();
	}

}
