package lynk.Manager;



import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends DefaultProgram implements ITestListener{

	ExtentTest test;
	ExtentReports extent = ExtentReportsClass.extentReports();
	@Override
	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub

		ExtentTest test = extent.createTest("Login");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub

		test.log(Status.PASS,("Test Passed"));
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		}catch(Exception e)
		{
			
		}
//		try {
//			getScreenshotPath(testMethodName, driver);
//		}catch(IOException e)
//		{
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
	// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub

	}


	}

	

