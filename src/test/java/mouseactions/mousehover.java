package mouseactions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement homeAndLiving = driver.findElement(By.xpath("//a[text()='Home & Living'and@class]"));
		Actions a = new Actions(driver);
		a.moveToElement(homeAndLiving).perform();
		driver.findElement(By.xpath("//a[text()='Clocks']")).click();
		if(driver.getCurrentUrl().contains("clocks"))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
		driver.quit();
		

	}

}
