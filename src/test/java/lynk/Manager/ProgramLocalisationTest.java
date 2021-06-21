package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProgramLocalisationTest extends ProgramLocalisation{
	
	/** To Check Localisation Screen 
	 * @throws IOException */
	@Test
	public void localisation() throws InterruptedException, IOException
	{
		ProgramInformationGeneralTest detailsLink = new ProgramInformationGeneralTest();
		detailsLink.programmesScreen();
		LocalisationScreen();
	}
	

}
