package screenshort;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowscreenshort {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String date = getTime();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/windowSS.png"+date+".png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		driver.close();
			

	}
	public static String getTime() {
		
		Date date = new Date(0);
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		return sdf.format(date);
		
	}

}
