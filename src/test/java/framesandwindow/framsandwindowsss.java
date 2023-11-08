package framesandwindow;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framsandwindowsss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement signIn = driver.findElement(By.xpath("//a[text()='login']")).click();
		//WebElement signin =driver.findElement(By.xpath("//span[text()='Sign In']")).click();
//		Actions action = new Actions(driver);
//		action.moveToElement(signin).perform();
//		
//		driver.switchTo().frame("//a[text()='login']").
	}

}
