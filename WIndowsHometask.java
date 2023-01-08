package Hometask;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowsHometask {

	public static void main(String[] args) throws Exception {
		// Create a new instance of Chrome driver
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
		        // Open URL
		        driver.get("https://demoqa.com/browser-windows");
		        
		        String mainWindowHandle = driver.getWindowHandle();
		        
		        WebElement clickElement = driver.findElement(By.id("windowButton")); 
		        
		        for(int i = 0; i < 5; i++)
		        {
		        clickElement.click();
		        Thread.sleep(1000);
		        }
		        
		        /*Window handle is a unique string value that uniquely identifies a Browser window on desktop*/
		        /*getWindowHandle() method return a string value and it returns the Window handle of current focused browser window. getWindowHandles() method returns a set of all Window handles of all the browsers that were opened in the session.*/
		        Set<String> allWindowHandles = driver.getWindowHandles();
		        
		        for(String handle : allWindowHandles)
		        {
		        	if(!handle.equalsIgnoreCase(mainWindowHandle)) {
		        		driver.switchTo().window(handle);
		        		driver.get("https://google.com");
		        		Thread.sleep(2000);
		        		
		        		}else {
		        		driver.switchTo().window(mainWindowHandle);
		        		}
		        }
		        driver.switchTo().window(mainWindowHandle);
		        driver.quit();
	}
}