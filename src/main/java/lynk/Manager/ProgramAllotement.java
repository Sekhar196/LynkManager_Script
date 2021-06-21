package lynk.Manager;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgramAllotement extends DefaultProgram {
	
	By assignProgram                  = By.xpath("//span[text()=' Assigner le programme ']");
	By SellerInCompany                = By.xpath("//span[text()='Vendeur dans votre entreprise']");
	By sellerDropdown                 = By.xpath("//label[text()='Vendeur existant']/../select/*");
	By addAnewSeller                  = By.xpath("//option[@class='new-salesman']/i");
	By lastName                       = By.xpath("//input[@id='nom']");
	By firstName                      = By.xpath("//input[@id='prenom']");
	By role                           = By.xpath("//select[@class='form-control ip-custom']/option");
	By email                          = By.xpath("//input[@id='email']");
	By telephone                      = By.xpath("//input[@id='telephone']");
	By addSeller                      = By.xpath("//button[text()=' Ajouter ']");
	By externalMarketer               = By.xpath("//span[text()='Commercialisateur externe']");
	By extMarketerDropDown            = By.xpath("//label[text()='Vendeur existant']/../select/*");
    By agency                         = By.xpath("//label[text()='Agence']/../select");
    By linkForSave                    = By.xpath("//button[text()='Sauvegarder']");
	By linkForClose                   = By.xpath("//span[@class='close-btn']/i");
	
	
	/** To Check For Click On Assign Program */
	public void assignPrograme()
	{
		waitForElement(assignProgram);
		WebElement assign            = driver.findElement(assignProgram);
		assign.click();
	}
	
	/** To Check For Seller In Your Company */
	public void sellerInYourCompany()
	{
		waitForElement(SellerInCompany);
		WebElement inside            =  driver.findElement(SellerInCompany);
		inside.click();
	}
	
	/** To Check For Select Seller From Drop Down */
	public void sellDropdown()
	{
		List<WebElement> drop        = driver.findElements(sellerDropdown);
		for (WebElement seller : drop) {
			if(seller.getText().equals("Kasi Sekhar"))
			{
				seller.click();
			}
			
		}
	}
	
	/** To Check For Add New Seller */
	public void addNewSeller()
	{
//		waitForElement(sellerDropdown);
//		WebElement drop               = driver.findElement(sellerDropdown);
//		drop.click();
//		waitForElement(addAnewSeller);
//		WebElement newSeller          = driver.findElement(addAnewSeller);
//		newSeller.click();
		WebElement LN                 = driver.findElement(lastName);
		LN.sendKeys("Lesnar");
		WebElement FN                 = driver.findElement(firstName);
		FN.sendKeys("Brock");
		WebElement emailID            = driver.findElement(email);
		emailID.sendKeys("asdf@gmail.com");
		List<WebElement> sellerRole   = driver.findElements(role);
		for (WebElement selectRole : sellerRole) {
			if(selectRole.getText().equals("Manager"))
			{
				selectRole.click();
			}
			
		}
		WebElement number             = driver.findElement(telephone);
		number.sendKeys("9654785426");
		
	}
	
	/** To Check For Click On Add Button */
	public void addButton()
	{
		WebElement btn                = driver.findElement(addSeller);
		btn.click();
	}
	
	/** To Check For Click On External Marketer */
	public void externalMark()
	{
		waitForElement(externalMarketer);
		WebElement external           = driver.findElement(externalMarketer);
		external.click();
	}
	
	/** To Check For Select External Marketer From Drop Down */
	public void externalMarkDropdown()
	{
		List<WebElement> extDropdown  = driver.findElements(extMarketerDropDown);
		for (WebElement selectSeller : extDropdown) {
			if(selectSeller.getText().equals(" AJOUTER UN NOUVEAU VENDEUR "))
			{
				selectSeller.click();
			}
			
		}
		
	}
	/** To Check For Adding New External Seller */
    public void addNewExternalSeller()
    {
    	WebElement LN                 = driver.findElement(lastName);
		LN.sendKeys("Lesnar");
		WebElement FN                 = driver.findElement(firstName);
		FN.sendKeys("Brock");
		WebElement emailID            = driver.findElement(email);
		int text = new Random().nextInt(1000);
		emailID.sendKeys("asdf@gmail.com"+text);
		List<WebElement> sellerRole   = driver.findElements(role);
		for (WebElement selectRole : sellerRole) {
			if(selectRole.getText().equals("Agence"))
			{
				selectRole.click();
			}
			
		}
		WebElement number             = driver.findElement(telephone);
		number.sendKeys("9654785426");
		List<WebElement> Agency       = driver.findElements(agency);
		for (WebElement selectAgent : Agency) {
			if(selectAgent.getText().equals("master"))
			{
				selectAgent.click();
			}
			
		}
				
    }
    
    /** Click On Save */
    public void saveButton()
    {
    	waitForElement(linkForSave);
    	WebElement save               = driver.findElement(linkForSave);
    	save.click();
    }
    
    /** Click On Close */
    public void closeButton()
    {
    	waitForElement(linkForClose);
    	WebElement close              = driver.findElement(linkForClose);
    	close.click();
    }
    
}
