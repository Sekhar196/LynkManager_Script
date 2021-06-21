package lynk.Manager;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;


public class loginForAdmin extends AdminLogin
{

    /**  To check login with Valid Credentials */
    @Test
    public void validCredentials()
    {
         loginToLynkmanager(); 
    }
    
    /** To check with Invalid Email */
    @Test
    public void invalidEmail_errorMessage()
    {
    	String invalidEmail = "admin@";
    	String validPwd     = "123456a";
    	loginToLynkmanager(invalidEmail, validPwd);
    	verifyEmailErrorMsg();
    }
    
    /** To check with Invalid Password */
    @Test
    public void invalidPwd_errorMessage()
    {
    	String validEmail  = "admin@arlynk.com";
    	String invalidPwd  = "123456";
    	loginToLynkmanager(validEmail, invalidPwd);
    	verifyPasswordErrorMsg();
    }
    
    /** To check with Invalid Credentials */
    @Test
    public void invalidCredentials_errorMessage()
    {
    	String invalidEmail = "admin@gmail.com";
    	String invalidPwd   = "123456";
    	loginToLynkmanager(invalidEmail, invalidPwd);
    	verifyInvalidCredentialsErrorMsg();
    }
//    @Test
//    public void logOut() throws InterruptedException 
//    {
//    	loginToLynkmanager();
//    	Thread.sleep(35000);
//    	//LogOut();
//    }
  
  }

