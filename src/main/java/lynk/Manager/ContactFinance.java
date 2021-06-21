package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactFinance extends DefaultProgram{
	
	
	By linkForFinance                   = By.xpath("//div[@class='menus-list']/ul/li[5]");
	
	By pretTextField                    = By.xpath("(//input[@id='capacite-contact'])[1]");
	By personalContribution             = By.xpath("(//input[@id='capacite-contact'])[2]");
	By borrowCapacity                   = By.xpath("//input[@formcontrolname='borrowCapacity']");

	By plusBtn                          = By.xpath("//i[@class='icon-plus']/..");
	By AnnTaxIncome                     = By.xpath("//input[@placeholder='Income']");
	By yearTextField                    = By.xpath("//select[@placeholder='Year']");
	By yearDropDown                     = By.xpath("//select[@placeholder='Year']/option");
	
	By register                         = By.xpath("//button[text()='Enregistrer']");
	By deleteBtn                        = By.xpath("(//i[@class='icon-delete']/..)[1]");
	
	
	/** To Check For Finance Screen */
	public void financeScreen()
	{
		clickOnFinance();
		enterPretAmount();
		enterPersonalContribution();
		enterBorrowing();
		
		clickOnPlusButton();
		annualTaxIncome();
		selectYear();	
		
		clickOnRegister();
	}
	
	/** To Check For Finance Link */
	public void clickOnFinance()
	{
		waitForElementClick(linkForFinance);
		WebElement finance             = driver.findElement(linkForFinance);
		finance.click();
	}
	
	public void enterPretAmount()
	{
		waitForElement(pretTextField);
		WebElement pret               = driver.findElement(pretTextField);
		pret.sendKeys("52000");
	}
	
	public void enterPersonalContribution()
	{
		waitForElement(personalContribution);
		WebElement personalCont      = driver.findElement(personalContribution);
		personalCont.sendKeys("65020");
	}
	/** To Check For Plus Button */
	public void clickOnPlusButton()
	{
		waitForElement(plusBtn);
		WebElement plus                = driver.findElement(plusBtn);
		plus.click();
	}
	
	/** To Check For Annual Tax Income */
	public void annualTaxIncome()
	{
		waitForElement(AnnTaxIncome);
		WebElement tax                 = driver.findElement(AnnTaxIncome);
		tax.sendKeys("50000");
	}
	
	/** To Check For Select Year */
	public void selectYear()
	{
		waitForElement(yearTextField);
		WebElement yearField           = driver.findElement(yearTextField);
		yearField.click();
		
		waitForElement(yearDropDown);
		List<WebElement> chooseYear    = driver.findElements(yearDropDown);
		for (WebElement year : chooseYear) {
			if(year.getText().equals("2021"))
			{
				year.click();
				break;
			}
			
		}
	}
	
	/** To Check For Enter Borrowing */
	public void enterBorrowing()
	{
		waitForElement(borrowCapacity);
		WebElement borrowing          = driver.findElement(borrowCapacity);
		borrowing.sendKeys("20000");
	}
	
	/** To Check For Registration */
	public void clickOnRegister()
	{
		waitForElement(register);
		WebElement registrar          = driver.findElement(register);
		registrar.click();
	}
	
	/** To Check For Delete */
	public void clickOnDelete()
	{
		waitForElement(deleteBtn);
		WebElement delete             = driver.findElement(deleteBtn);
		delete.click();
	}

}
