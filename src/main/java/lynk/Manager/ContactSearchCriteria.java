package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ContactSearchCriteria extends DefaultProgram{
	
	
	By linkForSearch                   = By.xpath("//label[text()='Critères de recherche']");
	By city                            = By.xpath("//input[@id='mat-input-0']");
	By selectCity                      = By.xpath("//div[text()='Andert-et-Condon -01300']");
	By close                           = By.xpath("(//i[@class='icon-close'])[2]");
	
	By sectorTextField                 = By.xpath("//input[@placeholder='Secteur']");
	By sectorDropDownList              = By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/*");
	
	By dropdownList                    = By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div");
		
	By housingType                     = By.xpath("//div[@class='ng-input']/input");

	By room                            = By.xpath("(//div[@class='ng-input']/./input)[2]");
	
	By device                          = By.xpath("(//div[@class='ng-input'])[3]");
		
	By surfaceMinTextField             = By.xpath("(//input[@placeholder='Minvalue'])[1]");
	By surfaceMaxTextField             = By.xpath("(//input[@placeholder='Maxvalue'])[1]");
	
	By budgetMinTextField              = By.xpath("(//input[@placeholder='Minvalue'])[2]");
	By budgetMaxTextField              = By.xpath("(//input[@placeholder='Maxvalue'])[2]");
	
	By etageTextField                  = By.xpath("(//input[@role='combobox'])[4]");
	
	By chauffageTextField              = By.xpath("(//input[@role='combobox'])[5]");
		
	By annexeTextField                 = By.xpath("(//input[@role='combobox'])[6]");
		
	By delivery                        = By.xpath("(//input[@role='combobox'])[7]");//("//div[text()='Délai de livraison']");

	By security                        = By.xpath("(//input[@role='combobox'])[8]");//("//div[text()='Sécurité']");
	
	By descriptionField                = By.xpath("//textarea[@placeholder='Ex. It makes me feel...']");
	
	By registrar                       = By.xpath("//button[text()='Enregistrer']");
	
	
	/** To Check For Search Criteria Screen */
	public void searchCriteriaScreen() throws InterruptedException
	{
		clickOnSearchCriteria();
		selectCity();
		selectSector();
		selectTypeDeLogement();
		selectNumberOfPieces();
		Surface();
		selectBudget();
		selectDispositif();
		selectEtage();
		selectChauffage();
		selectAnnex();
		selectDelivery();
		selectSecurity();
		clickOnRegister();
	}
	
	/** To Check For Click On Search Criteria */
	public void clickOnSearchCriteria()
	{
		waitForElementClick(linkForSearch);
		WebElement search              = driver.findElement(linkForSearch);
		search.click();
	}
	
	/** To Check For Select City */
	public void selectCity() throws InterruptedException
	{
		WebElement ville               = driver.findElement(city);
		ville.sendKeys("c");

		waitForElement(selectCity);
		WebElement chooseCity          = driver.findElement(selectCity);
		chooseCity.click();
		WebElement end                 = driver.findElement(close);
		waitForElement(close);
		end.click();
	}
	
	public void selectSector()
	{
		WebElement sector             = driver.findElement(sectorTextField);
		sector.click();
		sector.sendKeys("c");
		List<WebElement> dropdown     = driver.findElements(sectorDropDownList);
		System.out.println(dropdown.size());
		for (WebElement chooseValue : dropdown) {
			if(chooseValue.getText().equals("Bordeaux Centre"))
			{
				chooseValue.click();
				break;
			}
			
		}
		
		waitForElement(close);
		WebElement end                 = driver.findElement(close);
		end.click();
		
	}
	
	
	
	/** To Check For Select House Type */
	public void selectTypeDeLogement() throws InterruptedException
	{
		WebElement select              = driver.findElement(housingType);
		select.click();

		List<WebElement> typeList      = driver.findElements(dropdownList);
		for (WebElement selectType : typeList) {
			if(selectType.getText().equals("Parking"))
			{
				selectType.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Rooms */
	public void selectNumberOfPieces()
	{
		WebElement chooseRooms         = driver.findElement(room);
		chooseRooms.click();
		
		List<WebElement> numOfPieces   = driver.findElements(dropdownList);
		for (WebElement selectPiece : numOfPieces) {
			if(selectPiece.getText().equals("5 pièces"))
			{
				selectPiece.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Surface Value */
	public void Surface() throws InterruptedException
	{
		WebElement min                 = driver.findElement(surfaceMinTextField);
		min.sendKeys(Keys.BACK_SPACE);
		min.sendKeys("1000");
		
		WebElement max                 = driver.findElement(surfaceMaxTextField);
		max.sendKeys(Keys.BACK_SPACE);
		max.sendKeys("5000");
	}
	
	/** To Check For Select Budget Value */
	public void selectBudget()
	{
		WebElement min                 = driver.findElement(budgetMinTextField);
		min.sendKeys(Keys.BACK_SPACE);
		min.sendKeys("2000");
		WebElement max                 = driver.findElement(budgetMaxTextField);
		max.sendKeys(Keys.BACK_SPACE);
		max.sendKeys("6000");
	}
	
	/** To Check For Select Device */
	public void selectDispositif()
	{
		WebElement chooseDevice       = driver.findElement(device);
		chooseDevice.click();
		
		List<WebElement> dispDropDown = driver.findElements(dropdownList);
		for (WebElement chooseValue : dispDropDown) {
			if(chooseValue.getText().equals("LMP"))
			{
				chooseValue.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Floor */
	public void selectEtage() throws InterruptedException
	{
		waitForElement(etageTextField);
		WebElement chooseFloor        = driver.findElement(etageTextField);
		chooseFloor.click();
		
		List<WebElement> chooseValue  = driver.findElements(dropdownList);
		for (WebElement selectValue : chooseValue) {
			if(selectValue.getText().equals("R8"))
			{
				selectValue.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Heater Type */
	public void selectChauffage() throws InterruptedException
	{
		waitForElement(annexeTextField);
		WebElement heater             = driver.findElement(chauffageTextField);
		heater.click();
		
		List<WebElement> heaterList   = driver.findElements(dropdownList);
		for (WebElement chooseHeater : heaterList) {
			if(chooseHeater.getText().equals("Electrique"))
			{
				chooseHeater.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Annex */
	public void selectAnnex()
	{
		WebElement Annex              = driver.findElement(annexeTextField);
		Annex.click();
		
		List<WebElement> annexList    = driver.findElements(dropdownList);
		for (WebElement chooseAnnex : annexList) {
			if(chooseAnnex.getText().equals("Cave"))
			{
				chooseAnnex.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Delivery */
	public void selectDelivery()
	{
		WebElement chooseDTime        = driver.findElement(delivery);
		chooseDTime.click();
		
		List<WebElement> listOfTimings= driver.findElements(dropdownList);
		for (WebElement selectTime : listOfTimings) {
			if(selectTime.getText().equals("Moins de 6 mois"))
			{
				selectTime.click();
				break;
			}
			
		}
	}
	
	/** To Check For Select Security */
	public void selectSecurity()
	{
		WebElement chooseSecurity     = driver.findElement(security);
		chooseSecurity.click();
		
		List<WebElement> securityList = driver.findElements(dropdownList);
		for (WebElement selectSecurity : securityList) {
			if(selectSecurity.getText().equals("Gardien"))
			{
				selectSecurity.click();
				break;
			}
			
		}
	}
	
	public void enterDescription()
	{
		waitForElement(descriptionField);
		WebElement description        = driver.findElement(descriptionField);
		description.sendKeys("Smart Worker");
	}
	
	/** To Check For Click On Register */
	public void clickOnRegister()
	{
		WebElement register           = driver.findElement(registrar);
		register.click();
	}
	

}
