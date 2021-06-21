package lynk.Manager;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgramLots extends DefaultProgram {
	
	By linkForLot                = By.xpath("(//label[text()='Lots'])[1]");
	By AjouterUnLot              = By.xpath("//div[@class='lot-actions']/button[1]");
	By Référence                 = By.xpath("(//input[@id='reference-property'])[2]");
	By batimentTextField         = By.xpath("(//div[@class='mat-select-value'])[3]");
	By createBatimentText        = By.xpath("//button[text()='Ajouter un bâtiment']");
	By batimentName              = By.xpath("//input[@formcontrolname='building']");
	By batimentTickMark          = By.xpath("(//input[@formcontrolname='building']/../span/i)[1]");
	
	By Loyer                     = By.xpath("(//input[@id='loyer-property'])[2]");
	By Disponibilité             = By.xpath("(//label[text()='Disponibilité'])[2]/../div/span");
	By TypeDeBien                = By.xpath("(//label[text()='Type de bien'])[2]/../div/span");
	By Prix                      = By.xpath("(//input[@id='price-property'])[2]");
	By Surface                   = By.xpath("(//input[@id='surface-property'])[3]");
	By dationToggle              = By.xpath("(//span[@class='slider round'])[2]");
	By Étage                     = By.xpath("(//label[text()='Étage(s)'])[2]/../div/*");
	By NombreDePièces            = By.xpath("(//label[text()='Nombre de pièces '])[2]/../div/span");
	By Duplex                    = By.xpath("(//label[text()='Duplex? '])[2]/../div/span");
	By SalleDeBain               = By.xpath("(//label[text()='Salle(s) de bain'])[2]/../div/span");
	By Prestations               = By.xpath("(//label[text()='Prestations'])[2]/../div/span");
	By OrientationDuBien         = By.xpath("(//label[text()='Orientation du bien'])[2]/../div/span");
	By ExpositionPrincipale      = By.xpath("(//label[text()='Exposition principale'])[2]/../div/span");
	By Caractéristiques          = By.xpath("(//label[text()='Caractéristiques'])[2]/../div/div/span");
	By Balcon                    = By.xpath("(//input[@id='balcon'])[2]");
	By BalconText                = By.xpath("(//input[@id='balcon'])[2]");
	By Jardin                    = By.xpath("(//span[text()='Jardin'])[2]");
	By JardinText                = By.xpath("//input[@id='jardin']");
	By Garage                    = By.xpath("(//span[text()='Garage'])[4]");
	By GarageText                = By.xpath("//input[@id='garage']");
	By Terrasse                  = By.xpath("(//input[@id='-chk1'])[2]");//("(//span[text()='Terrasse'])[2]");
	By TerrasseText              = By.xpath("(//input[@id='terras'])[2]");
	By Position                  = By.xpath("(//label[text()='Position'])[2]/../div/*");
	By outdoorParking            = By.xpath("(//label[text()='Caractéristiques'])[2]/../div/span/*");//("(//input[@id='buisness-chk7'])[2]");
	By outdoorParkingText        = By.xpath("//input[@id='parkingExteriors']");
	By underParking              = By.xpath("(//span[text()='Nbre Parkings sous-sol'])[2]");
	By uderParkingText           = By.xpath("//input[@id='parkingSous']");
	By Sauvegarder               = By.xpath("(//button[text()='Sauvegarder'])[3]");
	By edit                      = By.xpath("(//i[@class='icon icon-edit'])[6]");
	By delete                    = By.xpath("(//i[@class='icon icon-delete'])[6]");
	By yes                       = By.xpath("//button[text()='OUI']");
	By save                      = By.xpath("//button[text()='Suivant']");

	
	
    /** Click On Lot Screen Link */
	public void linkForLotScreen()
	{
		waitForElement(linkForLot);
		WebElement lot               = driver.findElement(linkForLot);
		lot.click();
	}
	
	/** Click On Add Lot */
	public void linkForAjouterUnLot()
	{
		waitForElement(AjouterUnLot);
		WebElement AjouterUnLotLink  = driver.findElement(AjouterUnLot);
		AjouterUnLotLink.click();
	}
	
	
	public void apartmentLot()
	{
		linkForAjouterUnLot();
		enterRéférence();
		clickOnBatiment();
		createBatiment();
		disponibilité();
		typeDeBien("Appartement");
		prix();
		surface();
		turnOnDation();
		Étage();
		nombreDePièces();
		duplex();
		salleDeBain();
		prestations();
		orientationDuBien();
		expositionPrincipale();
		apartmentCaractéristiques("Garage");
		//coWorking("Digicode");
		garage();
		sauveGarderLink();
	}
	
	public void parkingLot()
	{
		linkForAjouterUnLot();
		enterRéférence();
		disponibilité();
		typeDeBien("Parking");
		prix();
		position();
		sauveGarderLink();
	}
	/** Enter Reference Name */
	public void enterRéférence()
	{
		waitForElement(Référence);
		WebElement référencetextbox = driver.findElement(Référence);
		int text = new Random().nextInt(100);
		référencetextbox.sendKeys("Lot1" + text);
	}
	
	public void clickOnBatiment()
	{
		WebElement batiment         = driver.findElement(batimentTextField);
		batiment.click();
	}
	
	public void createBatiment()
	{
		WebElement create           = driver.findElement(createBatimentText);
		create.click();
		
		WebElement enter            = driver.findElement(batimentName);
		enter.sendKeys("A2");
		
		waitForElement(batimentTickMark);
		WebElement tick             = driver.findElement(batimentTickMark);
		tick.click();
	}
	
	/** Enter Rent */
	public void loyer()
	{
		WebElement Rent             = driver.findElement(Loyer);
		Rent.sendKeys("RentHouse123");
	}
	
	/** Select Status */
    public void disponibilité()
   	{
    	waitForElement(Disponibilité);
    	List<WebElement> statuss = driver.findElements(Disponibilité);
    	for (WebElement s : statuss) {
  			if(s.getText().equals("Disponible"))
    		  {
    			s.click();
    			break;
    		  }
    			
    		}
    		
    }
    
    /** Select Kind Of Good */
    public void typeDeBien(String TypeDeBi)
    {
    	waitForElement(TypeDeBien);
    	List<WebElement> statuss = driver.findElements(TypeDeBien);
		for (WebElement s : statuss) {
			if(s.getText().equals(TypeDeBi))
			{
				s.click();
				break;
			}
			
	    }
    }
    
    /** Enter Price */
    public void prix()
    {
    	WebElement price        = driver.findElement(Prix);
    	price.sendKeys("500");
    }
    
    /** Enter Surface */
    public void surface()
    {
    	WebElement surface      = driver.findElement(Surface);
    	surface.sendKeys("1000");
    }
    
    
    public void turnOnDation()
    {
    	WebElement toggle       = driver.findElement(dationToggle);
    	toggle.click();
    }
    /** Select Floor */
    public void Étage()
    {
    	waitForElement(Étage);
    	List<WebElement> floor  = driver.findElements(Étage);
    	for (WebElement f : floor) {
    		if(f.getText().equals("5"))
    		{
    			f.click();
    			break;
    		}
			
		}
    }
    
    /** Select Number Of Pieces */
    public void nombreDePièces()
    {
    	List<WebElement> statuss = driver.findElements(NombreDePièces);
		for (WebElement s : statuss) {
			if(s.getText().equals("5"))
			{
				s.click();
			}
			
	    }
    }
    
    /** Select Duplex */
    public void duplex()
    {
    	List<WebElement> statuss = driver.findElements(Duplex);
		for (WebElement s : statuss) {
			if(s.getText().equals("Non"))
			{
				s.click();
			}
			
	    }
    }
    
    /** Select Bathroom */
    public void salleDeBain()
    {
    	List<WebElement> statuss = driver.findElements(SalleDeBain);
    	for (WebElement s : statuss) {
    		if(s.getText().equals("3"))
    		{
    			s.click();
    		}
			
		}
    }
    
    /** Select Benefits */
    public void prestations()
    {
    	List<WebElement> statuss = driver.findElements(Prestations);
    	for (WebElement s : statuss) {
    		if(s.getText().equals("Simples"))
    		{
    			s.click();
    		}
    				
			
		}
    }
    
    /** Select Orientation Of Good */
    public void orientationDuBien()
    {
    	List<WebElement> status = driver.findElements(OrientationDuBien);
    	for (WebElement s : status) {
			if(s.getText().equals("Double orientation"))
			{
				s.click();
			}
					
		}
    }
    
    /** Select Main Exhibition */
    public void expositionPrincipale()
    {
    	List<WebElement> status = driver.findElements(ExpositionPrincipale);
    	for (WebElement s : status) {
			if(s.getText().equals("Sud"))
			{
				s.click();
			}
		}
    }
    
    /** Select Apartment Characteristics */
    public void apartmentCaractéristiques(String Characteristics)
    {
    	List<WebElement> status = driver.findElements(Caractéristiques);
    	for (WebElement s : status) {
    		if(s.getText().equals(Characteristics))
    		{
    			s.click();
    		}
			
		}
    	//Characteristics1();
    }
    
    /** Select Co-Working Characteristics */
    public void coWorking(String Characteristics)
    {
    	List<WebElement> work   = driver.findElements(Caractéristiques);
    	for (WebElement c : work) {
    		{
    			if(c.getText().equals(Characteristics))
    			{
    				c.click();
    			}
    		}
			
		}
    	//characteristics2();
    }
    
    /** Enter Garage Value */
    public void garage()
    {
    
//    	WebElement balcony      = driver.findElement(Balcon);
//    	balcony.click();
//    	waitForElement(BalconText);
//    	WebElement balconyText  = driver.findElement(BalconText);
//    	balconyText.sendKeys("500");
//    	WebElement terrace      = driver.findElement(Terrasse);
//    	terrace.click();
//    	waitForElement(Terrasse);
//    	WebElement terraceText  = driver.findElement(TerrasseText);
//    	terraceText.sendKeys("500");
//    	WebElement garden       = driver.findElement(Jardin);
//    	garden.click();
//    	WebElement gardenText   = driver.findElement(JardinText);
//    	gardenText.sendKeys("500");
//    	WebElement garage       = driver.findElement(Garage);
//    	garage.click();
    	waitForElement(GarageText);
    	WebElement garageText   = driver.findElement(GarageText);
    	garageText.sendKeys("500");
//    	WebElement parkingSlots = driver.findElement(Parking);
//    	parkingSlots.click();
//   	WebElement parkingNum   = driver.findElement(outdoorParkingText);
//    	parkingNum.sendKeys("20");
    }
    
    /** Enter Terrace Value */
    public void terrase()
    {
    	waitForElement(TerrasseText);
    	WebElement terrace      = driver.findElement(TerrasseText);
    	terrace.sendKeys("300");
    }
    
    /** Select Outdoor Car Parks */
   public void parkingsExtérieurs()    
   {
    	waitForElement(outdoorParking);
    	List<WebElement> outdoor   = driver.findElements(outdoorParking);
    	for (WebElement ext : outdoor) {
    		if((ext.getText().equals("Parking")))
    		{
    			ext.click();
    		}
		}
    	waitForElement(outdoorParkingText);
    	WebElement outdoorText  = driver.findElement(outdoorParkingText);
    	outdoorText.sendKeys("20");
    }
   
   /** Enter Parking Under Value */ 
    public void parkingSous()
    {
    	waitForElement(underParking);
    	WebElement underground  = driver.findElement(underParking);
    	underground.click();
    	waitForElement(uderParkingText);
    	WebElement underText    = driver.findElement(uderParkingText);
    	underText.sendKeys("25");
    }
   /* public void characteristics2()
    {
    	waitForElement(outdoorParking);
    	WebElement outdoor      = driver.findElement(outdoorParking);
    	outdoor.click();
    	waitForElement(underParking);
    	WebElement underground  = driver.findElement(underParking);
    	underground.click();
    	waitForElement(underParking);
    	WebElement outdoorText  = driver.findElement(outdoorParkingText);
    	outdoorText.sendKeys("20");
    	waitForElement(uderParkingText);
    	WebElement underText    = driver.findElement(uderParkingText);
    	underText.sendKeys("25");
    }*/
    
    /** Select Position */
    public void position()
    {
    	List<WebElement> pose   = driver.findElements(Position);
    	for (WebElement p : pose) {
    		if(p.getText().equals("Extérieur"))
    		{
    			p.click();
    		}
			
		}
    }
    
    /** Click On Save */
    public void sauveGarderLink()
    {
    	waitForElement(Sauvegarder);
    	WebElement save         = driver.findElement(Sauvegarder);
    	save.click();
    }
    
    /** Click On Edit Lot */
    public void editLot()
    {
    	waitForElement(edit);
    	WebElement editing      = driver.findElement(edit);
    	editing.click();
    }
    
    /** Click On Delete Lot */
    public void deleteLot()
    {
    	waitForElement(delete);
    	WebElement delLot       = driver.findElement(delete);
    	delLot.click();
    	waitForElement(yes);
    	WebElement delyes       = driver.findElement(yes);
    	delyes.click();
    }
    
    /** Click On Next */
    public void Suivant()
    {
    	WebElement saveButton   = driver.findElement(save);
    	saveButton.click();
    }
    
    /** Create Package */
    public void combo() throws InterruptedException
	{
//		AdminLogin login = new AdminLogin();
//		login.loginToLynkmanager();
//		InformationsGénérales detailsLink = new InformationsGénérales();
//		Thread.sleep(35000);
//		detailsLink.programmesPage();
//		Thread.sleep(35000);
//		Localisation local = new Localisation();
//		local.LocalisationScreen();
		linkForAjouterUnLot();
		//Thread.sleep(35000);
		enterRéférence();
		disponibilité();
		typeDeBien("Appartement");
		prix();
		surface();
//		Étage();
//		nombreDePièces();
//		duplex();
//		salleDeBain();
//		prestations();
//		orientationDuBien();
//		expositionPrincipale();
//		apartmentCaractéristiques("Garage");
		//coWorking("Digicode");
//		Thread.sleep(35000);
//		garage();
		sauveGarderLink();
		Thread.sleep(15000);
		linkForAjouterUnLot();
		//Thread.sleep(35000);
		enterRéférence();
		disponibilité();
		typeDeBien("Maison");
		prix();
		surface();
		sauveGarderLink();
//		Étage();
//		nombreDePièces();
//		duplex();
//		salleDeBain();
//		prestations();
//		orientationDuBien();
//		expositionPrincipale();
//		apartmentCaractéristiques("Garage");
		//coWorking("Digicode");
//		Thread.sleep(35000);
//		garage();

//		Thread.sleep(10000);
		Suivant();
		
	}

}
  

