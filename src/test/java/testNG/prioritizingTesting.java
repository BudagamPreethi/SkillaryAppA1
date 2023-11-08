package testNG;

import org.testng.annotations.Test;

public class prioritizingTesting {
	
	@Test
public void demo1() {
		System.out.print("demo1");
	
}
	@Test(priority = -2)
public void demo2() {
		System.out.print("demo2");
	
}
	@Test(priority = -4)
public void demo3() {
		System.out.print("demo3");
	
}
	@Test(priority = 2)
public void demo4() {
		System.out.print("demo4");
	
}
	@Test(priority = 8)
public void demo5() {
		System.out.print("demo5");
	
}
	@Test(priority = 9)
public void demo6() {
		System.out.print("demo6");
	
}
}
