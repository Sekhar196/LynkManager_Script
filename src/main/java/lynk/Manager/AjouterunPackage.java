package lynk.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class  AjouterunPackage extends DefaultProgram {
	
	By AjouterunPackageLink            = By.xpath("//font[text()=' Add a package ']");
	By NomDuPackage                    = By.xpath("//input[@id='name-package']");
	By Appartement                     = By.xpath("//mat-select[@name='Appartment']");
	By CréerLink                       = By.xpath("//button[text()='Créer']");
    
	
	/** To Check For Package Screen */
	public void packageScreen()
	{
		ajouterunPackageLink();
		enterNomDuPackage();
		CréerLink();
	}
	
	/** To Check For Adding Package Link */
	public void ajouterunPackageLink()
	{
		WebElement ajouterunPackage = driver.findElement(AjouterunPackageLink);
		ajouterunPackage.click();
	}
	
	/** To Check For Enter Package name */
	public void enterNomDuPackage()
	{
		WebElement nomDuPackage  = driver.findElement(NomDuPackage);
		nomDuPackage.sendKeys("Beautiful House");
	}
//	public void enterAppartement()
//	{
//		WebElement apartement    = driver.findElement(Appartement);
//		apartement.sendKeys(arg0);
//	}
	
	/** To Check For Create Link */
	public void CréerLink()
	{
		WebElement créerLink     = driver.findElement(CréerLink);
		créerLink.click();
	}
}
