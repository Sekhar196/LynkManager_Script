package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgramLocalisation extends DefaultProgram {
	
	By LocalisationLink            = By.xpath("(//label[text()='Localisation'])[1]");
	By Adresse                     = By.xpath("(//div[@class='pac-item'])[1]");//("//input[@id='searchmapne']");
	By addressTextField            = By.xpath("//input[@placeholder='Adresse']");
	By Ville                       = By.xpath("//input[@id='city-property']");
	By CodePostal                  = By.xpath("//input[@id='postcode-property']");
	By CoordonnéesGPSLat           = By.xpath("(//input[@id='lat-property'])[1]");
	By CoordonnéesGPSLong          = By.xpath("(//input[@id='lat-property'])[2]");
  	By Sauvegarder                 = By.xpath("//button[text()='Sauvegarder']");
  	By Suivant                     = By.xpath("//button[text()=' Suivant ']");
	
  	
  	/** Localization Screen All Methods */
  	public void LocalisationScreen() throws InterruptedException
  	{
  		Thread.sleep(10000);
  		enterAdresse();
//  		enterVille();
//  		enteringCodePostal();
//  		enteringCoordonnéesGPS();
  	  	clickOnSuivant();
  		//clickOnSauvegarder();
  	}
  	
  	/** Enter Address */
	public void enterAdresse()
	{
		waitForElement(addressTextField);
		WebElement adresselink     =  driver.findElement(addressTextField);
		adresselink.sendKeys("porur");
		
		waitForElement(Adresse);
		WebElement location        = driver.findElement(Adresse);
		location.click();
//		waitForElement(Adresse);
//		List<WebElement> LLS       = driver.findElements(Adresse);
//		for (WebElement selectLocation : LLS) {
//			if(selectLocation.getText().equals("Porur Flyover"))
//			{
//				selectLocation.click();
//			}
//			
//		}
	}
	
	/** Enter City Name */
	public void enterVille()
	{
		WebElement villeLink       = driver.findElement(Ville);
		villeLink.click();
		villeLink.sendKeys("Bangalore");
	}
	
	/** Entering Postal Code */
	public void enteringCodePostal()
	{
		WebElement codePostalLink  = driver.findElement(CodePostal);
		codePostalLink.click();
		codePostalLink.sendKeys("524132");
	}
	
	/** Enter GPS */
	public void enteringCoordonnéesGPS()
	{
		WebElement coordonnéesGPS  = driver.findElement(CoordonnéesGPSLat);
		coordonnéesGPS.click();
		coordonnéesGPS.sendKeys("12.981827");
		WebElement coordonnéeslon  = driver.findElement(CoordonnéesGPSLong);
		coordonnéeslon.click();
		coordonnéeslon.sendKeys("77.715894");
	}
//	public void clickOnSauvegarder()
//	{
//		waitForElement(Sauvegarder);
//		WebElement SuivantButton   = driver.findElement(Sauvegarder);
//		SuivantButton.click();
//	}
	
	/** Click On Next */
	public void clickOnSuivant()
	{
		waitForElement(Suivant);
		WebElement follow = driver.findElement(Suivant);
		follow.click();
	}

}
