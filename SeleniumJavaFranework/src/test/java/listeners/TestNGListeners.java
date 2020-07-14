package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {


	public void onTestStart(ITestResult result) {
		System.out.println("***************Teste Started:"+result.getName());


	}
//	public void onStart(ITestContext arg0) {
//
//
//	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("***************Teste passed:"+result.getName());

	}
	public void onTestFailure(ITestResult result) {
		System.out.println("***************Teste faild:"+result.getName());


	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("***************Teste skipped:"+result.getName());

	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {


	}
	
	public void onFinish(ITestContext context) {
		System.out.println("***************Teste Completed:"+context.getName());


	}
	public void onStart(ITestContext context) {
		System.out.println("***************Teste on start:"+context.getName());


	}

}
