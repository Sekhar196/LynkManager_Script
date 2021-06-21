package lynk.Manager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProgramInformationsGénérales extends DefaultProgram{
	
	By Plusdedétails          = By.xpath("(//a[text()='Plus de détails'])[1]");
	By Ajouterunprogramme     = By.xpath("(//button[text()='Ajouter un programme '])[1]");
	By Nomduprogramme         = By.xpath("//input[@id='name-property']");
	By slogan                 = By.xpath("//input[@id='slogan-property']");
	By Prixapartirde          = By.xpath("//input[@id='price-property']");
	By Nombredelots           = By.xpath("(//input[@id='apartmentsCount-property'])[1]");
	By numberOfBuildings      = By.xpath("//input[@formcontrolname='buildingPrice']");
	By Statut                 = By.xpath("//div[@class='tag-list']/*");
	
	By dateValue              = By.xpath("(//div[@class='date-wrap'])/input");
	By semestreValue          = By.xpath("((//div[@class='semester-wrap'])/input)[1]");
	By trimestreValue         = By.xpath("((//div[@class='semester-wrap'])/input)[2]");
	By yearValue              = By.xpath("((//div[@class='semester-wrap'])/input)[3]");
	
	By dateOption             = By.xpath("//input[@placeholder='Date Time']");
	By clickOnCalendar        = By.xpath("//input[@class='date-input form-control']");
	By monthList              = By.xpath("//select[@formcontrolname='deliveryMonth']/*");
	By month                  = By.xpath("//select[@formcontrolname='deliveryMonth']");
	By year                   = By.xpath("//button[@aria-label='Choose month and year']");
	By yearAndMonthList       = By.xpath("//tbody[@class='owl-dt-calendar-body']/tr/td/*");
	By calendarSet            = By.xpath("//span[text()='Set']");
	By datesDeLivraison       = By.xpath("//input[@formcontrolname='otherDeliveryDate1']");

	
	By notaireDropDown        = By.xpath("//mat-select[@placeholder='Notaire']");
	By notaireDropDownList    = By.xpath("//span[@class='mat-option-text']");
	
	By Zone                   = By.xpath("//label[text()='Zone']/../div/*");
	By Sécurité               = By.xpath("//label[text()='Sécurité']/../div/*");
	
	By Chauffage              = By.xpath("//label[text()='Chauffage']/../div/span/input");
	By Description            = By.xpath("//textarea[@id='description-property']");
	
	By Année                  = By.xpath("//label[text()='Année']/../div/select/*");
	By Actable                = By.xpath("//label[text()='Actable']/../div/label");
//	By fiscaliteTextField     = By.xpath("(//div[@class='mat-select-value'])[1]");
//	By Fiscalite              = By.xpath("//span[@class='mat-option-text']");
	By Suivant                = By.xpath("//button[text()=' Suivant ']");
	By li                     = By.xpath("//li[@class='active']//a"); 
	By program                = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[2]"); //*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[2]");
    By programLink            = By.xpath("(//span[@class='menu-name'])[2]"); //*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[2]/a");
	
	By uploadLink             = By.xpath("//button[text()='Téléchargez une photo du programme ']");
	By outlink                = By.xpath("//div[text()=' Options ']");
	By outside                = By.xpath("//*[@id='navbar-menu']/div/ul/li/a/span");
	By editIcon               = By.xpath("//tbody/tr[1]/td[4]/div[1]/a[2]/i[1]");
	By batimentPlusIcon       = By.xpath("//i[@class='icon-plus']");
	By batimentTextField      = By.xpath("//input[@placeholder='Add new Batiment here...']");
	By batimentTickIcon       = By.xpath("//i[@class='icon-tick save-ic']");
	
	
	/** OPTION CREATING FOR LOTS*/
	
	By searchTextField        = By.xpath("//input[@name='searchValue']");
	By programName            = By.xpath("//div[@class='property-name']");
	By lotList                = By.xpath("//div[@class='content-break-section content-tooltip']/a");
	By createOption           = By.xpath("//button[text()=' Poser une option ']");
	By contactSearch          = By.xpath("//input[@name='search']");
	By selectContact          = By.xpath("//ngb-highlight[@class='ng-star-inserted']");
	By priceFrom              = By.xpath("(//input[@name='price'])[1]");
	By durationTextField      = By.xpath("(//input[@name='price'])[2]");
	By descriptionTextField   = By.xpath("//textarea[@formcontrolname='comments']");
	By askOptionText          = By.xpath("//button[text()='Poser une option ']");
	By closeButton            = By.xpath("//div[@class='header-close-col']");
	By backIcon               = By.xpath("//div[@class='close-wrap']");
	By lotStatus              = By.xpath("(//div[@class='mat-select-value'])[1]");
	
	/** DENONCIATION FOR LOT/PROGRAM */
	
	By denonciationText       = By.xpath("//button[text()='Dénoncer un prospect ']");
	
	
	public void programmesPage() throws InterruptedException, IOException  
	{
		uploadingProfile();
		Nomduprogramme();
		slogan();
		prixaPartirDe();
		Nombredelots();
		enterNombredebâtiments();
		selectDateOption();
		deliveryDate();
		enterOtherDate();
		addBatiments();
		Statut();
		selectNotaire();
//		Zone();
//		Sécurité();
//		SemestreDeLivraison();
//		Année();
//		Actable();
//		Chauffage();
		Description();
		Suivant();
	}

	public void optionCreatingForLot() throws InterruptedException
	{
//		searchProgram();
//		clickOnSelectedProgram();
		progClick();
		selectLot();
		Thread.sleep(10000);
		createOption();
		Thread.sleep(2000);
//		searchContact();
		enterContact();
		Thread.sleep(2000);
		selectContact();
		enterPrice();
		enterDuration();
		enterDescription();
		clickOnOption();
		Thread.sleep(10000);
		clickOnBackIcon();
		getLotStatus();
	}
	
	public void createDenonciation() throws InterruptedException
	{
		progClick();
		Thread.sleep(1000);
		selectLot();
		clickOnDenonciation();
	}
	public void clickOnOut()
	{
		WebElement out = driver.findElement(outside);
		out.click();
	}
	/** Link for Program Screen 
	 * @throws IOException */
	public void clickOnProgram() throws InterruptedException, IOException
	{
		
        WebElement menu        = driver.findElement(By.className("icon-lot-house"));
        Actions act = new Actions(driver);
      	act.moveToElement(menu).build().perform();
        
        waitForElementClick(programLink);
        WebElement prog        = driver.findElement(programLink);
        prog.click();
       
	}
	
	//For Package Temporary
	
	public void clickOnProgramPack() throws InterruptedException
	{
//	    waitForElementClick(program);
		WebDriverWait wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(program)));
		
       
		WebElement pl          = driver.findElement(program);
		pl.click();
		waitForElement(programLink);
		WebElement link        = driver.findElement(programLink);
		link.click();
		
	    WebElement search      = driver.findElement(By.xpath("//input[@name='searchValue']"));
	    search.sendKeys("Roman223");
		
		waitForElementClick(editIcon);
		WebElement addprogram  = driver.findElement(editIcon);
		addprogram.click();
	}
	
	/** Click on Add Program 
	 * @throws InterruptedException */
	public void addProgramme() throws InterruptedException
	{
		waitForElementClick(editIcon);
		WebElement addprogram  = driver.findElement(editIcon);
		addprogram.click();
		
		waitForElement(closeButton);
		WebElement close       = driver.findElement(closeButton);
		close.click();
		
		WebElement addProg     = driver.findElement(Ajouterunprogramme);
		addProg.click();
	}
	
	/** Uploading profile for program */
	public void uploadingProfile() throws InterruptedException, IOException
	{
		WebElement pic        = driver.findElement(uploadLink);
		pic.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\imagesHD.exe");
	}
	
	/** Enter Program Name */ 
	public void Nomduprogramme()
	{
		waitForElement(Nomduprogramme);
		WebElement name        = driver.findElement(Nomduprogramme);
		int text = new Random().nextInt(1000);
		name.sendKeys("Roman" + text);
	}
	
	/** Enter Slogn */
	public void slogan()
	{
		WebElement slogantext  = driver.findElement(slogan);
		slogantext.sendKeys("Smartness Of the Business");
	}
	
	/** Enter Price From */
	public void prixaPartirDe()
	{
		WebElement price       = driver.findElement(Prixapartirde);
    	price.sendKeys("500");
	}
	
	/** Enter Number of Lots */
	public void Nombredelots()
	{
		WebElement lots        = driver.findElement(Nombredelots);
		lots.sendKeys("100");
	}
	
	public void enterNombredebâtiments()
	{
		WebElement number      = driver.findElement(numberOfBuildings);
		number.sendKeys("25");
	}
	
	/** Select Status */
	public void Statut()
	{
		List<WebElement> statuss = driver.findElements(Statut);
		for (WebElement s : statuss) {
			if(s.getText().equals("Avant-première"))
			{
				s.click();
				break;
			}
			
		}
		
	}
	
	public void selectNotaire()
	{
		waitForElement(notaireDropDown);
		WebElement notaire      = driver.findElement(notaireDropDown);
		notaire.click();
		List<WebElement> notairValue  = driver.findElements(notaireDropDownList);
		for (WebElement chooseNotaire : notairValue) {
			if(chooseNotaire.getText().equals("123 SEC"))
			{
				chooseNotaire.click();
				break;
			}
			
		}
	}
	
	
	/** Select Zone */
	public void Zone()
	{
		List<WebElement> status = driver.findElements(Zone);
		for (WebElement s : status) {
			if((s.getText()).equals("Zone A"))
			{
				s.click();
			}
			
		}
	}
	
	/** Select Security */
	public void Sécurité()
	{
		List<WebElement> status = driver.findElements(Sécurité);
		for (WebElement s : status) {
			if(s.getText().equals("Gardien"))
			{
				s.click();
			}
			
		}
	}
	
	/** Select Heater Type */
	public void Chauffage()
	{
		waitForElementClick(Chauffage);
		List<WebElement> Status = driver.findElements(Chauffage);
		for (WebElement s : Status) {
			if((s.getText()).equals("Electrique"))
			{
				s.click();
			}
			
		}
	}
	
	
	
	/** Choose Year */
	public void Année()
	{
		List<WebElement> years  = driver.findElements(Année);
		for (WebElement s : years) {
			if(s.getText().equals("2020"))
			{
				s.click();
			}
			
		}
	}
	
	/** Choose Toggle Option */
	public void Actable()
	{
		WebElement act  = driver.findElement(Actable);
		act.click();
	}
