package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertpractice {

	@Test
	public void demo() {
		SoftAssert soft =new SoftAssert();
		
	String s1 = "hello";
	String s2 = "hiii";
	soft.assertEquals(s1, s2);
	System.out.println(s1);
	System.out.println(s2);
	
	soft.assertAll();
	}
}
