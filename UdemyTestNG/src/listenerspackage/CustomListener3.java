/***
 * in this class I am working on IInvokedMethodListener 
 * every listener is an interface so first we need to implements them
 */

package listenerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart: before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish: after suite completes");
	}

}
