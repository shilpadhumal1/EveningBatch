package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testClasses.BaseClass;



public class Listner implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Started execution");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Is Failed");
		try {
			ScreenShot.screenShot(BaseClass.driver, result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" is started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" is finished");
		
	}

}
