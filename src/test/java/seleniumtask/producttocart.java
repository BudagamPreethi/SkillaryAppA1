package seleniumtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class producttocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(30000);
        driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
        driver.findElement(By.id("Email")).sendKeys("budagampreethi99@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Preethi@999");
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        
      // Thread.sleep(2000);
        driver.close();
	}

}
