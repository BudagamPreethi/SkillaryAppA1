package groupExecution;

import org.testng.annotations.Test;

public class testclass2 {
	@Test(groups ="regression")
	public void demo1() {
		System.out.println("testclass2-demo1-regression");
	}
	@Test(groups ="sanity")
	public void demo2() {
		System.out.println("testclass2-demo2-sanity");
	}
	@Test(groups ={"regression","sanity"})
	public void demo3() {
		System.out.println("testclass2-demo3-regression and sanity");
	}
}
