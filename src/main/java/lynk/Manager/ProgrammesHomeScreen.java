package lynk.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgrammesHomeScreen extends DefaultProgram {
	
	By filter                  = By.xpath("//button[@class='filter-btn']");
    By status                  = By.xpath("//label[text()='Statut :']/../div/*");
    By zone                    = By.xpath("//label[text()='Zone :']/../div/*");
    By security                = By.xpath("//label[text()='Sécurité :']/../div/*");
    By heater                  = By.xpath("//label[text()='Chauffage :']/../div/*");
    By city                    = By.xpath("(//input[@name='City'])[1]");
    By postal                  = By.xpath("(//input[@name='City'])[2]");
    By availability            = By.xpath("//label[text()='Disponibilité :']/../div/*");
    By kindOfGood              = By.xpath("//label[text()='Type de bien :']/../div/*");
    By characteristics         = By.xpath("//label[text()='Caractéristiques :']/../div/*");
    By businessChar            = By.xpath("//label[text()='Business Caractéristiques :']/../div/*");
    By pieces                  = By.xpath("//label[text()='Nombre de pièces :']/../div/*");
    By floores                 = By.xpath("//label[text()='Étage(s) :']/../div/*");
    By duplex                  = By.xpath("//label[text()='Duplex? :']/../div/*");
    By bathrooms               = By.xpath("//label[text()='Salle(s) de bain? :']/../div/*");
    By benefits                = By.xpath("//label[text()='Prestations :']/../div/*");
    By exhibition              = By.xpath("//label[text()='Exposition principale :']/../div/*");
    By orientation             = By.xpath("//label[text()='Orientation du bien :']/../div/*");
    By crossing                = By.xpath("//label[text()='Traversant :']/../div/*");
    By garageposition          = By.xpath("//label[text()='Garage Position :']/../div/*");
    By priceMin                = By.xpath("//label[text()='Prix minimum']/../input");
    By priceMax                = By.xpath("//label[text()='Prix maximum']/../input");
    By surfaceMin              = By.xpath("//label[text()='Surface minimum']/../input");
    By surfaceMax              = By.xpath("//label[text()='Surface maximum']/../input");
    By searchButton            = By.xpath("//button[text()='Rechercher']");
    By reinitialiser           = By.xpath("//button[@class='clear-btn']");
    By view                    = By.xpath("//a[text()=' 1A Prop ']");//("(//td[@name='actions']/div/a/i)[1]");//("//tbody/tr");
    By edit                    = By.xpath("//i[@class='icon icon-edit']");
    By delete                  = By.xpath("//i[@class='icon icon-delete']");
    By statusDropdown          = By.xpath("(//div[@class='mat-select-value'])[1]");//("//div[@id='cdk-overlay-33']//div/div/*");
    By statusText              = By.xpath("//span[text()='Optionné']");
   
    
    
    /** Click on Filter Button */
    public void filterButton()
    {
    	waitForElement(filter);
    	WebElement button      = driver.findElement(filter);
    	button.click();
    }
    
    /** To Check For Select Status */
    public void status()
    {
    	List<WebElement> selectStatus   = driver.findElements(status);
    	for (WebElement select : selectStatus) {
    		if(select.getText().equals("Avant-premìere"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Zone */
    public void zone()
    {
    	List<WebElement> selectZone     = driver.findElements(zone);
    	for (WebElement select : selectZone) {
    		if(select.getText().equals("Zone A"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Security */
    public void securite()
    {
    	List<WebElement> selectSecurity = driver.findElements(security);
    	for (WebElement select : selectSecurity) {
    		if(select.getText().equals("Gardien"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Heater Type */ 
    public void chauffage()
    {
    	List<WebElement> selectHeater   = driver.findElements(heater);
    	for (WebElement select : selectHeater) {
    		if(select.getText().equals("Electrique"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Availability */
    public void disponibilite()
    {
    	List<WebElement> selectAvail   = driver.findElements(availability);
    	for (WebElement select : selectAvail) {
    		if(select.getText().equals("Disponible"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Kind Of Good */
    public void kindOfGood()
    {
    	List<WebElement> selectGood   = driver.findElements(kindOfGood);
    	for (WebElement select : selectGood) {
    		if(select.getText().equals("Appartement"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Characteristics */
    public void characteristics()
    {
    	List<WebElement> selectChar   = driver.findElements(characteristics);
    	for (WebElement select : selectChar) {
    		if(select.getText().equals("Balcon"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Business Characteristics */
    public void businessCharacteristics()
    {
    	List<WebElement> selectBuss  = driver.findElements(businessChar);
    	for (WebElement select : selectBuss) {
    		if(select.getText().equals("Parking"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Number Of Pieces */
    public void numberOfPieces()
    {
    	List<WebElement> selectNum  = driver.findElements(pieces);
    	for (WebElement select : selectNum) {
    		if(select.getText().equals("3"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Floores */
    public void floores()
    {
    	List<WebElement> selectFloor = driver.findElements(floores);
    	for (WebElement select : selectFloor) {
    		if(select.getText().equals("2"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Duplex */
    public void duplex()
    {
    	List<WebElement> selectDuplex = driver.findElements(duplex);
    	for (WebElement select : selectDuplex) {
    		if(select.getText().equals("Yes"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Number Of Bathrooms */
    public void bathroom()
    {
    	List<WebElement> selectNum   = driver.findElements(bathrooms);
    	for (WebElement select : selectNum) {
    		if(select.getText().equals("2"))
    		{
    			select.click();
    		}
			
		}
    }
    /** To Check For Select Benefits */
    public void benefits()
    {
    	List<WebElement> selectBen  = driver.findElements(benefits);
    	for (WebElement select : selectBen) {
    		if(select.getText().equals("Simples"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Main Exhibition */
    public void expositionPrincipale()
    {
    	List<WebElement> selectPrinc = driver.findElements(exhibition);
    	for (WebElement select : selectPrinc) {
    		if(select.getText().equals("Nord"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Orientation Of Good */
    public void orientationDuBien()
    {
    	List<WebElement> selectProp = driver.findElements(orientation);
    	for (WebElement select : selectProp) {
    		if(select.getText().equals("Mono orienté"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Select Crossing */
    public void traversant()
    {
    	List<WebElement> selectCros = driver.findElements(crossing);
    	for (WebElement select : selectCros) {
    		if(select.getText().equals("Non"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Position Of Garage */
    public void garagePosition()
    {
    	List<WebElement> selectPos = driver.findElements(garageposition);
    	for (WebElement select : selectPos) {
    		if(select.getText().equals("Extérieur"))
    		{
    			select.click();
    		}
			
		}
    }
    
    /** To Check For Enter Minimum Price */
    public void minPrix()
    {
    	WebElement min     = driver.findElement(priceMin);
    	min.sendKeys("5000");
    }
    
    /** To Check For Enter Maximum Price */
    public void maxPrix()
    {
    	WebElement max     = driver.findElement(priceMax);
    	max.sendKeys("10000");
    }
    
    /** To Check For Enter Minimum Surface */
    public void minSurface()
    {
    	WebElement min     = driver.findElement(surfaceMin);
    	min.sendKeys("4000");
    }
    
    /** To Check For Enter Maximum Surface */
     public void maxSurface()
    {
    	WebElement max     = driver.findElement(surfaceMax);
    	max.sendKeys("10000");
    }
     
     /** To Check For Search */
    public void search()
    {
    	WebElement button  = driver.findElement(searchButton);
    	button.click();
    }
    
    /** To Check For Reset */
    public void reset()
    {
    	WebElement resetBtn = driver.findElement(reinitialiser);
    	resetBtn.click();
    }
    
    /** To Check For Program View */
    public void programeView()
    {
//    	waitForElement(view);
//    	List<WebElement> proViewer = driver.findElements(view);
//    	for (WebElement pv : proViewer) {
//    		if(pv.getText().equals("Environment"))
//    		{
//    			pv.click();
//    		}
//			
//		}
    	waitForElement(view);
    	WebElement progView = driver.findElement(view);
    	progView.click();
    }
    
    /** To Check For Select Status */
    public void selectStatus()
    {
  
    	WebElement select  = driver.findElement(statusDropdown);
      	waitForElement(statusDropdown);
    	select.click();
//    	Select drpStatus = new Select(driver.findElement(By.xpath("statusDropdown")));
//    	drpStatus.selectByVisibleText("Optionné");
    	WebElement selTest = driver.findElement(statusText);
    	selTest.click();
    }
    
}
