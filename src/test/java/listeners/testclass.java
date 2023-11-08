package listeners;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.listenersclass.class)

public class testclass  extends baseclasss {

		

	@Test
	public void test0() {
		System.out.println("@test - test0");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test0")
	public void test1() {
		System.out.println("@test- test1");
	}
}
