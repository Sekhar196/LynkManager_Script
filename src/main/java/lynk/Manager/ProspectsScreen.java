package lynk.Manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProspectsScreen extends DefaultProgram{
	
	/* LINK FOR PROSPECTS SCREEN IN MENU */
	By linkForProspects                     = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[5]");//("//span[text()='Prospects']");
	By pros                                 = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[5]/a");
	
	/* PROSPECTS HOME SCREEN */
	By linkForAddOpp                        = By.xpath("//button[text()='Ajouter une opportunité ']");
	By searchField                          = By.xpath("//input[@name='searchValue']");
	By etape                                = By.xpath("(//div[@class='mat-select-value'])[6]");
	By chooseValue                          = By.xpath("//span[text()=' Réservation ']");//("//div[@class='cdk-overlay-pane']/./div//mat-option");

	/* RESERVATION SCREEN & ELECTRONIC SIGNATURE */
	By signToggle                           = By.xpath("//label[text()='Signature Electronic']/../div/label");
	By signElectronic                       = By.xpath("//button[text()='Signature Electronic']");
	
	/* SIGNATAIRE SCREEN */
	By addSignDropDown                      = By.xpath("//span[text()='Ajouter signataire']");
	By SignSearchField                      = By.xpath("//input[@class='search--dropdown']");
	By addSignataire                        = By.xpath("//button[text()='Add new signatarie']");
	By preNom                               = By.xpath("//input[@formcontrolname='firstName']");
	By nom                                  = By.xpath("//input[@formcontrolname='lastName']");
	By emailID                              = By.xpath("//input[@formcontrolname='email']");
	By telePhone                            = By.xpath("//input[@role='combobox']");
	By telePhoneDropDown                    = By.xpath("//span[text()='India(+91)']");//("//div[@class='ng-dropdown-panel-items scroll-host']/./div[2]/div");
	By telePhoneTextField                   = By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']");//("//input[@formcontrolname='tempNumber']");
	By create                               = By.xpath("//button[text()='Sauvegarder']");
	By outside                              = By.xpath("//span[text()='Signataires promoteur : ']");
	By select1                              = By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[12]");
	By select2                              = By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[13]");
	By nextStep                             = By.xpath("//button[text()='Étape suivante']");
	
	/* DOCUMENTS SCREEN */
    By dragSelect                           = By.xpath("//h4[text()='Faites glisser vos documents ici']/../div/i");
    By emailTemplate                        = By.xpath("//div[@class='email-list']/./div/*");
    By finaliserBtn                         = By.xpath("//button[text()='Finaliser !']");
    By yesPopUp                             = By.xpath("//button[text()='OUI']");
    
    /* DOCUMENT LINK FOR SENDING OTP TO MOBILE NUMBER */
    By linkForLabel                         = By.xpath("(//div[@class='c-pdf-document__page ng-scope'])[1]");
    By otpTextField                         = By.xpath("//input[@placeholder='ex: 768598']");
    By OtpSignBtn                           = By.xpath("//span[text()='Sign']");
    
    /* CONTACT OPPORTUNITY SCREEN */
    By oppoProgLink                         = By.xpath("(//div[@class='mat-select-value'])[16]");
	By programDropDown                      = By.xpath("//span[text()=' Environment ']"); 
    By saveBtn                              = By.xpath("//button[text()='Sauvegarder']");
    
    /* VERIFICATION LINK IN GMAIL */ 
    
    By login                                = By.xpath("(//a[@class='h-c-header__nav-li-link '])[4]");
    By anotherAccount                       = By.xpath("//div[text()='Use another account']");
    By emailId                              = By.xpath("//input[@id='identifierId']");
    By gmailNext                            = By.xpath("//div[@id='identifierNext']");//("//span[text()='Next']");
    By gmailPwd                             = By.xpath("//input[@name='password']");
    By passwordNext                         = By.xpath("//div[@jsname='Njthtb']");//("//div[@id='passwordNext']");
    By mailSearch                           = By.xpath("(//input[@name='q'])");//("//input[@placeholder='Search mail']");
    By searchBtn                            = By.xpath("//*[@id=\"aso_search_form_anchor\"]/button[4]");
    By selectMail                           = By.xpath("(//span[text()='Information {{Bed Number}} Police Line - Environment'])[2]");
    By linkForDocs                          = By.xpath("//button[text()='Click here to access Your Documents']");
	By label                                = By.xpath("//ui-button[@class='u-show-hands ng-scope ng-isolate-scope']");
	By otpTextField2                        = By.xpath("//input[@placeholder='ex: 768598']");
	By signButton                           = By.xpath("//span[text()='Sign']"); 
	
	/** To Check For Prospects Screen */
	public void prospectsPage() throws InterruptedException
	{
		searchElement();
		Thread.sleep(3000);
		selectEtape();
		clickOnEleSignToggle();
		clickOnElectricSign();
	}
	
	/** To Check For Adding Signatury 1 */
	public void addingSignaturie1() throws InterruptedException
	{
		addSignatur();
		addFirstName();
		addLastName();
		addEmail();
		addNumber();
		clickOnSave();
	}
	
	/** To Check For Adding Signatury 2 */
	public void addingSignaturie2() throws InterruptedException
	{
		addSignatur();
		addFirstName();
		addLastName();
		addEmail();
		addNumber();
		clickOnSave();
	}
	
	/** To Check For Select Signaturies */
	public void selectSignturies()
	{
		selectSign1();
		selectSign2();
		clickOnNext();
	}
	
	/** To Check For Documents Uploading */
	public void uploadDocuments() throws InterruptedException, IOException
	{
		uploadFile();
		clickOnNext();
	}
	
	/** To Check For Parameters */
	public void parametres()
	{
		clickOnNext();
	}
	
	/** To Check For Email Templates */
	public void emailTemplate() throws InterruptedException
	{
		selectEmailTemplate();
		ClickOnfinaliser();
	}
	
	/** To Check For Select program From DropDown */
	public void clickOnProgram() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement program                 = driver.findElement(oppoProgLink);
		program.click();
		Thread.sleep(2000);
		WebElement env                   = driver.findElement(programDropDown);
		env.click();
	}
	
	/** To Check For Prospects Screen */
    public void clickOnProspects() throws InterruptedException
    {
    	Thread.sleep(60000);
    	WebElement prospects               = driver.findElement(linkForProspects);
       	prospects.click();
    	WebElement pro                     = driver.findElement(pros);
    	pro.click();
    }
    
    public void clickOnAddOpp()
    {
       	WebElement adding                  = driver.findElement(linkForAddOpp);
    	adding.click();
    }
    /* PROSPECTS HOME SCREEN */
    /** To Check For Search Element */
    public void searchElement()
    {
    	WebElement search                  = driver.findElement(searchField);
    	waitForElement(searchField);
    	search.sendKeys("Dean");
    }
    
    /** To Check For Select Step */
    public void selectEtape() throws InterruptedException
    {
    	waitForElement(etape);
    	WebElement clickEtape              = driver.findElement(etape);
    	clickEtape.click();
//    	List<WebElement> chooseEtape       = driver.findElements(chooseValue);
//    	for (WebElement select : chooseEtape) {
//    		if(select.getText().equals(" Réservation "))
//    		{
//    			Thread.sleep(2000);
//    			select.click();
//    		}
//			
//		}
    	WebElement value                  = driver.findElement(chooseValue);
    	value.click();
    }
    
    /** To Check For Electronic Signature Toggle */
    public void clickOnEleSignToggle()
    {
    	WebElement toggle                 = driver.findElement(signToggle);
    	toggle.click();
    }
    
    /** To Check For Electric Signature */
    public void clickOnElectricSign()
    {
    	WebElement ES                     = driver.findElement(signElectronic);
    	ES.click();
    }
    public void clickOnAddSignDropDown() throws InterruptedException
    {
     	WebElement drop                   = driver.findElement(addSignDropDown);
    	drop.click();
    }
    public void searchAddNewSign()
    {
    	WebElement addNew                 = driver.findElement(SignSearchField);
    	addNew.sendKeys("Add new signatarie");
    }
    
    /** To Check For Adding Signature 
     * @throws InterruptedException */
    public void addSignatur() throws InterruptedException
    {
        Thread.sleep(10000);
    	WebElement sign                   = driver.findElement(addSignataire);
    	sign.click();
    }
    
    /* SIGNATAIRE SCREEN */
    /** To Check For Enter First Name */
    public void addFirstName()
    {
    	WebElement FN                    = driver.findElement(preNom);
    	int text = new Random().nextInt(1000);
    	FN.sendKeys("Vajra" + text);
    }
    
    /** To Check For Enter Last Name */
    public void addLastName()
    {
    	waitForElement(nom);
    	WebElement LN                    = driver.findElement(nom);
    	int text   = new Random().nextInt(1000);
    	LN.sendKeys("Ayudha" + text);
    }
    
    /** To Check For Enter Email */
    public void addEmail()
    {
    	WebElement email                = driver.findElement(emailID);
    	int text  = new Random().nextInt(1000);
    	email.sendKeys("vajrayudha"+ text +"@gmail.com");
    }
    
    /** Too Check For Enter Number */
    public void addNumber() throws InterruptedException
    {
    	WebElement clickCCode           = driver.findElement(telePhone);
    	clickCCode.click();
    	Thread.sleep(3000);
    	WebElement drop  = driver.findElement(telePhoneDropDown);
    	drop.click();
    	Thread.sleep(20000);
    	WebElement enterNumber          = driver.findElement(telePhoneTextField);
    	Thread.sleep(20000);
    	enterNumber.click();
    	int text  = new Random().nextInt(1000);
    	enterNumber.sendKeys("9542478" + text);
    }
