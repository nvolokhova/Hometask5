package Hometask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HometaskMouseHover1 {

	public static void main(String[] args) {
		
	    // Create a new instance of Chrome driver
	    WebDriver driver = new ChromeDriver();

	 // Launch the URL 
        driver.get("https://demoqa.com/menu/");
        System.out.println("demoqa webpage Displayed");
        
    	//Maximise browser window
        driver.manage().window().maximize();
	    
        //Adding wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Instantiate Action Class        
        Actions actions = new Actions(driver);
        
      //Retrieve WebElement 'Main Item 2' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
    	//Mouse hover menuOption 'Main Item 2'
    	actions.moveToElement(menuOption).perform();
    	System.out.println("Done Mouse hover on 'Main Item 2' from Menu");
    	
    	//Now Select 'Main Item 2' from sub menu which has got displayed on mouse hover of 'Music'
    	WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")); 
    	//Mouse hover menuOption 'SUB SUB List'
    	actions.moveToElement(subMenuOption).perform();
    	System.out.println("Done Mouse hover on 'SUB SUB List' from Menu");
    	

    	//Now , finally, it displays the desired menu list from which required option needs to be selected
    	//Now Select 'Sub Sub Item 1' from sub menu which has got displayed on mouse hover of 'Rock'
    	WebElement selectMenuOption = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
    	selectMenuOption.click();
    	System.out.println("Selected 'Sub Sub Item 1' from Menu");
    	
    	driver.quit();

	}

}
