package extentreportse;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {

	public static ExtentReports getInstance() {
		//String path = "D:\\Downloads\\asdlfjl.html";
		String path = "D:\\Programming (Imp)\\JAVA\\UdemySeleniumWD\\src\\extentreportse\\log-report.html";
		ExtentReports report = new ExtentReports(path,true);     //we are providing "false" here because we want to append previously present report file 
		return report;										//if we set it to "true"(default value) then it will generate a brand new file for every run and previously present file will be lost
	}
}
