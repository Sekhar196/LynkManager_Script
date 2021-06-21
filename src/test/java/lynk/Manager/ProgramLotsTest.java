package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProgramLotsTest extends ProgramLots {
	
	
    /** To Check For Apartments 
     * @throws IOException */
	@Test
	public void testingForAppartements() throws InterruptedException, IOException
	{
		ProgramLocalisationTest details = new ProgramLocalisationTest();
		details.localisation();
		apartmentLot();
	}
	
	/** To Check For Edit Apartments 
	 * @throws IOException */
	@Test
	public void editApartments() throws InterruptedException, IOException
	{
		testingForAppartements();
		Thread.sleep(15000);
		editLot();
//		enterRéférence();
		disponibilité();
//    	typeDeBien();
//		prix();
//		surface();
		Étage();
		nombreDePièces();
		duplex();
		salleDeBain();
		prestations();
		orientationDuBien();
		expositionPrincipale();
		apartmentCaractéristiques("Terrasse");
//		Thread.sleep(35000);
		terrase();
		sauveGarderLink();
	}
	
	/** To Check For Delete Apartments 
	 * @throws IOException */
	@Test
	public void deleteApartments() throws InterruptedException, IOException
	{
		testingForAppartements();
		Thread.sleep(15000);
		deleteLot();
	}
	
	/** To Check For Garage 
	 * @throws IOException */
	@Test
	public void testingForGarage() throws InterruptedException, IOException
	{
		ProgramLocalisationTest details = new ProgramLocalisationTest();
		details.localisation();
		linkForAjouterUnLot();
		enterRéférence();
		disponibilité();
		//typeDeBien();
		//loyer();
		prix();
		surface();
		position();
		sauveGarderLink();
	}
	
	/** To Check For Edit Garage 
	 * @throws IOException */
	@Test
	public void editGarage() throws InterruptedException, IOException
	{
		testingForGarage();
		editLot();
		enterRéférence();
		disponibilité();
		sauveGarderLink();
	}
	
	/** To Check For Delete Garage 
	 * @throws IOException */
	@Test
	public void deleteGarage() throws InterruptedException, IOException
	{
		testingForGarage();
		deleteLot();
	}
	
	/** To Check For Parking 
	 * @throws IOException */
	@Test
	public void testingForParking() throws InterruptedException, IOException
	{
//		ProgramLocalisationTest details = new ProgramLocalisationTest();
//		details.localisation();
		linkForAjouterUnLot();
		enterRéférence();
		disponibilité();
		typeDeBien("Parking");
		prix();
		position();
		sauveGarderLink();
	}
	
	/** To Check For Edit Parking 
	 * @throws IOException */
	@Test
	public void editForParking() throws InterruptedException, IOException
	{
		testingForParking();
		editLot();
		enterRéférence();
		disponibilité();
		sauveGarderLink();
	}
	
	/** To Check For Delete Parking 
	 * @throws IOException */
	@Test
	public void deleteParking() throws InterruptedException, IOException
	{
		testingForParking();
		deleteLot();
	}
	
	/** To Check For Cave 
	 * @throws IOException */
	@Test
	public void testingForCave() throws InterruptedException, IOException
	{
		ProgramLocalisationTest details = new ProgramLocalisationTest();
		details.localisation();
		linkForAjouterUnLot();
		enterRéférence();
		disponibilité();
		typeDeBien("Cave");
		prix();	
		surface();
		Étage();
		sauveGarderLink();
	}
	
	/** To Check For Edit Cave 
	 * @throws IOException */
	@Test
	public void editCave() throws InterruptedException, IOException
	{
		testingForCave();
		editLot();
		disponibilité();
		sauveGarderLink();
		
	}
	
	/** To Check For Delete Cave 
	 * @throws IOException */
	@Test
	public void deleteCave() throws InterruptedException, IOException
	{
		testingForCave();
		deleteLot();
	}
	
	/** To Check For Terrain 
	 * @throws IOException */
	@Test
	public void testingForTerrain() throws InterruptedException, IOException
	{
		ProgramLocalisationTest details = new ProgramLocalisationTest();
		details.localisation();
		linkForAjouterUnLot();
		enterRéférence();
		disponibilité();
		typeDeBien("Terrain");
		prix();	
		surface();
		sauveGarderLink();
	}
	
	/** To CHeck For Edit Terrain 
	 * @throws IOException */
	@Test
	public void editTerrain() throws InterruptedException, IOException
	{
		testingForTerrain();
		editLot();
		sauveGarderLink();
		
	}
	
	/** To Check For Delete Terrain 
	 * @throws IOException */
	@Test
	public void deleteTerrain() throws InterruptedException, IOException
	{
		testingForTerrain();
		deleteLot();
	}
	
	/** To Check For Office 
	 * @throws IOException */
	@Test
	public void testingForBureau() throws InterruptedException, IOException
	{
		ProgramLocalisationTest details = new ProgramLocalisationTest();
		details.localisation();
		linkForAjouterUnLot();
		enterRéférence();
		disponibilité();
		typeDeBien("Bureau");
		Thread.sleep(15000);
		loyer();
		surface();
		Thread.sleep(15000);
		parkingsExtérieurs();
		Étage();
    	//Thread.sleep(35000);
		//characteristics2();
		//Thread.sleep(35000);
		//nbreParkingsSous();
		sauveGarderLink();
		
	}
	
	/** To Check For Combo 
	 * @throws IOException */
	@Test
	public void combo1() throws InterruptedException, IOException
	{
		testingForAppartements();
		Thread.sleep(3000);
		parkingLot();
	}

}
