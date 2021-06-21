package lynk.Manager;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CampaignScreen extends DefaultProgram{
	
	
	By campaignScreenMenuLink                = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[13]");
	By campaignScreenLink                    = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[13]/a");
	By viewDetails                           = By.xpath("(//span[text()='Voir les détails'])[4]");//("(//tr[@class='ng-star-inserted']//span)[4]");
	By showRecepients                        = By.xpath("//button[text()='Afficher les destinataires']");
	By actionsData                           = By.xpath("//div[@class='event-totals']");
	By tableData                             = By.xpath("(//table[@class='table table-borderless custom-table'])[2]//tbody/tr[1]");
	By recepientsHeader                      = By.xpath("//div[text()='Destinataires']");
	By recepientValue                        = By.xpath("(//div[@class='event-item']//div[2])[1]");
	By openerHeader                          = By.xpath("//div[text()='Ouvreurs']");
	By openerValue                           = By.xpath("(//div[@class='event-item']//div[2])[2]");
	By booksHeader                           = By.xpath("//div[text()='Livrés']");
	By booksValue                            = By.xpath("(//div[@class='event-item']//div[2])[3]");
	By notDeliveredHeader                    = By.xpath("//div[text()='Non Livrés']");
	By notDeliveredValue                     = By.xpath("(//div[@class='event-item']//div[2])[4]");
	By closeButton                           = By.xpath("//i[@class='icon-close popup-close']");
	By createCampaign                        = By.xpath("//span[text()='Créer une campagne']");
	By nameField                             = By.xpath("//input[@name='campaignName']");
	By subjectTextField                      = By.xpath("//input[@name='subject']");
	By recepientsList                        = By.xpath("//span[@class='mat-option-text']");
	By outsideLink                           = By.xpath("//span[text()='Action ']");
    By outsideSubject                        = By.xpath("//*[@id=\"tab_2\"]/app-create-campaign/div/form/div/div[4]/div/label");
	By contentTextField                      = By.xpath("//label[text()='Contenu ']/../div/ckeditor/div[2]");
	By saveButton                            = By.xpath("//button[text()='Sauvegarder']");
	

	
	
	public void campaignMethods() throws InterruptedException
	{
		clickOnView();
		clickOnShowRecepients();
//		getDetails();
		getRecepientsActions();
		clickOnClose();
	}
	public void createCampaignMethods() throws InterruptedException
	{
		clickOnCreateCampaign();
		enterCampaignName();
		enterSubject();
		Thread.sleep(10000);
		selectRecepients();
		Thread.sleep(5000);
		clickOnOutSide2();
		enterContent();
		clickOnSave();
	}
	public void clickOnmenuLink()
	{
		WebElement menuLink                 = driver.findElement(campaignScreenMenuLink);
		menuLink.click();
	}
	public void clickOnScreenLink()
	{
		WebElement screenLink               = driver.findElement(campaignScreenLink);
		screenLink.click();
	}
	public void clickOnView() throws InterruptedException
	{
		waitForElement(viewDetails);
		WebElement view                     = driver.findElement(viewDetails);
		view.click();
	}
	public void clickOnShowRecepients()
	{
		WebElement show                     = driver.findElement(showRecepients);
		show.click();
	}
	public void getDetails() throws InterruptedException
	{
		WebElement details                  = driver.findElement(tableData);
		System.out.println(details.getText());
	}
	public void clickOnClose()
	{
		WebElement close                    = driver.findElement(closeButton);
		close.click();
	}
	public void clickOnCreateCampaign()
	{
		waitForElement(createCampaign);
		WebElement create                   = driver.findElement(createCampaign);
		create.click();
	}
	public void enterCampaignName()
	{
		WebElement name                     = driver.findElement(nameField);
		int text = new Random().nextInt(1000);
		name.sendKeys("Raj"+ text);
	}
	public void enterSubject()
	{
		WebElement subject                  = driver.findElement(subjectTextField);
		subject.sendKeys("Campaign");
	}
	public void selectRecepients() throws InterruptedException
	{  
		WebElement choose                   = driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div"));
		Thread.sleep(8000);
		choose.click();
//		List<WebElement> recepients         = driver.findElements(recepientsList);
//		for (WebElement recep : recepients) {
//			System.out.println(recep.getText());
//			if(recep.getText().equals("testemail "))
//			{
//				recep.click();
//			}
		WebElement search                   = driver.findElement(By.xpath("//input[@placeholder='Rechercher...']"));
		search.sendKeys("testemail");
		WebElement select                   = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
		select.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
	}
	public void clickOnOutSideCreate() throws InterruptedException
	{
		WebElement out                      = driver.findElement(By.xpath("//label[text()='Sujet ']"));
		Thread.sleep(5000);
		out.click();
	}
	
	public void clickOnOutSide()
	{
		waitForElementClick(outsideLink);
		WebElement outSide                  = driver.findElement(outsideLink);
		outSide.click();
	}
	public void clickOnOutSide2()
	{
//		WebElement outSide                  = driver.findElement(outsideSubject);
//		outSide.click();
	}
	public void enterContent()
	{
		WebElement content                  = driver.findElement(contentTextField);
		content.sendKeys("a");
	}
	public void clickOnSave()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN);
		WebElement save                     = driver.findElement(saveButton);
		save.click();
	}
	public void getRecepientsActions()
	{
		WebElement header1                  = driver.findElement(recepientsHeader);
		System.out.println(header1.getText());
		WebElement value1                   = driver.findElement(recepientValue);
		System.out.println(value1.getText());
		WebElement header2                  = driver.findElement(openerHeader);
		System.out.println(header2.getText());
		WebElement value2                   = driver.findElement(openerValue);
		System.out.println(value2.getText());
		WebElement header3                  = driver.findElement(booksHeader);
		System.out.println(header3.getText());
		WebElement value3                   = driver.findElement(booksValue);
		System.out.println(value3.getText());
		WebElement header4                  = driver.findElement(notDeliveredHeader);
		System.out.println(header4.getText());
		WebElement value4                   = driver.findElement(notDeliveredValue);
		System.out.println(value4.getText());
	}
	
}
