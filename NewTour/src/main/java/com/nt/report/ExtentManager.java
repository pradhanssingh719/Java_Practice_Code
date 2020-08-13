package com.nt.report;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	public static ExtentReports extent = null;

	private ExtentManager() {
	}

	public static ExtentReports getInstance() {
		if (extent == null) {
			String path = System.getProperty("user.dir") + "/report/ExtentReportResult.html";
			extent = new ExtentReports(path, true);
		}
		return extent;
	}

}
