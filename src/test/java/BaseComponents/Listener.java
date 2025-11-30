package BaseComponents;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listener extends BaseComponents implements ITestListener{
	
	ExtentReports rr=ExtentReport.createReport();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=rr.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL, "Test Failed");
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		rr.flush();
	}
	
	
	

}
