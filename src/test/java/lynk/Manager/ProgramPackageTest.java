package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProgramPackageTest extends ProgramPackage {
	
	
	/** To Check For Package Screen 
	 * @throws IOException */
	@Test
	public void packageScreentest() throws InterruptedException, IOException
	{
//		ProgramLocalisationTest details = new ProgramLocalisationTest();
//		details.localisation();
//		ProgramLotsTest lot = new ProgramLotsTest();
//		lot.combo1();
		
		ProgramInformationsGénérales pi = new ProgramInformationsGénérales();
		pi.clickOnProgramPack();
		packagePage();	
		
	}
	

}
