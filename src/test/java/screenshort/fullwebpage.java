package screenshort;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class fullwebpage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	     Screenshot sc=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
			           .takeScreenshot(driver);
	
	ImageIO.write(sc.getImage(),"PNG", new File("./Screenshot/fullPagesSS.png"));
	
	driver.quit();
		
		
		
		
	}

}