//	public void Fiscalite()
//	{
//		waitForElement(fiscaliteTextField);
//		WebElement fiscalite = driver.findElement(fiscaliteTextField);
//		fiscalite.click();
//		List<WebElement> tax  = driver.findElements(Fiscalite);
//		for (WebElement f : tax) {
//			if(f.getText().equals("PSLA"))
//			{
//				f.click();
//			}
//			
//		}
//		WebElement out = driver.findElement(By.xpath("//div[@class='header-title']"));
//		out.click();
//		
//	}
	
	public void enterOtherDate()
	{
		waitForElement(datesDeLivraison);
		WebElement OD  = driver.findElement(datesDeLivraison);
		OD.sendKeys("31/08/2022");
	}
	
	public void addBatiments()
	{
		waitForElement(batimentPlusIcon);
		WebElement plus         = driver.findElement(batimentPlusIcon);
		plus.click();
		
		WebElement batimentName = driver.findElement(batimentTextField);
		int batiment            = new Random().nextInt(500);
		batimentName.sendKeys("A1"+batiment);
		
		
		waitForElement(batimentTickIcon);
		WebElement tick         = driver.findElement(batimentTickIcon);
		tick.click();
	}
	
	/** Enter Description */
	public void Description()
	{
		WebElement textfield   = driver.findElement(Description);
		textfield.sendKeys("Unite the Talent");
	}
	
	/** Click On Save */
	public void  Suivant()
	{
		waitForElement(Suivant);
		WebElement savebutton = driver.findElement(Suivant);
		savebutton.click();
	}
	
	/** OPTION CREATING FOR LOTS*/
	
	public void searchProgram()
	{
		WebElement search     = driver.findElement(searchTextField);
		search.sendKeys("1 Lot Delete Check");
	}
	
	public void clickOnSelectedProgram()
	{
		WebElement program    = driver.findElement(programName);
		program.click();
	}
	
	public void selectLot() throws InterruptedException
	{
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,1000)");
//	    waitForElementClick(lotList);
		
		List<WebElement> lot  = driver.findElements(lotList);
		for (WebElement chooseLot : lot) {
			if(chooseLot.getText().equals("CoWorking Lot1"))
			{
				chooseLot.click();
				break;
			}
			
		}
	}
	
	public void createOption()
	{
//		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-1000)");
		WebElement option     = driver.findElement(createOption);
		option.click();
		
	}
	
	public void searchContact() throws InterruptedException
	{
		WebElement search     = driver.findElement(searchTextField);
		search.click();
	}
	
	public void enterContact() throws InterruptedException
	{
		waitForElement(searchTextField);
		WebElement search     = driver.findElement(contactSearch);
		search.sendKeys("James");;
	}
	
	public void selectContact()
	{
		WebElement contact    = driver.findElement(selectContact);
		contact.click();
	}
	
	public void enterPrice()
	{
		WebElement price      = driver.findElement(priceFrom);
		price.sendKeys("2000");
	}
	
	public void enterDuration()
	{
		WebElement duration   = driver.findElement(durationTextField);
		duration.sendKeys("5");
	}
	
	public void enterDescription()
	{
		WebElement description= driver.findElement(descriptionTextField);
		description.sendKeys("I'm Interested");
	}
	
	public void clickOnOption()
	{
		WebElement option     = driver.findElement(askOptionText);
		option.click();
	}
	
	public void clickOnClose()
	{
		WebElement close      = driver.findElement(closeButton);
		close.click();
	}
	
	public void clickOnBackIcon()
	{
		waitForElement(backIcon);
		WebElement back       = driver.findElement(backIcon);
		back.click();
	}
	
	public void getLotStatus()
	{
		WebElement status             = driver.findElement(lotStatus);
		System.out.println("LotStatus =  " + status.getText());
	}
	
	public void selectDateOption() throws InterruptedException
	{
		waitForElementClick(dateOption);
	
		WebElement calendarTextField = driver.findElement(dateOption);
		calendarTextField.click();
		
         selectYear();
		 selectMonth();
		 selectDate();
	}
	
	
	public void deliveryDate()
	{
		String i="Trimestre";
		if(i.equals("Date"))
		{
			WebElement date         = driver.findElement(dateValue);
			String dateText         = date.getAttribute("value");
			System.out.println("Delivery date is "+ dateText);
		}
		else if(i.equals("Semestre"))
		{			
			WebElement sem        = driver.findElement(semestreValue);
			String semText        = sem.getAttribute("value");
			System.out.println(semText);
			
			WebElement year       = driver.findElement(yearValue);
			String yearText       = year.getAttribute("value");
			System.out.println("Delivery year is "+ yearText);
	    }
		else if(i.equals("Trimestre"))
		{
		
			WebElement trimestre = driver.findElement(trimestreValue);
			String triText       = trimestre.getAttribute("value");
			System.out.println("Delivery trimestre is "+ triText);
			
			WebElement year       = driver.findElement(yearValue);
			String yearText       = year.getAttribute("value");
			System.out.println("Delivery year is "+ yearText);
	    }
	
	}
			
		
	/** Temporary */
	
	public void progClick()
	{
		WebElement prog = driver.findElement(By.xpath("(//div[@class='property-name'])[1]"));
		WebElement prog1 = driver.findElement(By.xpath("//button[@class='filter-btn']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(prog1).build().perform();
		prog.click();
	}
	public void outside()
	{
		WebElement out = driver.findElement(By.xpath("(//li[@class='nav-item text-center'])[1]"));
		out.click();
	}
	public void outside1()
	{
		WebElement out = driver.findElement(By.xpath("//label[text()='Location']"));
		out.click();
	} /** end */
	
	public void clickOnDenonciation()
	{
		WebElement denonciation = driver.findElement(denonciationText);
		denonciation.click();
	}

	public void selectYear()
	{
		waitForElement(yearAndMonthList);
		WebElement yearDropDown       = driver.findElement(year);
		yearDropDown.click();
		List<WebElement> year         = driver.findElements(yearAndMonthList);
		for (WebElement chooseYear : year) {
			if(chooseYear.getText().equals("2022"))
			{
				chooseYear.click();
				break;
			}
			
		}
	}
	public void selectMonth() throws InterruptedException
	{
	    waitForElement(yearAndMonthList);
		List<WebElement> month       = driver.findElements(yearAndMonthList);
		for (WebElement chooseMonth : month) {
			if(chooseMonth.getText().equals("sept."))
			{
				chooseMonth.click();
				break;
			}
			
		}
	}
	public void selectDate()
	{
		waitForElement(yearAndMonthList);
		List<WebElement> date        = driver.findElements(yearAndMonthList);
		for (WebElement chooseDate : date) {
			if(chooseDate.getText().equals("1"))
			{
				chooseDate.click();
				break;
			}
			
		}
		
		waitForElement(calendarSet);
		WebElement set      = driver.findElement(calendarSet);
		set.click();
	}
}
