package mouseactions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement block1 =driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3 =driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(block1, block3).perform();
		Thread.sleep(9000);
		driver.quit();
	}

}
