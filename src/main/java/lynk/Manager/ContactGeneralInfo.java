package lynk.Manager;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactGeneralInfo extends DefaultProgram {

	
	By linkForMenuContScreen        = By.xpath("(//span[@class='menu-name'])[7]/../..");
	By linkForContScreen            = By.xpath("(//span[@class='menu-name'])[7]");//By.linkText("Contacts");
	By createContact                = By.xpath("//*[@id=\"navbar-menu\"]/ul/li[3]/button");
	
	By profileEditIcon              = By.xpath("//div[@class='edit-wrap']");
	
	By optinToggleBar               = By.xpath("//input[@formcontrolname='optIn']/../span");
	By civility                     = By.xpath("(//div[@class='mat-select-value'])[2]");
	By selCivil                     = By.xpath("//span[@class='mat-option-text']");
	
	By name                         = By.xpath("//input[@id='name-contact']");
	By lastName                     = By.xpath("//input[@id='prenom-contact']");
	By email                        = By.xpath("//input[@id='email-contact']");
	By phone                        = By.xpath("//input[@id='phone-contact']");
	By address                      = By.xpath("//input[@id='adresse-contact']");
	By city                         = By.xpath("//input[@id='city-contact']");
	By zipcode                      = By.xpath("//input[@id='zipcode-contact']");
	By paysTextField                = By.xpath("//input[@formcontrolname='country']");
	
	By dateOfBirthTextField         = By.xpath("(//input[@formcontrolname='dateOfBirth'])[2]");
	By monthAndYear                 = By.xpath("//button[@aria-label='Choose month and year']");
	By yearList                     = By.xpath("(//tr[@class='ng-star-inserted'])//td");
	By monthList                    = By.xpath("//span[@class='owl-dt-calendar-cell-content']");
	By dateList                     = By.xpath("(//span[@class='owl-dt-calendar-cell-content'])");
	
	By textField                    = By.xpath("//textarea[@formcontrolname='notes']");
	
	By register                     = By.xpath("//button[text()='Enregistrer']");
	By li                           = By.xpath("//li[@class='active']//a"); 
	By home                         = By.xpath("//img[@class='logo']");
	
	By contactEditIcon              = By.xpath("//tbody/tr[1]/td[8]/button[1]/i[1]");
//	By dateOfBirth                  = By.xpath("//input[@formcontrolname='dateOfBirth'][1]");
//	By monthAndYear                 = By.xpath("//span[text()='févr. 2021 ']");
//	By yearList                     = By.xpath("//span[@class='owl-dt-calendar-cell-content']");
//	By monthList                    = By.xpath("//span[@class='owl-dt-calendar-cell-content']");
//	By dateList                     = By.xpath("//span[@class='owl-dt-calendar-cell-content']");
	By sideArrow                    = By.xpath("(//span[@class='owl-dt-control-button-content'])[1]");
    By doublonButton                = By.xpath("//button[text()='Doublon']");
    By conflitYes                   = By.xpath("//button[text()='OUI']");
    
	
	/** To Check For Contacts Screen 
	 * @throws IOException */
	public void contactsPage() throws InterruptedException, IOException
	{	
		clickOnEdit();
		addingContact();
		
		uploadProfile();
		civil();
		selectOptinPosition();
		
		addName();
		addLastName();
		enterEmail();
		enterPhone();
		enterAddress();
		enterCity();
		enterCountry();
		enterZipcode();
		
		clickOnDOB();
		clickOnMonth();
		clickOnSideArrow();
		selectYear();
		selectMonth();
		selectDate();
		
		enterText();
//		clickOnSideArrow();
		record();
//		clickOnYes();
	}
	
	/** To Check For Contact Screen Link */
	public void openContactScreen()
	{
		
		WebElement contMenu = driver.findElement(linkForMenuContScreen);
		
		Actions act = new Actions(driver);
		act.moveToElement(contMenu).build().perform();
		
		waitForElementClick(linkForContScreen);
		WebElement cont     = driver.findElement(linkForContScreen);
		cont.click();
	}

	public void clickOnEdit() throws InterruptedException
	{
//		waitForElementClick(By.xpath("(//i[@class='icon icon-edit'])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, 99);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("((//td[@name='actions'])[1]/button/i)[1]"))));
		WebElement fil = driver.findElement(By.xpath("((//td[@name='actions'])[1]/button/i)[1]"));
		fil.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modify-contact-header']/div[3]/i")));
		WebElement close = driver.findElement(By.xpath("//div[@class='modify-contact-header']/div[3]/i"));
		close.click();
	}
	
	/** To Check For Adding Customer */
	public void addingContact() throws InterruptedException
	{		
		waitForElementClick(createContact);
		WebElement addCustom       = driver.findElement(createContact);
		addCustom.click();
	}
	
	/** To Check For Select Civil */
	public void civil()
	{
		waitForElement(civility);
		WebElement selectCivil     = driver.findElement(civility);
		selectCivil.click();
		
		waitForElement(selCivil);
		List<WebElement> chooseCivil     = driver.findElements(selCivil);
		for (WebElement civ : chooseCivil) {
			if(civ.getText().equals("M"))
			{
				civ.click();
			}
			
		}
	}
	
	public void selectOptinPosition()
	{
		waitForElement(optinToggleBar);
		WebElement optin           = driver.findElement(optinToggleBar);
		optin.click();
	}
	
	public void uploadProfile() throws IOException, InterruptedException
	{
		waitForElement(profileEditIcon);
		WebElement edit            = driver.findElement(profileEditIcon);
		edit.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\contactProfile.exe");		
	}
	
	/** To Check For Enter Name */
	public void addName()
	{
		waitForElement(name);
		WebElement FN              = driver.findElement(name);
		int text = new Random().nextInt(1000);
		FN.sendKeys("dsprk" + text);
	}
	
	/** To Check For Enter Last Name */
	public void addLastName()
	{
		WebElement LN              = driver.findElement(lastName);
		int text = new Random().nextInt(1000);
		LN.sendKeys("test"+text);
	}
	
	/** To CHeck For Enter Email */
	public void enterEmail()
	{
		WebElement emailID         = driver.findElement(email);
		int text = new Random().nextInt(1000);
		emailID.sendKeys("vellal" + text +"@gmail.com");
	}
	
	/** To Check For Enter Phone Number */
	public void enterPhone()
	{
		WebElement phoneNum        = driver.findElement(phone);
		int text = new Random().nextInt(1000);
		phoneNum.sendKeys("73000600"+text);
	}
	
	/** To Check For Enter Address */
	public void enterAddress()
	{
		WebElement adress          = driver.findElement(address);
		adress.sendKeys("Velachery");
	}
	
	/** To Check For Enter City */
	public void enterCity()
	{
		waitForElement(city);
		WebElement cityName        = driver.findElement(city);
		cityName.sendKeys("Chennai");
	}
	
	public void enterCountry()
	{
		WebElement country         = driver.findElement(paysTextField);
		country.sendKeys("India");
	}
	
	/** To Check For Enter Zipcode */
	public void enterZipcode()
	{
		WebElement pincode         = driver.findElement(zipcode);
		pincode.sendKeys("524132");
	}
	
	public void enterText()
	{
		WebElement text            = driver.findElement(textField);
		text.sendKeys("Smartness  of the Work");
	}
	/** To Check For Click On Record */
	public void record()
	{
		waitForElement(register);
		WebElement recordInfo      = driver.findElement(register);
		recordInfo.click();
	}
	
	public void clickOnDOB()
	{
		WebElement dob             = driver.findElement(dateOfBirthTextField);
		dob.click();
	}
	
	public void clickOnMonth()
	{
		waitForElement(monthAndYear);
		WebElement mY             = driver.findElement(monthAndYear);
		mY.click();
	}
	
	public void clickOnSideArrow()
	{
		WebElement side           = driver.findElement(sideArrow);
		side.click();
	}
	
	public void selectYear()
	{
		List<WebElement> year     = driver.findElements(yearList);
		for (WebElement chooseYear : year) {
			if(chooseYear.getText().equals("1996"))
			{
				chooseYear.click();
				break;
			}
			
		}
	}
	
	public void selectMonth() throws InterruptedException
	{
		List<WebElement> month   = driver.findElements(monthList);
		for (WebElement chooseMonth : month) {
			if(chooseMonth.getText().equals("août"))
			{
				chooseMonth.click();
				break;
			}
			
		}
	}
	
	public void selectDate()
	{
	    List<WebElement> date   = driver.findElements(dateList);
	    for (WebElement chooseDate : date) {
	    	if(chooseDate.getText().equals("1"))
	    	{
	    		chooseDate.click();
	    		break;
	    	}
			
		}
	}
	
	public void clickOnYes()
	{
		WebElement yes         = driver.findElement(conflitYes);
		yes.click();
	}
	
}
