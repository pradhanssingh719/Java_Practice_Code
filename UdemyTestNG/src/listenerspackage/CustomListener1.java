/***
 * in this class I am working on IInvokedMethodListener 
 * every listener is an interface so first we need to implements them
 */

package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {    //it will run before every method (all method present in the class which every class going to implement it)
		System.out.println("beforeInvocation: " + testResult.getTestClass().getName() + 
				" => " + method.getTestMethod().getMethodName() );
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("AfterInvocation: " + testResult.getTestClass().getName() + 
				" => " + method.getTestMethod().getMethodName() );
	}

}
