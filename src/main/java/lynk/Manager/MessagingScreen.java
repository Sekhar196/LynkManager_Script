package lynk.Manager;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MessagingScreen extends DefaultProgram{
	
	
	
	By messagingMenuLink              = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[11]");
	By messagingScreenLink            = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[11]/a");
	By syncButton                     = By.xpath("//button[text()='Sync Outlook']");
	
	/** SIGN IN TO MICROSOFT ACCOUNT */
	
	By emailID                        = By.xpath("//input[@id='i0116']");
	By nextButton                     = By.xpath("//input[@id='idSIButton9']");
	By password                       = By.xpath("//input[@id='i0118']");
	By pwdNextButton                  = By.xpath("//input[@id='idSIButton9']");
	
	/* HOME SCREEN */
	By newMessageButton               = By.xpath("//button[@class='custom-btn btn-compose btn-block my-2']");
	By toTextField                    = By.xpath("//input[@formcontrolname='item']");
	By subjectTextField               = By.xpath("//input[@id='emailSubject']");
	By contentTextField               = By.xpath("//div[@role='textbox']");
	By addAttachment                  = By.xpath("//div[text()=' Add Attachments ']");
	By sendButton                     = By.xpath("//button[text()='Send']");
	By CancelOutlook                  = By.xpath("//button[text()='Annuler la connexion avec Outlook']");
	By dropDownArrow                  = By.xpath("//button[@class='btn email-opt-arrow dropdown-toggle']");
	By dropDownFrom                   = By.xpath("//label[text()='From']/../input");
	By dropDownTo                     = By.xpath("//label[text()='To']/../input");
	By dropDownSubject                = By.xpath("//label[text()='Subject']/../input");
	By dropDownPathList               = By.xpath("//option[@class='ng-star-inserted']");
	By searchButton                   = By.xpath("//button[text()='Rechercher']");
	
	/* ADD EVENT */
	By calendarFolder                 = By.xpath("//div[text()=' Calendrier ']");
	By addEventLink                   = By.xpath("//button[@class='add-contact-btn']");
	By eventSubject                   = By.xpath("//input[@id='mat-input-5']");
	By eventDescription               = By.xpath("//input[@id='mat-input-6']");
	By eventAttendees                 = By.xpath("//input[@formcontrolname='item']");
	By calendarIcon                   = By.xpath("//button[@class='mat-icon-button']");
	By dropdownForYears               = By.xpath("//div[@class='mat-button-ripple mat-ripple']");
	By yearsList                      = By.xpath("//div[@class='mat-calendar-body-cell-content']");
	By monthList                      = By.xpath("//div[@class='mat-calendar-body-cell-content']");
	By datesList                      = By.xpath("//div[@class='mat-calendar-body-cell-content']");
	By startTimeTextLink              = By.xpath("//input[@placeholder='Start time']");
	By endTimeTextLink                = By.xpath("//input[@placeholder='End time']");
	By eventTimeInHrs                 = By.xpath("//div[@class='clock-face']/div//span");
	By eventTimeInMins                = By.xpath("//div[@class='clock-face']/div/div/span");
	By okButton                       = By.xpath("//span[text()='Ok']");
	By addressTextField               = By.xpath("//input[@placeholder='Adresse']");
	By addressDropDown                = By.xpath("//span[text()='Ramakrishna Nagar, Porur, Chennai, Tamil Nadu, India']/..");
	
	
	/* CREATE CONTACT */
	
	By contactMenuLink                = By.xpath("//div[text()=' Contacts ']");
	By addContactLink                 = By.xpath("//button[@class='add-contact-btn']");
	By firstNameTextField             = By.xpath("//input[@placeholder='First name']");
	By surNameTextField               = By.xpath("//input[@placeholder='Sur name']");
	By contactEmailID                 = By.xpath("//input[@placeholder='Email']");
	By mobileNumberTextField          = By.xpath("//input[@placeholder='Mobile']");
	By workTextField                  = By.xpath("//input[@placeholder='Company']");
	By noteTextField                  = By.xpath("//input[@placeholder='personal note']");
	By addMoreDropDown                = By.xpath("//div[@class='mat-select-value']");
	By addMoreDropDownList            = By.xpath("//span[@class='mat-option-text']");
	By businessTextField              = By.xpath("//input[@placeholder='Business phone']");
	By streetTextField                = By.xpath("//input[@placeholder='Street']");
	By cityTextField                  = By.xpath("//input[@placeholder='City']");
	By stateTextField                 = By.xpath("//input[@placeholder='State']");
	By countryTextField               = By.xpath("//input[@placeholder='Country']");
	By postalCodeTextField            = By.xpath("//input[@placeholder='Postal Code']");
	By saveButton                     = By.xpath("//button[text()='Sauvegarder']");
	
	By inboxLink                      = By.xpath("//span[text()='Inbox']");
	By selectMessage                  = By.xpath("(//input[@type='checkbox'])[2]");
	By deleteAndArchive               = By.xpath("//div[@class='btn-action']/*");
	
	By mailSearchTextField            = By.xpath("//span[@class='outlook-cir']");
	
	public void messagingMethods() throws InterruptedException, IOException
	{
//		clickOnCancelOutlook();
//		Thread.sleep(5000);
//		clickOnSyncOutLook();
//		Thread.sleep(20000);
//		enterEmailID();
//		clickOnEmailNext();
//		Thread.sleep(5000);
//		enterPassword();
//		clickOnPwdNext();
//		Thread.sleep(90000);
//		clickOnNewMessage();
//		enterToMailID();
//		enterSubject();
//		enterContent();
//		uploadAttachments();
//		clickOnSend();
		clickOnDropDown();
		enterFromMailID();
		enterToMail();
		enterSub();
		selectPath();
		clickOnSearch();
	}
	public void addEvent()
	{
		clickOnCalendarInMenu();
		clickOnAddEvent();
		enterEventSubject();
		enterEventDescription();
		enterAttendees();
		clickOnCalendar();
		selectYear();
		selectMonth();
		selectDate();
		selectTime();
		selectMins();
		clickOnOk();
		enterAddress();
		clickOnSave();
	}
	
	public void createContact()
	{
		clickOnContactInMenu();
		clickOnAddContact();
		enterFirstName();
		enterSurName();
		enterContactEmail();
		enterMobileNumber();
		enterCompany();
		enterPersonalNote();
		clickOnAddMoreDropDown();
//		enterBusinessPhone();
		enterStreet();
		enterCity();
		enterState();
		enterCountry();
		enterPostalCode();
		clickOnSave();
	}
	
//	public void actionClass() 
//	{
//		extent.createTest("Check Actions");
//		clickOnMailSearchingTextField();
////		messagingMethods();
//		clickOnInbox();
//		selectMessage();
//		selectAction();
//		extent.flush();
//	}
	
		public void clickOnMessagingScreen()
	{
		WebElement messaging          = driver.findElement(messagingMenuLink);
		messaging.click();
		WebElement message            = driver.findElement(messagingScreenLink);
		message.click();
	}
	
	public void clickOnSyncOutLook()
	{
		WebElement outlook            = driver.findElement(syncButton);
		outlook.click();
	}
	public void enterEmailID()
	{
		waitForElementClick(emailID);
		WebElement email              = driver.findElement(emailID);
		email.sendKeys("kasisekhar16@gmail.com");
	}
	public void enterPassword()
	{
		WebElement pwd                = driver.findElement(password);
		pwd.sendKeys("Kasi@1996");
	}
	public void clickOnEmailNext()
	{
		WebElement next               = driver.findElement(nextButton);
		next.click();
	}
	public void clickOnPwdNext()
	{
		WebElement pwdNext            = driver.findElement(pwdNextButton);
		pwdNext.click();
	}
	public void clickOnNewMessage()
	{
		WebElement newMessage         = driver.findElement(newMessageButton);
		newMessage.click();
	}
	public void enterToMailID()
	{
		WebElement receiver           = driver.findElement(toTextField);
		receiver.sendKeys("sekhar@softsuave.com");
	}
	public void enterSubject()
	{
		WebElement subject            = driver.findElement(subjectTextField);
		subject.sendKeys("hello");
	}
	public void enterContent()
	{
		WebElement content            = driver.findElement(contentTextField);
		content.sendKeys("Hope you're doing well");
	}
	public void uploadAttachments() throws InterruptedException, IOException
	{
		WebElement addAttach          = driver.findElement(addAttachment);
		addAttach.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Documents\\AutoiT\\progProfile.exe");
	}
	public void clickOnSend()
	{
		WebElement send               = driver.findElement(sendButton);
		send.click();
	}
	public void clickOnCancelOutlook()
	{
		WebElement outlook            = driver.findElement(CancelOutlook);
		outlook.click();
	}
	public void clickOnDropDown()
	{
		WebElement dropDown           = driver.findElement(dropDownArrow);
		dropDown.click();
	}
	public void enterFromMailID() 
	{
		waitForElement(dropDownFrom);
		WebElement from               = driver.findElement(dropDownFrom);
		from.sendKeys("kasisekhar16@gmail.com");
	}
	public void enterToMail()
	{
		waitForElement(dropDownTo);
		WebElement to                 = driver.findElement(dropDownTo);
		to.sendKeys("sekhar@softsuave.com");
	}
	public void enterSub()
	{
		WebElement sub                = driver.findElement(dropDownSubject);
		sub.sendKeys("Hello");
	}
	public void selectPath()
	{
		WebElement field              = driver.findElement(By.xpath("//label[text()='Path']/../select"));
		field.click();
//		Select pathValue              = new Select(driver.findElement(dropDownPathList));
//		pathValue.selectByVisibleText("Sent Items");
		
	}
	public void clickOnSearch()
	{
		WebElement search             = driver.findElement(searchButton);
		search.click();
	}
	
	                      /** ADD EVENT    **/
	public void clickOnCalendarInMenu()
	{
		WebElement calendar           = driver.findElement(calendarFolder);
		calendar.click();
	}
	public void clickOnAddEvent()
	{
		WebElement addEvent           = driver.findElement(addEventLink);
		addEvent.click();
	}
	public void enterEventSubject()
	{
		WebElement subject            = driver.findElement(subjectTextField);
		subject.sendKeys("Christamas and New Year Celebrations");
	}
	public void enterEventDescription()
	{
		WebElement description        = driver.findElement(eventDescription);
		description.sendKeys("Full of fun and enjoy");
	}
	public void enterAttendees()
	{
		WebElement attendees          = driver.findElement(eventAttendees);
		attendees.sendKeys("100");
	}
	public void clickOnCalendar()
	{
		WebElement calIcon            = driver.findElement(calendarIcon);
		calIcon.click();
	}
	public void selectYear()
	{
		WebElement yearDropDown       = driver.findElement(dropdownForYears);
		yearDropDown.click();
		List<WebElement> year         = driver.findElements(yearsList);
		for (WebElement chooseYear : year) {
			if(chooseYear.getText().equals("2021"))
			{
				chooseYear.click();
			}
			
		}
	}
	public void selectMonth()
	{
		List<WebElement> month       = driver.findElements(monthList);
		for (WebElement chooseMonth : month) {
			if(chooseMonth.getText().equals("September"))
			{
				chooseMonth.click();
			}
			
		}
	}
	public void selectDate()
	{
		List<WebElement> date        = driver.findElements(datesList);
		for (WebElement chooseDate : date) {
			if(chooseDate.getText().equals("1"))
			{
				chooseDate.click();
			}
			
		}
	}
	public void selectTime()
	{
		WebElement start             = driver.findElement(startTimeTextLink);
		start.click();
		List<WebElement> startTime   = driver.findElements(eventTimeInHrs);
		for (WebElement selectTime : startTime) {
			if(selectTime.getText().equals("8"))
			{
				selectTime.click();
			}
			
		}
	}
	public void selectMins()
	{
		List<WebElement> mins        = driver.findElements(eventTimeInMins);
		for (WebElement selectMins : mins) {
			if(selectMins.getText().equals("45"))
			{
				selectMins.click();
			}
			
		}
	}
	public void clickOnOk()
	{
		WebElement ok                = driver.findElement(okButton);
		ok.click();
	}
	
	public void enterAddress()
	{
		WebElement address           = driver.findElement(addressTextField);
		address.sendKeys("porur");
		WebElement select            = driver.findElement(addressDropDown);
		select.click();
	}
	
	
	                      /** ADD CONTACT  **/
	public void clickOnContactInMenu()
	{
		WebElement contact           = driver.findElement(contactMenuLink);
		contact.click();
	}
	
	public void clickOnAddContact()
	{
		WebElement addContact       = driver.findElement(addContactLink);
		addContact.click();
	}
	
	public void enterFirstName()
	{
		WebElement FN               = driver.findElement(firstNameTextField);
		FN.sendKeys("Sekhar");
	}
	
	public void enterSurName()
	{
		WebElement SN              = driver.findElement(surNameTextField);
		SN.sendKeys("Kasi");
	}
	public void enterContactEmail()
	{
		WebElement email           = driver.findElement(contactEmailID);
		email.sendKeys("sekhar@softsuave.com");
	}
	
	public void enterMobileNumber()
	{
		WebElement mobileNumber    = driver.findElement(mobileNumberTextField);
		mobileNumber.sendKeys("9854762145");
	}
	
	public void enterCompany()
	{
		WebElement companyName     = driver.findElement(workTextField);
		companyName.sendKeys("S S");
	}
	public void enterPersonalNote()
	{
		WebElement note            = driver.findElement(noteTextField);
		note.sendKeys("Rock");
	}
	public void clickOnAddMoreDropDown()
	{
		WebElement add             = driver.findElement(addMoreDropDown);
		add.click();
		List<WebElement> addmore   = driver.findElements(addMoreDropDownList);
		for (WebElement chooseOption : addmore) {
			if(chooseOption.getText().equals("HomeAddress"))
			{
				chooseOption.click();
			}
			
		}
	}
	
	public void enterBusinessPhone()
	{
		WebElement businessPhone  = driver.findElement(businessTextField);
		businessPhone.sendKeys("6548761452");
	}
	
	public void enterStreet()
	{
		WebElement street         = driver.findElement(streetTextField);
		street.sendKeys("");
	}
	
	public void enterCity()
	{
		WebElement city          = driver.findElement(cityTextField);
		city.sendKeys("Tirupati");
	}
	
	public void enterState()
	{
		WebElement state         = driver.findElement(stateTextField);
		state.sendKeys("A P");
	}
	
	public void enterCountry()
	{
		WebElement country       = driver.findElement(countryTextField);
		country.sendKeys("India");
	}
	
	public void enterPostalCode()
	{
		WebElement postalCode   = driver.findElement(postalCodeTextField);
		postalCode.sendKeys("524132");
	}
	public void clickOnSave()
	{
		WebElement save         = driver.findElement(saveButton);
		save.click();
	}
	
	public void clickOnInbox()
	{
		WebElement inbox        = driver.findElement(inboxLink);
		inbox.click();
	}
	
	public void selectMessage()
	{
		WebElement select       = driver.findElement(selectMessage);
		select.click();
	}
	
	public void selectAction()
	{
		List<WebElement> action = driver.findElements(deleteAndArchive);
		for (WebElement chooseAction : action) {
			if(chooseAction.getText().equals("Delete"))
			{
				chooseAction.click();
			}
			
		}
	}
	
	public void clickOnOutlookIcon()
	{
//		waitForElement(mailSearchTextField);
//		WebElement search      = driver.findElement(mailSearchTextField);
//		search.click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@class='outlook-cir']")));
	}
}
