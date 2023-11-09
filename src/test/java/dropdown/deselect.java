package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//done sucessfully
public class deselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown =driver.findElement(By.id("cars"));
		Select s =new Select(dropdown);
		if(s.isMultiple()) {
			s.selectByIndex(0);
			s.selectByValue("99");
			s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
			
			Thread.sleep(3000);
			
			System.out.println("First selected option: "+s.getFirstSelectedOption().getText());
			List<WebElement> selectedoptions = s.getAllSelectedOptions();
			System.out.println();
			for(WebElement e :selectedoptions) {
				System.out.println(e.getText());
				
				
			}
			//s.deselectAll();
			
			s.deselectByIndex(0);
			s.deselectByValue("99");
			s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
			
			
		}
		

	}

}
