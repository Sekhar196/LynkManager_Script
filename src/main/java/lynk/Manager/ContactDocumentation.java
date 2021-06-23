package lynk.Manager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactDocumentation extends DefaultProgram{
	
	
	By documentationLink                = By.xpath("//label[text()='Documentation']");
	By addButton                        = By.xpath("//button[text()=' Ajouter ']");
	By documentTitle                    = By.xpath("//input[@id='fichier-property']");
	By documentType                     = By.xpath("//select[@class='form-control']");
	By documentTypeList                 = By.xpath("//select[@class='form-control']/*");
	By insertMedia                      = By.xpath("//button[text()=' Insérer un média ']");
	By listOfPrograms                   = By.xpath("(//div[@class='tag-list'])[1]/./button");
	By listOfTypes                      = By.xpath("(//div[@class='tag-list'])[2]/./button");
	By listOfMedia                      = By.xpath("//label[@class='chk-container p-0 m-0 ng-star-inserted']");
	
	
	
	
	public void contactDocScreen()
	{
		clickOnDocumentationLink();
		clickOnAdd();
		enterDocTitle();
		selectDocType();
		clickOnInsertMedia();
		selectProgram();
		selectMedia();
	}
	public void clickOnDocumentationLink()
	{
		WebElement link                 = driver.findElement(documentationLink);
		link.click();
	}
	public void clickOnAdd()
	{
		WebElement add                  = driver.findElement(addButton);
		add.click();
	}
	public void enterDocTitle()
	{
		WebElement title                = driver.findElement(documentTitle);
		title.sendKeys("Media");
	}
	public void selectDocType()
	{
		Select docType                  = new Select(driver.findElement(documentType));
		docType.selectByVisibleText("Offre de prêt");
	}
	public void clickOnInsertMedia()
	{
		WebElement insert               = driver.findElement(insertMedia);
		insert.click();
	}
	public void selectProgram()
	{
		waitForElement(listOfPrograms);
		List<WebElement> chooseProgram  = driver.findElements(listOfPrograms);
		for (WebElement selProg : chooseProgram) {
			if(selProg.getText().equals("FALCON BEAUTIFUL PROPERTIES"))
			{
				selProg.click();
				break;
			}
			
		}
	}
	public void selectMedia()
	{
//		waitForElement(listOfMedia);
		List<WebElement> chooseMedia    = driver.findElements(listOfMedia);
//		for (WebElement selMedia : chooseMedia) {
//			if(selMedia.getText().equals("Feedback V33.0"))
//			{
//				selMedia.click();
//				break;
//			}
//			
//		}
		
		
		ArrayList al = new ArrayList();
		System.out.println(al.add(chooseMedia));
		
	}

}
