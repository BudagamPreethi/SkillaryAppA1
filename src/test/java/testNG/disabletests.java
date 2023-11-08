package testNG;

import org.testng.annotations.Test;

public class disabletests {
	@Test(enabled =true)
	public void demo1() {
			System.out.println("demo1-t");
	}
	@Test(enabled =false)
	public void demo2() {
			System.out.println("demo2-f");
		
	}
}
