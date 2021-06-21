package lynk.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;


public class AdminLogin extends DefaultProgram{
	ExtentReports extent;
	
	By emailLink     = By.xpath("//h1[text()='Sign in']//..//input[@placeholder='yourmail@gmail.com']");
	By passwordLink  = By.xpath("//input[@formcontrolname='password']");
	By loginbutton   = By.xpath("//button[text()='Se connecter']");
	By emailErrorMsg = By.xpath("//div[text()=' The email address is badly formatted. ']");
	By pwdErrorMsg   = By.xpath("//div[text()=' The password is invalid or the user does not have a password. ']");
	By invalidCred   = By.xpath("//div[text()=' There is no user record corresponding to this identifier. The user may have been deleted. ']");
	By logOut        = By.xpath("//span[text()='admin@arlynk.com']");
	By logOutLink    = By.xpath("//span[text()='Logout']");
	
	
	/** Login with Admin credentials */
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
	
	/** Invalid email error Message */
	public String verifyEmailErrorMsg()
	{
		waitForElement(emailErrorMsg);
		WebElement ErrorMsg = driver.findElement(emailErrorMsg);
		String ActualErrorMsg = ErrorMsg.getText();
		System.out.println();
		Assert.assertEquals(ActualErrorMsg, "The email address is badly formatted.");
		return ActualErrorMsg;
					
	}
	
	/** Invalid password error message */
	public String verifyPasswordErrorMsg()
	{   
		waitForElement(pwdErrorMsg);
		WebElement errorMsg = driver.findElement(pwdErrorMsg);
		String actualErrorMsg = errorMsg.getText();
		System.out.println();
		Assert.assertEquals(actualErrorMsg, "The password is invalid or the user does not have a password.");
		return actualErrorMsg;
	}
	
	/** Invalid Credentials error message */
	public String verifyInvalidCredentialsErrorMsg()
	{   
		waitForElement(invalidCred);
		WebElement errorMsg   = driver.findElement(invalidCred);
		String actualErrorMsg = errorMsg.getText();
		System.out.println();
		Assert.assertEquals(actualErrorMsg, "There is no user record corresponding to this identifier. The user may have been deleted.");
		return actualErrorMsg;
	}
//	public void LogOut()
//	{
//		waitForElement(logOut);
//		WebElement signOut = driver.findElement(logOut);
//		signOut.click();
//		waitForElement(logOutLink);
//		WebElement signOutLink = driver.findElement(logOutLink);
//		signOutLink.click();
//	}
	

}
