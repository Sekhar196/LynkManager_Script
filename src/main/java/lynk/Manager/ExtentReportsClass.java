package lynk.Manager;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsClass {
	
	static ExtentReports extent;
	public ExtentTest ExtentReports;
	

    @BeforeTest
    
    public static ExtentReports extentReports()
    {
    	String path = System.getProperty("user.dir")+"\\reports\\index.html";
    	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    	reporter.config().setReportName("Lynk Manager Automation Results ");
    	reporter.config().setDocumentTitle("Lynk Manager Automation");
    	
    	extent = new ExtentReports();
    	extent.attachReporter(reporter);
    	extent.setSystemInfo("Tester", "Sekhar Kasi");
		return extent;
    	
    	
    }

}
