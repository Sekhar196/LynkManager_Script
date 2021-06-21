package lynk.Manager;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeamScreen extends DefaultProgram{
	
	
	By teamScreenMenuLink                         = By.xpath("//*[@id=\"sidebar-nav\"]/div/nav/div[2]/ul/li[11]");
	By teamScreenLink                             = By.xpath("(//span[@class='menu-name'])[13]");
	By addUtilisar                                = By.xpath("//button[contains(text(),'Ajouter un utilisateur')]");
	By firstName                                  = By.xpath("//input[@id='prenom']");
	By name                                       = By.xpath("//input[@id='nom']");
	By emailID                                    = By.xpath("//input[@id='email']");
	By phoneNumber                                = By.xpath("//input[@id='phone']");
	By selectType                                 = By.xpath("(//select[@class='form-control '])[1]");
	By selectRole                                 = By.xpath("(//select[@class='form-control '])[2]");
    By selectAgence                               = By.xpath("//*[@id=\"create-user\"]/div[2]/form/form/div[1]/div[7]/div/select/*");
    By newExternAgence                            = By.xpath("//input[@placeholder='Nouvelle agence externe']");
    By saveButton                                 = By.xpath("//button[text()='Sauvegarder ']");
    By allotementSave                             = By.xpath("//button[text()=' Sauvegarder ']");
    By selectedProg                               = By.xpath("//span[text()='1A Prog']");
    By progCheckBox                               = By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[9]");//("//input[@id='mat-checkbox-467-input']/..");
    By editUser                                   = By.xpath("//*[@id=\"wrapper\"]/div/div/app-team/div/div[1]/div[2]/div[4]/div/div/div[3]/ul/li[1]/i");
	By deleteUser                                 = By.xpath("//li[@class='action-ic']");
	By yesPopUp                                   = By.xpath("//button[text()='OUI']");
	By outSideLink                                = By.xpath("//h4[text()='vignesh vignesh']");
	By editSave                                   = By.xpath("//button[text()='Sauvegarder']");
	
	
	/** To Check For Team Screen */
	public void teamScreen()
	{
		clickOnAddutilisar();
		enterPreName();
		enterName();
		enterEmailID();
		enterMobileNumber();
		selectType();
//		selectRole();
		clickOnSave();
	}
	
	/** Team Link */
	public void clickOnTeamMenuLink()
	{
		WebElement equip       = driver.findElement(By.className("icon-team"));
	    Actions act = new Actions(driver);
	    act.moveToElement(equip).build().perform();
		
	    waitForElement(teamScreenLink);
		WebElement team                           = driver.findElement(teamScreenLink);
		team.click();
	}
	
	/** Add User Link */
	public void clickOnAddutilisar()
	{
//		waitForElement(addUtilisar);
		
    	WebElement addButton                      = driver.findElement(By.xpath("//button[@class='clear-btn']"));
    	WebDriverWait wait = new WebDriverWait(driver,99);
    	wait.until(ExpectedConditions.elementToBeClickable(addButton));
    	System.out.println("S");
		Actions act = new Actions(driver);
		act.moveToElement(addButton).build().perform();
		System.out.println("S2");
		addButton.click();
		
	}
	
	/** Enter Pre-Name */
	public void enterPreName()
	{
		waitForElement(firstName);
		WebElement FN                             = driver.findElement(firstName);
		int text = new Random().nextInt(1000);
		FN.sendKeys("Roman" + text);
	}
	
	/** Enter Name */
	public void enterName()
	{
		waitForElement(name);
		WebElement LN                             = driver.findElement(name);
		int text = new Random().nextInt(1000);
		LN.sendKeys("Reigns" + text);
	}
	
	/** Enter EmailID */
	public void enterEmailID()
	{
		WebElement email                          = driver.findElement(emailID);
		int text = new Random().nextInt(1000);
		email.sendKeys("romanreigns" + text + "@gmail.com");
	}
	
	/** Enter Mobile Number */
	public void enterMobileNumber()
	{
		WebElement number                         = driver.findElement(phoneNumber);
		int text = new Random().nextInt(1000);
		number.sendKeys("9874561" + text);
	}
	
	/** Select Type */
	public void selectType()
	{
	    Select s =new Select(driver.findElement(selectType));
	    s.selectByVisibleText("Externe");
	}
	
	/** Select Role */
	public void selectRole()
	{
		Select role  = new Select(driver.findElement(selectRole));
		role.selectByVisibleText("Marketing");
	}
	
	/** Select Agency */
	public void selectAgency()
	{
		Select agency   = new Select(driver.findElement(selectAgence));
		agency.selectByVisibleText("master");
	}
	
	/** Select New Agency */
	public void selectNewAgency()
	{
		Select agency   = new Select(driver.findElement(selectAgence));
		agency.selectByVisibleText("Entrez une nouvelle agence");
		WebElement newAgence = driver.findElement(newExternAgence);
		newAgence.sendKeys("MasterMinds");
	}
	
	/** Select Extern Role */
	public void selectExternRole()
	{
		Select role  = new Select(driver.findElement(selectRole));
		role.selectByVisibleText("Agence");
	}
	
	/** Save Button */
	public void clickOnSave()
	{
		WebElement save                          = driver.findElement(saveButton);
		save.click();
	}
	
	/** Allotment Save Button */
	public void clickOnAllotmentSave()
	{
		WebElement save                          = driver.findElement(allotementSave);
		save.click();
	}
	
	/** Select Program */
	public void clickOnSelectProgram()
	{
		WebElement program                       = driver.findElement(selectedProg);
		program.click();
	}
	
	/** Select Program Check Box */
	public void selectCheckBox()
	{
		WebElement checkBox                      = driver.findElement(progCheckBox);
		checkBox.click();
	}
	
	/** Program Edit Button */
	public void clickOnEdit() throws InterruptedException
	{
		waitForElement(editUser);
		WebElement edit       = driver.findElement(editUser);
		edit.click();
//		Actions act = new Actions(driver);
//		WebElement edit1 = driver.findElement(editUser);
//		act.moveToElement(edit1);
//		Thread.sleep(10000);
//		WebElement edit = driver.findElement(By.xpath("(//h4[text()='vignesh vignesh']/../../div[3]/ul/li/i)[1]"));
//		edit.click();
//		List<WebElement> editButton              = driver.findElements(editUser);
//		for (WebElement edit : editButton) {
//			if(edit.getText().equals("vignesh vignesh"))
//			{
//				edit.click();
//			}
//			
//		}
		
	}
	public void clikOnOutSide()
	{
		WebElement outside                       = driver.findElement(outSideLink);
		outside.click();
	}
	
	/** Program Delete Button */
	public void clickOnDelete()
	{
		WebElement deleteButton                  = driver.findElement(deleteUser);
		deleteButton.click();
	}
	
	/** Yes PopUp for Delete */
	public void clickOnYes()
	{
		WebElement yes                           = driver.findElement(yesPopUp);
		yes.click();
	}
	public void clickOnEditSave()
	{
		waitForElement(editSave);
		WebElement save                          = driver.findElement(editSave);
		save.click();
	}
	
	
}
