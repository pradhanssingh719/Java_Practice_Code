/***
 * in this class I am working on IInvokedMethodListener 
 * every listener is an interface so first we need to implements them
 */

package listenerspackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart: it will run before every test method (@Test) annotation. => " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess: it will run on test success. => " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure: it will run on test failure. => " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped: it will run on test skip. => " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//this one is rarely used one
	}

	@Override
	public void onStart(ITestContext context) {                                                //can be used for printing all the test method which will going to run...
		System.out.println("onStart: it will run before every test tag in xml file. => " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method : methods) {
			System.out.println(method.getMethodName());
		}	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish: it will run after every test tag in xml file. => " + context.getName());
	}

}
