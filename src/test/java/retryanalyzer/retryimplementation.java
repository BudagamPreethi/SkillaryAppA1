package retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryimplementation  implements IRetryAnalyzer {
	int count;
	int maxRetries =3;
	@Override
	
	public boolean retry(ITestResult result) {
		
		if(count<maxRetries) {
			if(count< maxRetries) {
				count++;
				return true;
			}
			return false;
		}
		return false;
	}

}
