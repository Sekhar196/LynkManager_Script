package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContentsScreen extends DefaultProgram{
	
	
	
	By contentsMenuLink                   = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[3]");
	By contentScreenLink                  = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[3]/a");
	By outSideLink                        = By.xpath("//span[text()='Actions ']");
	By listOfPrograms                     = By.xpath("//div[@class='programme-filter-btns']/button");
	By listOfContentType                  = By.xpath("//div[@class='nom-filter-btns']/button");
	By contentViewButton                  = By.xpath("//*[@id=\"wrapper\"]/div/div/app-media/div/div/div/div/div/div[3]/app-sort-table/table/tbody/tr[1]/td[5]/div/i[1]");//("//i[@class='icon icon-view ng-star-inserted'][1]");
	By fullView                           = By.xpath("//button[@id='ngx-fs-btn']");
	By closeSymbol                        = By.xpath("//button[@class='close-btn']");
	By contentDownload                    = By.xpath("//*[@id=\"wrapper\"]/div/div/app-media/div/div/div/div/div/div[3]/app-sort-table/table/tbody/tr[1]/td[5]/div/i[2]");
	
	
	
	public void contentScreen() throws InterruptedException
	{
		selectProgram();
		selectContentType();
		Thread.sleep(2000);
		clickOnDownload();
//		clickOnViewSymbol();
//		clickOnFullView();
//		clickOnEscape();
//		clickOnClose();
	}
	public void clickOnContentScreenLink()
	{
		WebElement menu                   = driver.findElement(contentsMenuLink);
		menu.click();
		WebElement link                   = driver.findElement(contentScreenLink);
		link.click();
	}
	public void clickOnOutSide()
	{
		WebElement out                    = driver.findElement(outSideLink);
		out.click();
	}
	public void selectProgram() throws InterruptedException
	{
//		WebElement chooseprog             = driver.findElement(listOfPrograms);
//		chooseprog.click();
		List<WebElement> programs         = driver.findElements(listOfPrograms);
		System.out.println("Total Programs " + programs.size());
		for (WebElement chooseProg : programs) {
			if(chooseProg.getText().equals("Selling_lots_in_Appartments"))
			{
				chooseProg.click();
			}
			
		}
	}
	public void selectContentType()
	{
		List<WebElement> type             = driver.findElements(listOfContentType);
		System.out.println("Media Type List " + type.size());
		for (WebElement docType : type) {
			if(docType.getText().equals("Image HD"))
			{
				docType.click();
			}
			
		}
	}
	public void clickOnViewSymbol()
	{
		WebElement view                  = driver.findElement(contentViewButton);
		view.click();
	}
	public void clickOnFullView()
	{
		WebElement fView                 = driver.findElement(fullView);
		fView.click();
	}
	public void clickOnEscape()
	{
		Actions act                      = new Actions(driver);
		act.sendKeys(Keys.ESCAPE);
	}
	public void clickOnClose() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement close                 = driver.findElement(closeSymbol);
		close.click();
	}
	public void clickOnDownload()
	{
		WebElement download              = driver.findElement(contentDownload);
		download.click();
	}
	
	

}
