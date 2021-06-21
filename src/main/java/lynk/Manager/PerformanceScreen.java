package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PerformanceScreen extends DefaultProgram{
	
	
	By performanceMenuLink                 = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[9]");
	By performanceScreenLink               = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[9]/a");
	By progFilterDropDown                  = By.xpath("(//div[@class='mat-form-field-infix'])[1]");
	By progDropDownList                    = By.xpath("//span[@class='mat-option-text']");
	By lotFilterDropDown                   = By.xpath("(//div[@class='mat-form-field-infix'])[2]");
	By lotDropDownList                     = By.xpath("//span[@class='mat-option-text']");
	By searchTextField                     = By.xpath("//input[@name='searchValue']");
	By mailStatistics                      = By.xpath("//span[@class='email-type']");
	By resetButton                         = By.xpath("//button[@class='clear-btn']");
	By deleteCheckBox                      = By.xpath("//*[@id=\"mat-checkbox-338\"]/label/div");
	By deleteIcon                          = By.xpath("//*[@id=\"tab_2\"]/div/div[1]/div[2]/div[1]/i");
	By yesPopUp                            = By.xpath("//button[text()='OUI']");
	By automaticSending                    = By.xpath("//a[text()=' Envoi automatique ']");
	By emailView                           = By.xpath("//*[@id=\"tab_1\"]/div/div[2]/app-sort-table/table/tbody/tr[1]/td[10]/a/i");
	By emailDetails                        = By.xpath("//strong[@class='title-name']");
	By closeButton                         = By.xpath("//button[text()='Fermer']");
	
	
	
	
	public void clickOnMenu()
	{
		WebElement menu                   = driver.findElement(performanceMenuLink);
		menu.click();
		WebElement screen                 = driver.findElement(performanceScreenLink);
		screen.click();
	}
	public void clickOnProgramFilter()
	{
		WebElement progFilter             = driver.findElement(progFilterDropDown);
		progFilter.click();
		List<WebElement> chooseProg       = driver.findElements(progDropDownList);
		for (WebElement selectProg : chooseProg) {
			if(selectProg.getText().equals("Beautiful_Environment"))
			{
				selectProg.click();
			}
			
		}
	}
	public void clickOnLotsFilter()
	{
		WebElement lotsFilter            = driver.findElement(lotFilterDropDown);
		lotsFilter.click();
		List<WebElement> chooseLot       = driver.findElements(lotDropDownList);
		for (WebElement selectLot : chooseLot) {
			if(selectLot.getText().equals("T3"))
			{
				selectLot.click();
			}
			
		}
	}

}
