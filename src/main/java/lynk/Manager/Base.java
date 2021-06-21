package lynk.Manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver intialiseBrowser() throws IOException
	{
		Properties prop       = new Properties();
		FileInputStream fis   = new FileInputStream("C:\\Users\\softsuave\\eclipse-workspace\\Manager\\src\\main\\java\\lynk\\Manager\\Data.Properties");
		prop.load(fis);
		
		String browserName    = prop.getProperty("browser");
		
		if(browserName == "chrome")
		{
			driver     = new ChromeDriver();
			System.setProperty("webdiver.web.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		}
		
		else if(browserName == "FireFox")
		{
			driver     = new FirefoxDriver();
		}
		
		else if(browserName == "IE")
		{
			driver     = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		return driver;
		
	}

}
