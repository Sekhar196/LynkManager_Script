package lynk.Manager;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactPersonalInfo extends DefaultProgram {
	
	
	By personalInfolink                  = By.xpath("//label[text()='Informations personnelles']");
	By ageRangeTextField                 = By.xpath("//select[@formcontrolname='age']");
	By ageDropDownList                   = By.xpath("//select[@formcontrolname='age']/*");
	By typology                          = By.xpath("//label[text()='Typologie']/../div/span");
	
	By profileAct                        = By.xpath("//select[@formcontrolname='status']");
	By profActstatusList                 = By.xpath("//select[@formcontrolname='status']/*");
	
	By situation                         = By.xpath("//select[@formcontrolname='familySituation']");
	By situationDropDown                 = By.xpath("//select[@formcontrolname='familySituation']/*");
	
	By profession                        = By.xpath("//select[@formcontrolname='professionalSituation']");
	By professionDropDown                = By.xpath("//select[@formcontrolname='professionalSituation']/*");
	
	By catisation                        = By.xpath("//span[text()='Cotisation 1% ']");
	
	By asstCommercial                    = By.xpath("//div[@formgroupname='assistantCommercial']/mat-select");
	By asstCommercialList                = By.xpath("//span[@class='mat-option-text']");
	
	By refCommercial                     = By.xpath("(//div[@class='mat-select-value'])[5]");
	By refCommercialList                 = By.xpath("//mat-option[@role='option']/../mat-option/span");
	
	By dropdownSearch                    = By.xpath("(//input[@placeholder='Rechercher...'])[2]");
	
	By agency                            = By.xpath("//div[@formgroupname='createdBy']/mat-select");
	By agencyList                        = By.xpath("//span[@class='mat-option-text']");
	By newAgency                         = By.xpath("//span[text()='Entrez une nouvelle agence ']");
	By agencyName                        = By.xpath("//input[@placeholder='Nouvelle agence externe']");
	
	By refExternal                       = By.xpath("//div[@formgroupname='externalCommercial']/mat-select");
	By reExternalList                    = By.xpath("//div[@class='cdk-overlay-pane']/div/div/*");
	
	By register                          = By.xpath("//button[text()='Enregistrer ']");
	
	
	/** To Check For Personal Information Screen 
	 * @throws InterruptedException */
	public void personalInformation() throws InterruptedException
	{
		linkForInfo();
		age();
//		selectTypology();	
		selectProfileAct();
		selectSituation();
		selectProfession();
//		clickOnCatisation();
		selectAsstCommercial();
		selectRespCommercial();
		enterPromoter();
		selectRefExternal();
		clickOnRecord();
	}
	
	/** To Check For Information Link */
	public void linkForInfo()
	{
		waitForElement(personalInfolink);
		WebElement link                  = driver.findElement(personalInfolink);
		link.click();
		
	}
	
	/** To Check For Select Age */
	public void age()
	{
		waitForElement(ageRangeTextField);
		WebElement ageField               = driver.findElement(ageRangeTextField);
		ageField.click();
		
		List<WebElement> selectAge        = driver.findElements(ageDropDownList);
		for (WebElement ageRange : selectAge) {
			if(ageRange.getText().equals("25-39 ans"))
			{
				ageRange.click();
			
			}
			
		}
	}
	
	/** To Check For Select Typology */
	public void selectTypology()
	{
		List<WebElement> select          = driver.findElements(typology);
		for (WebElement typo : select) {
			if(typo.getText().equals("Locataire sociale"))
			{
				typo.click();
			
			}
			
		}
	}
	
	/** To Check For Select Status */
	public void selectProfileAct()
	{
		waitForElement(profileAct);
		WebElement profileField          = driver.findElement(profileAct);
		profileField.click();
		
		List<WebElement> select          = driver.findElements(profActstatusList);
		for (WebElement chooseStatus : select) {
			if(chooseStatus.getText().equals("Locataire"))
			{
				chooseStatus.click();
			
			}
			
		}
	}
	
	/** To Check For Select Situation */
	public void selectSituation()
	{
		WebElement situationField       = driver.findElement(situation);
		situationField.click();
		
		List<WebElement> select         = driver.findElements(situationDropDown);
		for (WebElement chooseSituation : select) {
			if(chooseSituation.getText().equals("Union libre"))
			{
				chooseSituation.click();
				
			}
			
		}
	}
	
	/** To Check For Select Profession */
	public void selectProfession()
	{
		WebElement professionField      = driver.findElement(profession);
		professionField.click();
		
		List<WebElement> select         = driver.findElements(professionDropDown);
		for (WebElement chooseProf : select) {
			if(chooseProf.getText().equals("Sans emploi"))
			{
				chooseProf.click();
				
			}
			
		}
	}
	
	/** To Check For Click On Catization */
	public void clickOnCatisation()
	{
		WebElement catis               = driver.findElement(catisation);
		catis.click();
	}
	
	/** To Check For Select Commercial 
	 * @throws InterruptedException */
	public void selectAsstCommercial() throws InterruptedException
	{
		waitForElement(asstCommercial);
		WebElement commercial          = driver.findElement(asstCommercial);
		commercial.click();
		
		waitForElement(asstCommercialList);
		List<WebElement> select        = driver.findElements(asstCommercialList);		
		for (WebElement commer : select) {
			if(commer.getText().equals("ADANI"))
			{
				commer.click();
				break;
			}
			
		}
	}
	
	public void selectRespCommercial()
	{
		waitForElement(refCommercial);
		WebElement response           = driver.findElement(refCommercial);
		response.click();
		
		waitForElement(refCommercialList);
		List<WebElement> responseCom  = driver.findElements(refCommercialList);
		for (WebElement chooseCommercial : responseCom) {			
			if(chooseCommercial.getText().equals("MORE"))
			{
				chooseCommercial.click();
				break;
			}
			
		}
	}
	
	public void selectRefExternal()
	{
		waitForElement(refExternal);
		WebElement refExt           = driver.findElement(refExternal);
		refExt.click();
		
		List<WebElement> chooseExt  = driver.findElements(reExternalList);
		for (WebElement selectExt : chooseExt) {
			if(selectExt.getText().equals("Nick"))
			{
				selectExt.click();
				break;
			}
			
		}
	}
	
	/** To Check For Enter Promoter */
	public void enterPromoter()
	{
		waitForElement(agency);
		WebElement promoter           = driver.findElement(agency);
		promoter.click();
		
		List<WebElement> selectPromoter = driver.findElements(agencyList);
		for (WebElement choosePromoter : selectPromoter) {
			if(choosePromoter.getText().equals("P V R"))
			{
				choosePromoter.click();
				break;
			}
			else{
				
				WebElement newAgencyText = driver.findElement(newAgency);
				newAgencyText.click();
				
				WebElement newAgencyName = driver.findElement(agencyName);
				int agency               = new Random().nextInt(500);
				newAgencyName.sendKeys("Secret"+ agency);
				break;

			}
			
		}
	}
	
	/** To Check For Click On Record */
	public void clickOnRecord()
	{
		WebElement record             = driver.findElement(register);
		record.click();
		
	}

}
