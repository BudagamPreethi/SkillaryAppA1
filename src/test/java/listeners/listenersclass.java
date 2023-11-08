package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listenersclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
System.err.println("ontest start");	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.err.println("on test sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("ontest fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.err.println("on test skipped");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("onstart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.err.println("on finish");
	}
	
}


