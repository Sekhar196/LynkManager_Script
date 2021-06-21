package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesFollowUpScreen extends DefaultProgram{
	
	
	By salesfollowUpMenuLink            = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[13]");
	By salesFollowUpScreenLink          = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[13]/a");
	By outSideLink                      = By.xpath("(//div[@class='pipline-info'])[3]");
	By filterList                       = By.xpath("//span[@class='filter-name']");
	By addActionButton                  = By.xpath("(//div[@class='add-action'])[1]");
	By typeOfAction                     = By.xpath("//label[@class='mls ic-name']");
	By priorityDropDown                 = By.xpath("(//div[@class='mat-select-value'])[1]");
	By reminderDropDown                 = By.xpath("(//div[@class='mat-select-value'])[2]");
	By pRDropDownList                   = By.xpath("//span[@class='mat-option-text']");
	By calendarIcon                     = By.xpath("//i[@class='fa fa-calendar']");
	By monthList                        = By.xpath("//select[@class='custom-select'][1]/option");
	By yearList                         = By.xpath("//select[@class='custom-select'][2]/option");
	By datestList                       = By.xpath("//div[@class='btn-light ng-star-inserted']");
	By iconForTime                      = By.xpath("//button[@class='btn btn-block btn-outline-secondary']");
	By hoursField                       = By.xpath("(//input[@class='ngb-tp-input form-control'])[1]");
	By minsField                        = By.xpath("(//input[@class='ngb-tp-input form-control'])[2]");
	By secondIcon                       = By.xpath("//button[@class='btn btn-block btn-outline-secondary']");
	By oKButton                         = By.xpath("//button[text()='OK']");
	By recordButton                     = By.xpath("//button[text()='Enregistrer ']");
	
	
	
	public void salesFollowUpScreen() throws InterruptedException
	{
		clickOnMenuLink();
		Thread.sleep(25000);
		clickOnOutSide();
		selectFilter();
		clickOnAddAction();
		selectAction();
		selectPriority();
		selectReminder();
		clickOnCalendarIcon();
		selectMonth();
		selectYear();
		selectDate();
		enterTime();
		clickOnOkButton();
		clickOnRecord();
	}
	public void clickOnMenuLink()
	{
		WebElement menu                 = driver.findElement(salesfollowUpMenuLink);
		menu.click();
		WebElement screen               = driver.findElement(salesFollowUpScreenLink);
		screen.click();
	}
	public void clickOnOutSide()
	{
		WebElement out                  = driver.findElement(outSideLink);
		out.click();
	}
	
	public void selectFilter()
	{
		waitForElementClick(filterList);
		List<WebElement> filterType     = driver.findElements(filterList);
		for (WebElement filter : filterType) {
			if(filter.getText().equals("Réservations"))
			{
				filter.click();
			}
			
		}
	}
	
	public void clickOnAddAction()
	{
		WebElement action              = driver.findElement(addActionButton);
		action.click();
	}
	
	public void selectAction()
	{
		List<WebElement> selAction     = driver.findElements(typeOfAction);
		for (WebElement chooseAction : selAction) {
			if(chooseAction.getText().equals("Appel"))
			{
				chooseAction.click();
			}
			
		}
	}
	
	public void selectPriority() throws InterruptedException
	{
		WebElement priority            = driver.findElement(priorityDropDown);
		priority.click();
		Thread.sleep(2000);
		List<WebElement> selPriority   = driver.findElements(pRDropDownList);
		for (WebElement choosePriority : selPriority) {
			if(choosePriority.getText().equals("Moyenne"))
			{
				choosePriority.click();
			}
			
		}
	}
	
	public void selectReminder() throws InterruptedException
	{
		WebElement reminder            = driver.findElement(reminderDropDown);
		reminder.click();
		Thread.sleep(2000);
		List<WebElement> selRemind     = driver.findElements(pRDropDownList);
		for (WebElement chooseRemind : selRemind) {
			if(chooseRemind.getText().equals("1 semaine avant"))
			{
				chooseRemind.click();
			}
			
		}
	}
	
	public void clickOnCalendarIcon()
	{
		WebElement calendar            = driver.findElement(calendarIcon);
		calendar.click();
	}
	
	public void selectMonth()
	{
//		WebElement ele  = driver.findElement(By.xpath("(//select[@class='custom-select'])[1]"));
//		ele.click();
//		Select sel    = new Select(driver.findElement(monthList));
//		sel.selectByVisibleText("Sep");
		List<WebElement> month         = driver.findElements(monthList);
		for (WebElement selMonth : month) {
			if(selMonth.getText().equals("Sep"))
			{
				selMonth.click();
			}
			
		}
	}
	public void selectYear()
	{
		List<WebElement> listOfYears   = driver.findElements(yearList);
		for (WebElement chooseYear : listOfYears) {
			if(chooseYear.getText().equals("2020"))
			{
				chooseYear.click();
			}
			
		}
		
//		Select sel    = new Select(driver.findElement(yearList));
//		sel.deselectByVisibleText("2020");
	}
	public void selectDate()
	{
		List<WebElement> selectDate    = driver.findElements(datestList);
		for (WebElement chooseDate : selectDate) {
			if(chooseDate.getText().equals("20"))
			{
				chooseDate.click();
			}
			
		}
	}
	public void enterTime()
	{
		WebElement icon               = driver.findElement(iconForTime);
		icon.click();
		WebElement hrs                = driver.findElement(hoursField);
		hrs.click();
		hrs.sendKeys("5");
		WebElement mins               = driver.findElement(minsField);
		mins.click();
		mins.sendKeys("45");
		WebElement icon1                = driver.findElement(secondIcon);
		icon1.click();
	}
	public void clickOnOkButton()
	{
		WebElement ok                 = driver.findElement(oKButton);
		ok.click();
	}
	
	public void clickOnRecord()
	{
		WebElement record             = driver.findElement(recordButton);
		record.click();
	}
}
