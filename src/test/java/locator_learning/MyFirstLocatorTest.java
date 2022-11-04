package locator_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstLocatorTest {
	@Test
	
       public void myFirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();
		
		//go to google web page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Maximize the browser window
		driver.manage().window().maximize();
		
		 
		WebElement header = driver.findElement(By.tagName("h1"));
		String textString = header. getText(); 
		System.out.println(textString);
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1" ));
		checkbox1.click();
		 
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2" ));
		checkbox2.click();
		
		WebElement tab = driver.findElement(By.className("switch-tab"));
		System.out.println(tab.getText());
		
		WebElement linkElement1 = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")); 
		System.out.println("Link Tag Name " +linkElement1.getTagName());
		
		WebElement linkElement2 = driver.findElement(By.partialLinkText("Free Access to InterviewQues")); 
		System.out.println("Link Tag Name " +linkElement2.getText());
		
		WebElement inputTextElement = driver.findElement(By.xpath( "//input[@id='autocomplete']"));
		inputTextElement.sendKeys("Locator Test");
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		
		WebElement inputText = driver.findElement(By.cssSelector( "input[id='name']"));
		inputText.sendKeys("Ria Sarkar");
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		
		WebElement selectItemElement = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		selectItemElement.click();
		
		WebElement option2 = driver.findElement(By.xpath("//option[@value='option2']"));
		option2.click();
		
		
		//wait for 5 seconds
				Thread.sleep(5000);
				
		
		//close the browser all active windows
		driver.quit();
	}

}
