package lynk.Manager;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class DefaultProgram{
	
	ExtentReports extent;
	
//	By emailLink     = By.xpath("//h1[text()='Sign in']//..//input[@placeholder='yourmail@gmail.com']");
//	By passwordLink  = By.xpath("//input[@formcontrolname='password']");
//	By loginbutton   = By.xpath("//button[text()='Se connecter ']");
	
	By emailLink     = By.xpath("//h1[text()='Sign in']//..//input[@placeholder='yourmail@gmail.com']");
	By passwordLink  = By.xpath("//input[@formcontrolname='password']");
	By loginbutton   = By.xpath("//button[text()='Se connecter']");
		   
		public static WebDriver driver;
				
		@BeforeSuite
		public void browserLaunching() throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  		driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://test-e10ce.firebaseapp.com/properties");
			
			driver.get("https://lynk-sales.firebaseapp.com/authentication/login");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//loginToLynkmanager("demo@arlynk.com","123456a");
			loginToLynkmanager("sekhar@softsuave.com","123456a");
		}
		
//		@BeforeTest
//		
//		public void config()
//		{
//			String path =System.getProperty("user.dir")+"\\reports\\index.html";
//			ExtentSparkReporter report = new ExtentSparkReporter(path);
//			report.config().setReportName("Lynk manager Automation results");
//			
//			extent = new ExtentReports();
//			extent.attachReporter(report);
//		}
		
		@Test
		public void loginToLynkmanager()
		{
			
			loginToLynkmanager("demo@arlynk.com","123456a");
		
		}	
		
		public void loginToLynkmanager(String email ,String Pwd)
		{	
			WebElement EmailID = driver.findElement(emailLink);
			WebElement Password = driver.findElement(passwordLink);
			WebElement Login = driver.findElement(loginbutton);
			EmailID.sendKeys(email);
			Password.sendKeys(Pwd);
			Login.click();	
			
		}
		
		
		
		public void waitForElement(By locator) 
		{
		WebDriverWait wait = new WebDriverWait(driver, 99);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	
		
		
		public void waitForElementClick(By locator) 
		{
		WebDriverWait wait = new WebDriverWait(driver, 95);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
 	    }
	
	    public WebElement returnWebElement(By locator)
	    {
		WebElement ele = driver.findElement(locator);
		return ele;
	    }
	    
	    public static void takeSnapShot(String fileWithPath) throws Exception{

	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File(fileWithPath);
	        FileUtils.copyFile(SrcFile, DestFile);

	      }
    
       	
    }
   
    
    
    	



	

