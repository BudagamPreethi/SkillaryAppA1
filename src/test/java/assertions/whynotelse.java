package assertions;

import org.testng.annotations.Test;

public class whynotelse {
@Test
	public void demo() {
		
	String s1 = "hello";
	String s2 = "hiii";
			if(s1.equals(s2))
				System.out.println("pass");
			else
				System.out.println("fail");
	}
}