//    	List<WebElement> chooseCountry  = driver.findElements(telePhoneDropDown);
//    	for (WebElement Ccode : chooseCountry) {
//    		if(Ccode.getText().equals("India(+91)"))
//    		{
//    			Thread.sleep(3000);
//    			Ccode.click();
//    		}
//			
//		}
//    }
//    	Thread.sleep(20000);
//    	WebElement enterNumber          = driver.findElement(telePhoneTextField);
//    	Thread.sleep(20000);
//    	enterNumber.click();
//    	enterNumber.sendKeys("9542478895");
    	
//    }
//    public void enterNumber() throws InterruptedException
//    {
//    	Thread.sleep(20000);
//    	WebElement enterNumber          = driver.findElement(telePhoneTextField);
//    	Thread.sleep(20000);
//    	enterNumber.click();
//    	enterNumber.sendKeys("9542478895");
//    	int text  = new Random().nextInt(1000);
//    	enterNumber.sendKeys("9542478"+ text);
    //}
    
    /** To Check For Save */
    public void clickOnSave()
    {
    	WebElement save                = driver.findElement(saveBtn);
    	save.click();
    }
    
    public void clickOnOutSide()
    {
    	WebElement out                 = driver.findElement(outside);
    	out.click();
    }
    /** To Check For Select Signature 1 */
    public void selectSign1()
    {
    	WebElement sign1               = driver.findElement(select1);
    	sign1.click();
    }
    
    /** To Check For Select Signature 2 */
    public void selectSign2()
    {
    	WebElement sign2               = driver.findElement(select2);
    	sign2.click();
    }
    
    /** To Check For Next */
    public void clickOnNext()
    {
    	WebElement next                = driver.findElement(nextStep);
    	next.click();
    }
    
    /* DOCUMENTS SCREEN */
    /** To Check For File Uploading */
	public void uploadFile() throws InterruptedException, IOException
	{
//		driver.get("https://altoconvertpdftojpg.com/");
//		WebElement    filePage        = driver.findElement(By.xpath("//div[text()='Documents']"));
//		Thread.sleep(20000);
//		filePage.click();
		WebElement file               = driver.findElement(dragSelect);
		Thread.sleep(5000);
		file.click();
//		driver.findElement(By.xpath("//span[text()='Choose File']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Documents\\AutoiT\\eSign.exe");
		Thread.sleep(3000);
	}
	
	/* EMAIL TEMPLATE SCREEN */
	/** To Check For Select Email Template */
	public void selectEmailTemplate() throws InterruptedException
	{
//		WebElement temp              = driver.findElement(By.xpath("//div[text()='Template de mail']"));
//		temp.click();
		List<WebElement> chooseTemp  = driver.findElements(emailTemplate);
		for (WebElement template : chooseTemp) {
			if(template.getText().equals("Email 2"))
			{
				template.click();
			}
			
		}
		
	}
	
	/** To Check For Finaliser */
	public void ClickOnfinaliser()
	{
		waitForElementClick(finaliserBtn);
		WebElement finalBtn          = driver.findElement(finaliserBtn);
		finalBtn.click();
		WebElement popUp             = driver.findElement(yesPopUp);
		waitForElement(yesPopUp);
		popUp.click();
	}
	
	/** Click on verification link in Gmail  */
	public void loginGmail() throws InterruptedException
	{
			driver.get("https://mail.google.com/");
			
			WebElement enterEmail        = driver.findElement(emailId);
			enterEmail.sendKeys("sekhar@softsuave.com");
			
			WebElement clickOnNext       = driver.findElement(gmailNext);
			clickOnNext.click();
			
			waitForElement(gmailPwd);
			WebElement enterPassword     = driver.findElement(gmailPwd);
			Thread.sleep(2000);
			enterPassword.sendKeys("Kasi@199616");
			
			WebElement clickOnNext1      = driver.findElement(passwordNext);
			clickOnNext1.click();
			Thread.sleep(10000);
			
			WebElement search            = driver.findElement(mailSearch);
			Thread.sleep(5000);
			search.sendKeys("admin@arlynk.com");
			
			WebElement searchButton      = driver.findElement(searchBtn);
			Thread.sleep(3000);
			searchButton.click();
			Thread.sleep(3000);
			
			WebElement admin             = driver.findElement(selectMail);
			admin.click();
			
			waitForElement(linkForDocs);
			WebElement linkDocs          = driver.findElement(linkForDocs);
			linkDocs.click();
			
			System.out.println(driver.getCurrentUrl());
			ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs_windows.get(1));
			System.out.println(tabs_windows);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(8000);
			for(int i=0;i<=28;i++)
			{
				driver.findElement(By.xpath("//ui-icon[@id='js-pdf-viewer__next-page']")).click();
			}
//			driver.switchTo().window(tabs_windows.get(0));
//		
//			System.out.println(driver.getCurrentUrl());
//			driver.switchTo().window(windows.get(1));
//			System.out.println(driver.getCurrentUrl());
			Thread.sleep(8000);
			WebElement labelText           = driver.findElement(label);
			waitForElement(label);
			labelText.click();
			Thread.sleep(30000);
			WebElement signIn              = driver.findElement(signButton);
			signIn.click();
		
		}
	    
		
	
	}
	
	
	
	
	


