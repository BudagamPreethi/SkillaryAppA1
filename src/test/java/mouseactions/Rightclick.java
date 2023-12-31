package mouseactions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement electronics = driver.findElement(By.xpath("//a[.\"Today's Deals\"]"));
			
			Actions action = new Actions(driver);
			action.moveToElement(electronics).perform();
			Thread.sleep(3000);
			driver.close();
	}

}
