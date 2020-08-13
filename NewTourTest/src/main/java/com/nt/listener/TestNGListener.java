package com.nt.listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.nt.base.UIBase;
import com.nt.report.ExtentManager;
import com.nt.report.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

public class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started: " + result.getName());
		ExtentTestManager.startTest(result.getName(), "");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed: " + result.getName());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: " + result.getName());
		String fileDestination = System.getProperty("user.dir") + "/screenshots/";
		String fileName = result.getName() + "_"
				+ (new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss").format(new GregorianCalendar().getTime())) + ".png";
		File screenshot = ((TakesScreenshot) UIBase.driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenshot, new File(fileDestination + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String screnshotFileName = fileDestination + fileName;
		String faildeImagePath = ExtentTestManager.getTest().addScreenCapture(screnshotFileName);
		ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed", faildeImagePath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped: " + result.getName());
		ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failed but with in success percentage: " + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag started: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished: " + context.getName());
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

}
