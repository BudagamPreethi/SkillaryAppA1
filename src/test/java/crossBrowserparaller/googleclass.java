package crossBrowserparaller;

import org.testng.annotations.Test;

public class googleclass extends  Baseclass{
	
	@Test
public  void test() throws InterruptedException {
	
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
}
}
