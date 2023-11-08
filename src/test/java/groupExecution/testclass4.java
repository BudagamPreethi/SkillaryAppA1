package groupExecution;

import org.testng.annotations.Test;

public class testclass4 {
	@Test
	public void demo1() {
		System.out.println("testclass4-demo1");
	}
	@Test(groups ={"smoke","regression","sanity"})
	public void demo2() {
		System.out.println("testclass4-demo2-smoke,regression,sanity");
	}
	@Test
	public void demo3() {
		System.out.println("testclass1-demo3 ");
	}
}
