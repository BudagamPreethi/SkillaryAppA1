package crossBrowserparaller;

import org.testng.annotations.Test;

public class swiggiclass extends Baseclass {
	
	@Test
public  void test() throws InterruptedException {
	driver.get("https://www.swiggy.com/");
		
		Thread.sleep(3000);
}
}
