package lynk.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllotementScreen extends DefaultProgram{

	
	By allotmentMenuLink                          = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[10]");
	By allotmentScreenLink                        = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[10]/a");
	By viewButton                                 = By.xpath("//span[@class='view-badge']");
	By progAssignTable                            = By.xpath("//div[text()=' Assigner le programme entier ']/../../div[2]/app-sort-table/table//tr/td");
	By closeButton                                = By.xpath("//div[@class='close-icon']/i");
	By filterDropDown                             = By.xpath("//mat-option[@class='mat-option mat-active']/../*");
	By outSide                                    = By.xpath("//span[text()='statut ']");
	By progFilterDropDown                         = By.xpath("//div[@class='mat-form-field-infix']");
	By prog                                       = By.xpath("(//span[text()=' 1A Prog '])[1]");//("//span[text()=' New Programmmee ']");
	By leadCount                                  = By.xpath("//div[@class='lead-count']");
	By resetFilter                                = By.xpath("//*[@id=\"mat-select-42\"]/div/div[2]/div");
	
	
	public void clickOnAllotmentInMenu()
	{
		WebElement allotment                      = driver.findElement(allotmentMenuLink);
		allotment.click();
	}
	public void clickOnAllotmentScreenLink()
	{ 
		WebElement allotmentScreen                = driver.findElement(allotmentScreenLink);
		allotmentScreen.click();
	}
	public void clickOnView()
	{
		WebElement view                           = driver.findElement(viewButton);
		view.click();
	}
//	public void getstatus(String Name)
//	{
//		String xpath = "//div[text()=' Assigner le programme entier ']/../../div[2]/app-sort-table/table//tr";//div[text()=' Assigner le programme entier ']/../../div[2]/app-sort-table/table//tr/td";
//				
//		xpath = xpath.replace("Replace", Name);
//		WebElement status = driver.findElement(By.xpath(xpath));
//		return status.getText();
//		System.out.println(status.getText());
	public void getstatus(String Name)
	{
		String xpath = "//td[text()='Replace']/following-sibling::td[3]";
		xpath = xpath.replace("Replace", "Reigns576 Roman233");
		WebElement status = driver.findElement(By.xpath(xpath));
//		return status.getText();
		System.out.println(status.getText());
	}
	
	public void clickOnClose()
	{
		WebElement close                         = driver.findElement(closeButton);
		close.click();
	}
	public void clickOnOutSide()
	{
		WebElement out                           = driver.findElement(outSide);
		out.click();
	}
	public void selectProgram() throws InterruptedException
	{
		WebElement progFilter                    = driver.findElement(progFilterDropDown);
		progFilter.click();
		Thread.sleep(5000);
		WebElement selectProg                    = driver.findElement(prog);
		selectProg.click();
		WebElement count                         = driver.findElement(leadCount);
		System.out.println(count.getText());
	}
	public void clickOnProgDropDown()
	{
		waitForElement(progFilterDropDown);
		WebElement progFilter                    = driver.findElement(progFilterDropDown);
		progFilter.click();
	}
	public void selectReset() throws InterruptedException
	{
		WebElement reset                         = driver.findElement(resetFilter);
		reset.click();
	}

}
	

