package lynk.Manager;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactSecondBuyer extends DefaultProgram {
	
	By secondBuyer                 = By.xpath("//label[text()='Autres Acquéreurs']");
	By acquire                     = By.xpath("//button[text()=' Créer un autre acquéreur ']");
	By preNom                      = By.xpath("//input[@formcontrolname='firstName']");
	By nom                         = By.xpath("//input[@formcontrolname='lastName']");
	By email                       = By.xpath("//input[@formcontrolname='email']");
	By telephoneCode               = By.xpath("//input[@role='combobox']");
	By chooseCountry               = By.xpath("//span[text()='India(+91)']");
	By numberText                  = By.xpath("//input[@formcontrolname='tempNumber']");
	By relationship                = By.xpath("//input[@formcontrolname='relation_name']");
	By save                        = By.xpath("//button[text()='Sauvegarder']");
	By saveToasterMessage          = By.xpath("//div[text()=' Sauvegardé ']");
	
	By contactDropDown             = By.id("mat-select-4");
	By dropdownSearch              = By.xpath("(//input[@placeholder='Rechercher...'])[2]");
	
	
	
	
	/** To Check For Second Buyer Screen */
	public void secondBuyerScreen()
	{
		linkForSecondBuyer();
		linkForAcquire();
//		enterPreNom();
//		enterName();
//		enterEmail();
//		enterPhone();
//		enterRelationship();
//		save();
	}
	
	/** To Check For Second Buyer Screen Link */
	public void linkForSecondBuyer()
	{
		WebDriverWait wait = new WebDriverWait(driver, 99);
    	wait.until(ExpectedConditions.elementToBeClickable(secondBuyer));
		WebElement link            = driver.findElement(secondBuyer);
		link.click();
	}
	
	/** To Check For Acquire Link */
	public void linkForAcquire()
	{
		waitForElementClick(acquire);
		WebElement acq             = driver.findElement(acquire);
		acq.click();
	}
	
	/** To Check For Enter First Name */
	public void enterPreNom()
	{
		WebElement FN              = driver.findElement(preNom);
		int text = new Random().nextInt(1000);
		FN.sendKeys("Rocker" + text);
	}
	
	/** To Check For Enter Name */
	public void enterName()
	{
		WebElement LN              = driver.findElement(nom);
		LN.sendKeys("Rock");
	}
	
	/** To Check For Enter Email */
	public void enterEmail()
	{
		WebElement emailID         = driver.findElement(email);
		int text = new Random().nextInt(1000);
		emailID.sendKeys("win" + text + "@gmail.com");
	}
	
	/** To Check For Enter Phone Number */
	public void enterPhone()
	{
		WebElement telecode        = driver.findElement(telephoneCode);
		telecode.click();
		WebElement selCountry      = driver.findElement(chooseCountry);
		selCountry.click();
		WebElement phoneNum        = driver.findElement(numberText);
		int text = new Random().nextInt(1000);
		phoneNum.sendKeys("6578874"+text);
	}
	
	/** To Check For Enter Relationship */
	public void enterRelationship()
	{
		WebElement relation        = driver.findElement(relationship);
		relation.sendKeys("Friend");
	}
	
	/** To Check For Click On Save */
	public void save()
	{
		WebElement saveBtn         = driver.findElement(save);
		saveBtn.click();
	}
	
	public void getToasterMessage()
	{
		waitForElement(saveToasterMessage);
		WebElement toaster        = driver.findElement(saveToasterMessage);
		System.out.println(toaster.getAttribute("value"));
	}

}
