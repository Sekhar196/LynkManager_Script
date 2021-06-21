package lynk.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgramPackage extends DefaultProgram{
	
	By packageScreen     = By.xpath("(//label[text()='Package'])[1]");
	By packageLink       = By.xpath("//button[@class='add-package-btn ng-star-inserted']");
	By packageName       = By.xpath("//input[@id='name-package']");
	By apartment         = By.xpath("(//div[@class='mat-select-value'])[2]");
	By apartmentName     = By.xpath("//span[@class='mat-option-text']");
	By parking           = By.xpath("(//div[@class='mat-select-value'])[3]");
	By parkingName       = By.xpath("//span[@class='mat-option-text']");
	By create            = By.xpath("//button[text()='Créer']");
	By Suivant           = By.xpath("//button[text()='Suivant ']");
	
	By progSearch        = By.xpath("//input[@name='searchValue']");
	
	
	/** To Check For Package Screen 
	 * @throws InterruptedException */
	public void packagePage() throws InterruptedException
	{
		clickOnPackage();
		linkForPackage();
		nameForPackage();
		Thread.sleep(2000);
		lot1IsApartment();
		lot2Parking();
		linkForCreate();
		savebutton();
	}
	
	
	// Temporary code started
	
	public void clickOnPackage()
	{
		WebElement pack  = driver.findElement(packageScreen);
		pack.click();
	}
	/** to Check For Package Link */
	public void linkForPackage()
	{
		WebElement link  = driver.findElement(packageLink);
		link.click();
	}
	
	/** To Check For Enter Package Name */
	public void nameForPackage()
	{
		WebElement name  = driver.findElement(packageName);
		name.sendKeys("Combo123");
	}
	
	/** To Check For Lots in Apartment 
	 * @throws InterruptedException */
	public void lot1IsApartment() throws InterruptedException
	{
		waitForElement(apartment);
		WebElement lot1  = driver.findElement(apartment);
		lot1.click();
		WebElement name  = driver.findElement(apartmentName);
		name.click();
		
//		WebElement nm    = driver.findElement(By.xpath("//div[text()=' Pack ']"));
//		nm.click();
	}
	
	/** To Check For Lots In Parking 
	 * @throws InterruptedException */
	public void lot2Parking() throws InterruptedException
	{
		waitForElement(parking);
		WebElement lot2  = driver.findElement(parking);
		lot2.click();
		WebElement name  = driver.findElement(parkingName);
		name.click();
		
//		WebElement nm    = driver.findElement(By.xpath("//div[text()=' Pack ']"));
//		nm.click();
	}
	
	/** To Check For Create Link */
	public void linkForCreate()
	{
		WebElement creat= driver.findElement(create);
		creat.click();
	}
	
	/** To Check For Save */
	public void savebutton()
	{
		waitForElement(Suivant);
		WebElement save = driver.findElement(Suivant);
		save.click();
	}
	

}
