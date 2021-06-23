package lynk.Manager;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactOpportunities extends DefaultProgram{
	
	
	By linkForOpportunity                  = By.xpath("//label[text()='Opportunités']");
	By addOpportunity                      = By.xpath("//button[text()=' Ajouter une opportunité ']");
	
	By program                             = By.id("mat-select-3");//("(//mat-select[@id='mat-select-12']/./div/div)[1]");
	By programDropDown                     = By.xpath("//span[@class='mat-option-text']");//("//div[@id='cdk-overlay-2']/../div/div/div/mat-option");
	
	By lot                                 = By.id("mat-select-4");
	By lotDropDown                         = By.xpath("//div[@class='cdk-overlay-pane']/div/div/*");//("//div[@id='cdk-overlay-3']/../div/div/div/mat-option");
	
	By purchaseProject                     = By.id("mat-select-5");
	By purchaseDropDown                    = By.xpath("//span[@class='mat-option-text']");
	
	By addPackage                          = By.xpath("//button[text()=' Ajouter un pack ']");
	By addingPackage                       = By.xpath("//button[@class='add-package-btn']");
	By saveBtn                             = By.xpath("//button[text()='Sauvegarder ']");
	By packageName                         = By.xpath("//input[@id='name-package']");
	By apartment                           = By.xpath("//span[@class='mat-select-placeholder ng-tns-c11-17 ng-star-inserted']");//("//mat-select[@id='mat-select-24']");
	By chooseApartment                     = By.xpath("//span[text()=' hjghkgkghkghkghk ']");//("//mat-option[@id='mat-option-8364']/../mat-option/span");
	By terrain                             = By.xpath("//span[@class='mat-select-placeholder ng-tns-c11-19 ng-star-inserted']");//("//mat-select[@id='mat-select-25']");
	By chooseTerrain                       = By.xpath("(//span[text()=' Batch123 '])[1]");//("//mat-option[@id='mat-option-1708']/../mat-option/span");
	By coWork                              = By.xpath("//span[@class='mat-select-placeholder ng-tns-c11-21 ng-star-inserted']");//("//mat-select[@id='mat-select-26']");
	By chooseCoWork                        = By.xpath("(//span[text()=' Batch123 '])[1]");//("//mat-option[@id='mat-option-2825']/../mat-option/span");
	By activity                            = By.xpath("//mat-select[@id='mat-select-27']");
	By chooseActivity                      = By.xpath("//mat-option[@id='mat-option-2826']/../mat-option/span");
	By stock                               = By.xpath("//span[@class='mat-select-placeholder ng-tns-c11-23 ng-star-inserted']");//("//mat-select[@id='mat-select-28']");
	By chooseStock                         = By.xpath("//span[text()=' Batch123 ']");//("//mat-option[@id='mat-option-2827']/../mat-option/span");
	By createBtn                           = By.xpath("//button[text()='Créer']");
	By selectStar                          = By.xpath("//ngb-rating[@class='ip-rating d-inline-flex']/./span");
	
	By closeBtn                            = By.xpath("//div[@class='close-icon']");//("//span[@class='close-btn']")
	
	
	
	/** To Check For Opportunity Screen */
	public void opportunityScreen() throws InterruptedException
	{
		clickOnOpportunity();
		clickOnAddOpportunity();
		clickOnProgram();
		clickOnLot();
		selectTypeOfPurchase();
		clickOnSave();
	}
	
	/** To Check For Click On Opportunity 
	 * @throws InterruptedException */
	public void clickOnOpportunity() throws InterruptedException
	{
        waitForElement(linkForOpportunity);
		WebElement opportunity            = driver.findElement(linkForOpportunity);
		waitForElement(linkForOpportunity);
		opportunity.click();
	}
	
	/** To Check For Add Opportunity */
	public void clickOnAddOpportunity()
	{
		waitForElement(addOpportunity);
		WebElement addOpport              = driver.findElement(addOpportunity);
		addOpport.click();
	}
	
	/** To Check For Click On program */
	public void clickOnProgram() throws InterruptedException
	{
//		WebElement pr  = driver.findElement(By.xpath("//mat-label[text()='Sélectionner le programme']"));
//		System.out.println(pr.getText());
    	WebElement chooseProgram         = driver.findElement(program);
    	Thread.sleep(5000);
    	chooseProgram.click();
		
		List<WebElement> programList     = driver.findElements(programDropDown);
		for (WebElement selectProgram : programList) {
			if(selectProgram.getText().equals("KGF Industries"))
			{
				selectProgram.click();
				break;
			}
		}
		
	}
	
	/** To Check For Click On Lot */
	public void clickOnLot() throws InterruptedException
	{
		waitForElement(lot);
		WebElement lotTextField         = driver.findElement(lot);
		lotTextField.click();
		
		Thread.sleep(5000);
		List<WebElement> chooseLot      = driver.findElements(lotDropDown);
		for (WebElement selectLot : chooseLot) {
			if(selectLot.getText().equalsIgnoreCase("CoWorking Lot2 - Disponible"))
			{
				selectLot.click();
				break;
			}
		}
	}
	
	public void selectTypeOfPurchase()
	{
		waitForElement(purchaseProject);
		WebElement typeField           = driver.findElement(purchaseProject);
		typeField.click();
		
		List<WebElement> chooseType    = driver.findElements(purchaseDropDown);
		for (WebElement selectType : chooseType) {
			if(selectType.getText().equals("RP"))
			{
				selectType.click();
				break;
			}
			
		}
	}
	
	/** To Check For Click On Add package */
	public void clickOnAddPackage()
	{
		waitForElement(addPackage);
		WebElement pack                = driver.findElement(addPackage);
		pack.click();
	}
	
	/** To Check For Click On Package */
	public void clickOnPackage()
	{
		WebElement packageAdding       = driver.findElement(addingPackage);
		packageAdding.click();
	}
	
	/** To Check For Enter Package Name */
	public void enterPackageName()
	{
		WebElement name               = driver.findElement(packageName);
		int text = new Random().nextInt(1000); 
		name.sendKeys("john"+ text);
	}
	
	/** To Check For Select Apartment */
	public void selectApartment()
	{
		WebElement selApartment       = driver.findElement(apartment);
		selApartment.click();
		WebElement high               = driver.findElement(chooseApartment);
		high.click();
//		List<WebElement> Apart        = driver.findElements(chooseApartment);
//		for (WebElement Appartment : Apart) {
//			if(Appartment.getText().equals(" hjghkgkghkghkghk "))
//			{
//				Appartment.click();
//			}
//			
//		}
	}
	
	/** To Check For Select Terrain */
	public void selectTerrain()
	{
		WebElement  selTerrain       = driver.findElement(terrain);
		selTerrain.click();
		WebElement batch             = driver.findElement(chooseTerrain);
		batch.click();
//		List<WebElement> chooseTer   = driver.findElements(chooseTerrain);
//		for (WebElement Terrain : chooseTer) {
//			if(Terrain.getText().equals("Batch123"))
//			{
//				Terrain.click();
//			}
//			
//		}
				
	}
	
	/** To Check For Select Co-Work */
	public void selectCoWork()
	{
		WebElement selCoWork        = driver.findElement(coWork);
		selCoWork.click();
		WebElement work             = driver.findElement(chooseCoWork);
		work.click();
//		List<WebElement> selCo      = driver.findElements(chooseCoWork);
//		for (WebElement chooseCo : selCo) {
//			if(chooseCo.getText().equals("Batch123"))
//			{
//				chooseCo.click();
//			}
//			
//		}
	}
	
	/** To Check For Select Activity */
	public void selectActivity()
	{
//		WebElement selAct          = driver.findElement(activity);
//		List<WebElement> LocAct    = driver.findElements(chooseActivity);
//		for (WebElement chooseLoc : LocAct) {
//			if(chooseLoc.getText().equals(" cxvczxvzcbv "))
//			{
//				chooseLoc.click();
//			}
//			
//		}
	}
	
	/** To Check For Select Stock */
	public void selectStock() throws InterruptedException
	{
		WebElement selTrade        = driver.findElement(stock);
		Thread.sleep(2000);
		selTrade.click();
		WebElement chooseStoc     = driver.findElement(chooseStock);
		Thread.sleep(5000);
		chooseStoc.click();
//		List<WebElement> selStock  = driver.findElements(chooseStock);
//		for (WebElement chooseStock : selStock) {
//			if(chooseStock.getText().equals("Batch123"))
//			{
//				chooseStock.click();
//			}
//			
//		}
	}
	
	/** To Check For Click On Create */
	public void create()
	{
		WebElement createButton   = driver.findElement(createBtn);
		createButton.click();
	}
	
	/** To Check For Click On Close */
	public void clickOnClose() throws InterruptedException
	{
		WebElement close          = driver.findElement(closeBtn);
		Thread.sleep(3000);
		close.click();
	}
	
	/** To Check For Click On Save */
	public void clickOnSave() throws InterruptedException
	{
		waitForElement(saveBtn);
		WebElement save           = driver.findElement(saveBtn);
		save.click();
	}
	
}
