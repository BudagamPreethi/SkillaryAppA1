package seleniumtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Preethi");
		driver.findElement(By.name("LastName")).sendKeys("Budagam");
		driver.findElement(By.id("Email")).sendKeys("preethipreethi1099@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcd1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd1234");
		driver.findElement(By.name("register-button")).click();

		Thread.sleep(3000);
		
		driver.close();
		
	}
}