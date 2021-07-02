package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactSuiviDu extends DefaultProgram{
	
	By suiviMenuLink                  = By.xpath("//label[text()='Suivi du contact']");
	By addActionButton                = By.xpath("//button[text()='Ajouter une action ']");
	
	By program                        = By.xpath("(//div[@class='mat-select-value'])[2]");
	By programDropDown                = By.xpath("//span[@class='mat-option-text']");

	By createActionButton             = By.xpath("//button[text()='Créer une tâche']");
	By actionTypesList                = By.xpath("//span[@class='ic']/../label");
	
	By priorityTextField              = By.xpath("(//div[@class='mat-select-value'])[3]");
	By DropDown                       = By.xpath("//span[@class='mat-option-text']");
	
	By dateTextField                  = By.xpath("//input[@placeholder='Date Time']");
	By monthAndYear                   = By.xpath("//button[@aria-label='Choose month and year']");
	By yearList                       = By.xpath("(//tr[@class='ng-star-inserted'])/td/span");
	By monthDateList                  = By.xpath("//span[@class='owl-dt-calendar-cell-content']");
	
	By calendarSetButton              = By.xpath("//span[text()='Set']");
	
	By envoyerTextField               = By.xpath("(//div[@class='mat-select-value'])[4]");
	
	By commentaireTextField           = By.xpath("//textarea[@placeholder='Remarques']");
	
	By submitButton                   = By.xpath("//button[text()='Enregistrer ']");
	
    By cancelButton                   = By.xpath("//button[text()='Annuler']");
    By opportunityWindowCancel        = By.xpath("(//div[@class='close-icon'])[1]");
	
	
    public void suiviDuContact() throws InterruptedException
    {
    	clickOnSuiviDuContact();
    	addAction();
    	clickOnProgram("KGF_Industries - CoWorking Lot2");
    	createTask();
    	selectAction();
    	clickOnCalendar();
    	selectYear("2022");
    	selectMonth("sept.");
    	selectDate("1");
    	clickOnSet();
    	selectPriority(" Moyenne ");
    	selectReminder(" 1 semaine avant ");
    	enterDescription();
    	clickOnSubmit();
    	clickOnCancel();
    	clickOnOpportunityWindowCancel();
    }
	
	public void clickOnSuiviDuContact()
	{
		waitForElement(suiviMenuLink);
		WebElement sdc                = driver.findElement(suiviMenuLink);
		sdc.click();
	}
	
	public void addAction()
	{
		waitForElement(addActionButton);
		WebElement action             = driver.findElement(addActionButton);
		action.click();
	}
	
	public String clickOnProgram(String ProgramName) throws InterruptedException
	{
    	WebElement chooseProgram     = driver.findElement(program);
    	Thread.sleep(5000);
    	chooseProgram.click();
		
		List<WebElement> programList = driver.findElements(programDropDown);
		for (WebElement selectProgram : programList) {
			if(selectProgram.getText().equals(ProgramName))
			{
				selectProgram.click();
				break;
			}
		}
		
		return ProgramName;
	}
	
	public void createTask()
	{
		waitForElement(createActionButton);
		WebElement task              = driver.findElement(createActionButton);
		task.click();
	}
	
	public void selectAction()
	{
		List<WebElement> actionType = driver.findElements(actionTypesList);
		for (WebElement chooseType : actionType) {
			if(chooseType.getText().equalsIgnoreCase("SMS"))
			{
				chooseType.click();
				break;
			}
		}
	}
	
	public void clickOnCalendar()
	{
		waitForElement(dateTextField);
		WebElement calendar       = driver.findElement(dateTextField);
		calendar.click();
		
		WebElement monthYear      = driver.findElement(monthAndYear);
		monthYear.click();
	}
	
	public  String selectYear(String Year)
	{
		List<WebElement> year     = driver.findElements(yearList);
		for (WebElement chooseYear : year) {
			if(chooseYear.getText().equalsIgnoreCase(Year))
			{
				chooseYear.click();
				break;
			}
		}
		return Year;
	}
	
	public String selectMonth(String monthName)
	{
		List<WebElement> month   = driver.findElements(monthDateList);
		for (WebElement chooseMonth : month) {
			if(chooseMonth.getText().equalsIgnoreCase(monthName))
			{
				chooseMonth.click();
				break;
			}
		}
		return monthName;
	}
	
	public String selectDate(String Date)
	{
		List<WebElement> date   = driver.findElements(monthDateList);
		for (WebElement chooseDate : date) {
			if(chooseDate.getText().equals(Date))
			{
				chooseDate.click();
				break;
			}
		}
		return Date;
	}
	
	public void clickOnSet()
	{
		waitForElement(calendarSetButton);
		WebElement set          = driver.findElement(calendarSetButton);
		set.click();
	}
	
	public String selectPriority(String Priority)
	{
		waitForElement(priorityTextField);
		WebElement priorityField = driver.findElement(priorityTextField);
		priorityField.click();
		
		List<WebElement> priority = driver.findElements(DropDown);
		for (WebElement choosePriority : priority)
		{
			if(choosePriority.getText().equals(Priority))
			{
				choosePriority.click();
				break;
			}
		}
		return Priority;
	}
	
	public String selectReminder(String reminderTime)
	{
		waitForElement(envoyerTextField);
		WebElement reminder    = driver.findElement(envoyerTextField);
		reminder.click();
		
		List<WebElement> chooseReminder = driver.findElements(DropDown);
		for (WebElement selectEnvoyer : chooseReminder) 
		{
			if(selectEnvoyer.getText().equals(reminderTime))
			{
				selectEnvoyer.click();
				break;
			}
		}
		return reminderTime;
	}
	
	public void enterDescription()
	{
		waitForElement(commentaireTextField);
		WebElement description  = driver.findElement(commentaireTextField);
		description.sendKeys("Action Created");
	}
	
	public void clickOnSubmit()
	{
		waitForElement(submitButton);
		WebElement submit      = driver.findElement(submitButton);
		submit.click();
	}
	
	public void clickOnCancel()
	{
		waitForElement(cancelButton);
		WebElement cancel      = driver.findElement(cancelButton);
		cancel.click();
	}
	
	public void clickOnOpportunityWindowCancel()
	{
		waitForElement(opportunityWindowCancel);
		WebElement windowCancel = driver.findElement(opportunityWindowCancel);
		windowCancel.click();
	}

}
