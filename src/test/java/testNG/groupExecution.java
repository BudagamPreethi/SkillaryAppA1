package testNG;

import org.testng.annotations.Test;

public class groupExecution {

	@Test(groups ="smoke")
	public void demo1() {
		System.out.println("testclass1-demo1-smoke");
	}
	@Test(groups ="sanity")
	public void demo2() {
		System.out.println("testclass1-demo2-sanity");
	}
	@Test(groups ={"smoke","sanity"})
	public void demo3() {
		System.out.println("testclass1-demo-smoke and sanity");
	}
}
