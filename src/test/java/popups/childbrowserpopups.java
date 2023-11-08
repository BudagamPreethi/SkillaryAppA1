package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//ul[@class]/descendant::a[text()=' SkillRary Essay']")).click();
		Thread.sleep(2000);

		String parentid= driver.getWindowHandle();
		Set<String> ids =driver.getWindowHandles();
		
		for(String wid :ids) {
			driver.switchTo().window(wid);
			
		}
		
driver.findElement(By.id("mytext")).sendKeys("preethi");
driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
driver.close();
Thread.sleep(2000);


driver.switchTo().window(parentid);
driver.findElement(By.name("q")).sendKeys("core java");
driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();

Thread.sleep(4000);
driver.close();
		}

}
