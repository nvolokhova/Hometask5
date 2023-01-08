package Hometask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameExercise2 {

	public static void main(String[] args) {
		// Create a new instance of Chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        // Open URL
        driver.get("https://www.qaevolution.com/websandbox.html");
        
      //First find the element using any of locator stratedgy
		 WebElement iframeElement = driver.findElement(By.id("IF2"));
		 
		//now use the switch command
		 driver.switchTo().frame(iframeElement);
		 
		 WebElement headerText = driver.findElement(By.cssSelector("body > header > div > div > div.logo >h1"));
		 System.out.println("The Header Text of the second iFrame is " + headerText.getText());
		 
					 
		  driver.quit();

	}

}
