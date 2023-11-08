package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependonmethod {
    @Test
	public void navigateToApp() {
    	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demo.actitime.com/login.do");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	WebElement logo = driver.findElement(By.className("atLogoImg"));
    	
    	if(logo.isDisplayed())
    		System.out.println("pass");
    	else
    		System.out.println("fail");
    	 driver.close();
		
	}
}
