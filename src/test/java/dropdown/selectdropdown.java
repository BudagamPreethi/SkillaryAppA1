package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement allDropdown =driver.findElement(By.id("searchDropdownBox"));
		Select s= new Select(allDropdown);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=audible");
		Thread.sleep(3000);
		s.selectByVisibleText("Toys & Games");
		 List<WebElement> ddList = s.getOptions();
		 for(WebElement e :ddList) {
			 System.out.println(e.getText());
			 
		 }
  if(s.isMultiple())
	  System.out.println("Multi select");
  else
	  System.out.println("Single select");
  driver.quit();
	}

}
