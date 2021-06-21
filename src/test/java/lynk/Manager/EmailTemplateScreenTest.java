package lynk.Manager;

import org.testng.annotations.Test;

public class EmailTemplateScreenTest extends EmailTemplatesScreen{
	
	
	@Test
	public void emailTemplateTest() throws InterruptedException
	{
		clickOnEmailScreenLink();
		emailTemplateScreen();
	}
	
	@Test
	public void emailTemplateEdit() throws InterruptedException
	{
		emailTemplateTest();
		clickOnEditButton();
		clickOnSave();
	}
	
	@Test
	public void emailTemplateDelete() throws InterruptedException
	{
		emailTemplateTest();
		Thread.sleep(3000);
		clickOnDeleteButton();
	}

}
