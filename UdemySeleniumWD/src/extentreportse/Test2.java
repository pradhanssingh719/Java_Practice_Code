/**
 * run Test1 and Test2 class by using testng-extent.xml file
 */

package extentreportse;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test2 {
	
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = ExtentFactory.getInstance();
		test = report.startTest("Test2 Class Testing");
	}

	@AfterClass
	public void afterClass() {
		report.endTest(test);
		report.flush();
	}

	@Test
	public void testmethod1() {
		test.log(LogStatus.INFO, "testmethod1 started..");
	}
	
	@Test
	public void testmethod2() {
		test.log(LogStatus.INFO, "testmethod2 started..");
	}

}
