package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTab).perform();
		driver.findElement(By.xpath("")).click();
		WebElement quantity =driver.findElement(By.id("quantity"));
		int initialVal =Integer.parseInt(quantity.getAttribute(""));
		a.doubleClick(driver.findElement(By.id(""))).perform();
		int finalVal =Integer.parseInt(quantity.getAttribute(""));
		if(finalVal == (initialVal+1))
			System.out.println("test pass");
		else
			System.out.println("teast fail");
		driver.quit();
			
	}

}
