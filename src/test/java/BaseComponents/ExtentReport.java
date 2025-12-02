package BaseComponents;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	
	public static ExtentReports createReport()
	{
		
		String path="C:\\Users\\chava\\eclipse-workspace\\AmazonProj\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Reports");
		
		ExtentReports report =new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Reporter", "Rati");
		
		return report;
	}
}
