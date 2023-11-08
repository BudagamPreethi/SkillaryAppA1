package crossBrowserparaller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	
WebDriver driver;
@Parameters("Browser")

@BeforeClass
public void classconfigString(String browser) {
 switch (browser) {
 case "chrome":
	 System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	 driver = new ChromeDriver();
	 break;
 case "firefox":
	 WebDriverManager.firefoxdriver().setup();
	 driver = new FirefoxDriver();
	 break;
 case "edge":
	 WebDriverManager.firefoxdriver().setup();
	 driver = new EdgeDriver();
	 break;
	 default:
		 System.out.println("invalid browser info");
}
 driver.manage().window().maximize();
 
	
}
private void classTearDown() {
	driver.close();
	
}

}
