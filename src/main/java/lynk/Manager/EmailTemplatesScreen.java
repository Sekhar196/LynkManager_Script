package lynk.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EmailTemplatesScreen extends DefaultProgram{
	
	
	By emailScreenMenuLink                    = By.xpath("(//li[@onclick='closeMobNav()'])[10]");
	By emailScreenLink                        = By.xpath("(//span[@class='menu-name'])[10]");
	By outSideLink                            = By.xpath("//div[@class='edit-circle']");//("//div[@class='edit-circle ng-star-inserted']");
	By newTemplate                            = By.xpath("//button[text()=' Ajouter un nouveau modèle ']/..");//("//button[text()=' Ajouter un nouveau modèle ']");
	By subjectLink                            = By.xpath("//div[@id='emailTemplateSubject1']");
	By templateContent                        = By.xpath("//div[@id='emailTemplateContent1']");
	By personaliserButton                     = By.xpath("//button[text()='Personnaliser ']");
	By selectField                            = By.xpath("//select[@placeholder='recherche de jeton de contact']");
	By personaliserSaveButton                 = By.xpath("(//button[text()='Sauvegarder'])[2]");
	By saveButton                             = By.xpath("(//button[text()='Sauvegarder'])[1]");
	By editButton                             = By.xpath("//div[@class='edit-circle']");
	By deleteButton                           = By.xpath("//i[@class='icon-delete']");//("//div[@class='delete-circle ng-star-inserted']");
	By yesPopUp                               = By.xpath("//button[text()='OUI']");
	
	
	
	public void emailTemplateScreen() throws InterruptedException
	{
		clickOnOutSide();
		clickOnAddTemplate();
		enterSubject();
		enterTemplateContent();
		clickOnPersonalizer();
		selectCustomField();
		clickOnPersonaliserSave();
		clickOnSave();
		
	}
	public void clickOnEmailScreenLink() throws InterruptedException
	{
		WebElement emailLink                  = driver.findElement(emailScreenMenuLink);
        
        Actions act   = new Actions(driver);
        act.moveToElement(emailLink).build().perform();
    	
    	waitForElement(emailScreenLink);
		WebElement Link                       = driver.findElement(emailScreenLink);
		Link.click();
		Thread.sleep(12000);
	}
	public void clickOnOutSide()
	{
		WebElement out                        = driver.findElement(outSideLink);
		Actions ac = new Actions(driver);
		ac.moveToElement(out).build().perform();
		out.click();
		
		WebElement close                      = driver.findElement(By.xpath("(//div[@class='close-icon'])"));
		close.click();
	}
	public void clickOnAddTemplate() throws InterruptedException
	{
        waitForElementClick(newTemplate);
		WebElement addTemplate                = driver.findElement(newTemplate);
		addTemplate.click();
	}
	public void enterSubject()
	{
		WebElement subject                    = driver.findElement(subjectLink);
		subject.sendKeys("Information {{Bed Number} {City}} - {Property Name}");
	}
	public void enterTemplateContent()
	{
		WebElement template                   = driver.findElement(templateContent);
		template.sendKeys("Hello,\r\n"
				+ "To follow up on your request for information, you will find attached the plan of the typical apartment on the {{Property Name}} residence in {{City}}.\r\n"
				+ "\r\n"
				+ "You can consult our price list and the plans of the other {{Bed Number}} apartments on the {{agency website}}.\r\n"
				+ "\r\n"
				+ "Wishing you good reception, I remain at your disposal for any further information.");
	}
	public void clickOnPersonalizer()
	{
		WebElement personaliser              = driver.findElement(personaliserButton);
		personaliser.click();
	}
	public void selectCustomField()
	{
//		Webelement customField               = driver.findElement(selectField);
		Select dropdownCustom                = new Select(driver.findElement(selectField));
		dropdownCustom.selectByVisibleText("Utilisateur");
	}
	public void clickOnPersonaliserSave()
	{
		WebElement personalSave              = driver.findElement(personaliserSaveButton);
		personalSave.click();
	}
	public void clickOnSave()
	{
		WebElement save                      = driver.findElement(saveButton);
		save.click();
	}
	public void clickOnEditButton()
	{
		WebElement edit                      = driver.findElement(editButton);
		edit.click();
	}
	public void clickOnDeleteButton()
	{
		WebElement delete                    = driver.findElement(deleteButton);
		delete.click();
		WebElement yes                       = driver.findElement(yesPopUp);
		yes.click();
	}
	

}
