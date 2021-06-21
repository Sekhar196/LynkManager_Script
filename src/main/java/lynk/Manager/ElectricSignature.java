package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElectricSignature extends DefaultProgram {
	
	
	 By emailSignMenuLink                    = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[14]");
	 By emailSignScreenLink                  = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[14]/a");
	 By avancement                           = By.xpath("//*[@id=\"wrapper\"]/div/div/app-signature-electronique/div/div[3]/div[2]/app-sort-table/table/tbody/tr[2]/td[5]/div");
	 By resendMailLink                       = By.xpath("//button[text()='Renvoyer l’email']");
	 By electricSignActions                  = By.xpath("//span[@class='item-label']");
	 By numberOfContacts                     = By.xpath("//div[text()='Reservation']");
	 
	 
	 
	 public void clickOnMenuLink()
	 {
		 WebElement menu                    = driver.findElement(emailSignMenuLink);
		 menu.click();
	 }
	 public void clickOnScreenLink()
	 {
		 WebElement screen                  = driver.findElement(emailSignScreenLink);
		 screen.click();
	 }
	 public void clickOnAvancement()
	 {
		 WebElement avance                  = driver.findElement(avancement);
		 avance.click();
	 }
	 public void clickOnOutSide()
	 {
		 WebElement out                     = driver.findElement(By.xpath("//span[text()='Avancement ']"));
		 out.click();
	 }
	 public void selectAction() throws InterruptedException
	 {
		 Thread.sleep(2000);
		List<WebElement> act                = driver.findElements(electricSignActions);
		for (WebElement chooseAction : act) {
			if(chooseAction.getText().equals("Terminé"))
			{
				chooseAction.click();
			}
			
		}
	 }
	 public void getSizeOfContacts()
	 {
		 WebElement size                    = driver.findElement(numberOfContacts);
		 System.out.println(size.getText());
	 }
	 public void clickOnResendEmail()
	 {
		 WebElement resend                  = driver.findElement(resendMailLink);
		 resend.click();
	 }
	 
	 

}
