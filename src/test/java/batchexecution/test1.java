package batchexecution;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
@Test
	public void demo1() {
		System.out.println("TestClass1 - demo1");
	}
@Test
public void demo2() {
	System.out.println("TestClass1 - demo2");
	Assert.fail();
}
}
