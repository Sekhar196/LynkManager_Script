package lynk.Manager;

import java.io.IOException;
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
	By fromPC                           = By.xpath("//button[text()='Depuis votre ordinateur ']");
	By listOfPrograms                   = By.xpath("(//div[@class='tag-list'])[1]/./button");
	By listOfTypes                      = By.xpath("(//div[@class='tag-list'])[2]/./button");
	By listOfMedia                      = By.xpath("//label[@class='chk-container p-0 m-0 ng-star-inserted']");
	By saveButton                       = By.xpath("//button[text()='Sauvegarder']");
	By submitButton                     = By.xpath("//button[@class='custom-btn']");
	
	
	
	
	public void contactDocScreen() throws IOException, InterruptedException
	{
		clickOnDocumentationLink();
		clickOnAdd();
		enterDocTitle();
		selectDocType();
		selectUploadType();
		clickOnSubmit();
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
	public void selectUploadType() throws IOException, InterruptedException
	{
		
		String i = " Insérer un média ";
		
		if(i==" Insérer un média ")
		{
			waitForElement(insertMedia);
			WebElement insert               = driver.findElement(insertMedia);
			insert.click();	
			
			Thread.sleep(2000);
			selectProgram();
			selectMedia();
			
			clickOnSave();
		}
		else if(i=="Depuis votre ordinateur ")
		{
			waitForElement(fromPC);
			WebElement insert               = driver.findElement(fromPC);
			insert.click();	
			
			ProgramMedia pm                 = new ProgramMedia();
			pm.uploadPdfFile();
		}
		
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
		waitForElement(listOfMedia);
		WebElement chooseDoc            = driver.findElement(By.xpath("(//label[@class='chk-container p-0 m-0 ng-star-inserted'])[3]"));
		chooseDoc.click();
//		List<WebElement> chooseMedia    = driver.findElements(listOfMedia);
//		System.out.println(chooseMedia.size());
//		for (WebElement selMedia : chooseMedia) {
//			if(selMedia.getText().equals("Feedback V33.0"))
//			{
//				selMedia.click();
//				break;
//			}
//			
//		}
				
	}
	
	public void clickOnSave()
	{
		waitForElement(saveButton);
		WebElement save               = driver.findElement(saveButton);
		save.click();
	}
	
	public void clickOnSubmit()
	{
		waitForElement(submitButton);
		WebElement save               = driver.findElement(submitButton);
		save.click();
	}

}
