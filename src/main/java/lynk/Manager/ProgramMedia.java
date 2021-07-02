package lynk.Manager;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgramMedia extends DefaultProgram {
	
	
	By mediaScreenLink             = By.xpath("(//label[text()='Médias'])[1]");
	By programLink                 = By.xpath("//h5[text()='Medias Du Programme']");
	By ImageThreeSixty             = By.xpath("//a[text()='Images 360']");
	By imagesHDLink                = By.xpath("//a[text()='Images HD']");
	By planTwoDLink                = By.xpath("//a[text()='Plan 2D']");
	By planThreeDLink              = By.xpath("//a[text()='Plan 3D']");
	By videosLink                  = By.xpath("//a[text()='Videos']");
	By marquitLink                 = By.xpath("//a[text()='Maquette orbitale']");
	By mvAddButton                 = By.xpath("//button[text()=' Ajouter ']");
	By visitLink                   = By.xpath("//a[text()=' Visite virtuelle ']");
	By addFileLink                 = By.xpath("//button[text()='Ajouter un fichier ']");
	By addFileLink2                = By.xpath("//button[text()=' Ajouter un fichier ']");
	By mediaUploadLink             = By.xpath("//button[text()='Depuis votre ordinateur ']");
	By urlTextField                = By.xpath("//input[@name='Maquette']");
	By urlTextField1               = By.xpath("//input[@placeholder='Url']");
	By fileName                    = By.xpath("//input[@id='fichier-property']");
	By typologie                   = By.xpath("//label[text()='Typologie']/../div/span");
	By saveButton                  = By.xpath("//button[text()=' Sauvegarder ']");
	By nextButton                  = By.xpath("//button[text()='Suivant ']");
	By plan2DName                  = By.xpath("//a[@id='tab-selectbyid4']");
	By plan3DName                  = By.xpath("//a[@id='tab-selectbyid5']");
	
	
	public void mediaScreen() throws IOException, InterruptedException
	{
		clickOnMediaScreen();
		clickOnProgram();
		clickOnAddFile();
		uploadPdfLink();
		uploadPdfFile();
		clickOnSave();
		Thread.sleep(10000);
		
		uploadThreeSixtyMedia();
		clickOnSave();
		Thread.sleep(10000);
		
		uploadImagesHD();
		clickOnSave();
		Thread.sleep(10000);
		
		uploadPlan2D();
		clickOnSave();
		Thread.sleep(8000);
		
		uploadPlan3D();
		clickOnSave();
		Thread.sleep(8000);
		
		uploadSampleVideo();
		clickOnSave();
		Thread.sleep(9000);
		
		enterUrlForMaquette();
		clickOnSave();
		Thread.sleep(2000);
		
		enterUrlForVisite();
		clickOnSave();
		clickOnNext();
	}
	public void clickOnMediaScreen()
	{
		waitForElement(mediaScreenLink);
		WebElement media           = driver.findElement(mediaScreenLink);
		media.click();
	}
	public void clickOnProgram()
	{
		WebElement program         = driver.findElement(programLink);
		program.click();
	}
	public void clickOnAddFile()
	{
		waitForElement(addFileLink);
		WebElement addFile         = driver.findElement(addFileLink);
		addFile.click();
	}
	
	public void clickOnAddFile2()
	{
		waitForElement(addFileLink2);
		WebElement addFile         = driver.findElement(addFileLink2);
		addFile.click();
	}
	
	public void clickOnAdd()
	{
		waitForElement(mvAddButton);
		WebElement add             = driver.findElement(mvAddButton);
		add.click();
	}
	public void selectImageThreeSixtyUpload()
	{
		WebElement image           = driver.findElement(ImageThreeSixty);
		image.click();
	}
	
	
	public void uploadPdfLink()
	{
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
	}
	public void uploadPdfFile() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\docDescriptive.exe");
		Thread.sleep(3000);
		
		enterFileName();
	}
	
	public void uploadMediaFile() throws IOException, InterruptedException
	{
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Documents\\AutoiT\\imageFile.exe");
		Thread.sleep(3000);
	}
	
	public void uploadThreeSixtyMedia() throws IOException, InterruptedException
	{
		waitForElement(ImageThreeSixty);
		WebElement image           = driver.findElement(ImageThreeSixty);
		image.click();
		
		clickOnAddFile();
		
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\threeSixty.exe");
		Thread.sleep(3000);
		
		enterFileName();
	}
	
	public void uploadImagesHD() throws InterruptedException, IOException
	{
		waitForElement(imagesHDLink);
		WebElement imgHD           = driver.findElement(imagesHDLink);
		imgHD.click();
		
		clickOnAddFile2();
		
		waitForElement(mediaUploadLink);
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\imagesHD.exe");
		Thread.sleep(3000);
		
		enterFileName();
	}
	
	public void uploadPlan2D() throws IOException, InterruptedException
	{
		WebElement plan2D          = driver.findElement(plan2DName);
		plan2D.click();
		
		clickOnAddFile2();
		
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\plan2D.exe");
		Thread.sleep(8000);
		
		enterFileName();
	}
	
	public void uploadPlan3D() throws IOException, InterruptedException
	{
		WebElement plan3D          = driver.findElement(plan3DName);
		plan3D.click();
		
		clickOnAddFile2();
		
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\plan3D.exe");
		Thread.sleep(3000);
		
		enterFileName();
	}
	
	public void uploadSampleVideo() throws InterruptedException, IOException
	{
		waitForElement(videosLink);
		WebElement sample          = driver.findElement(videosLink);
		sample.click();
		
		clickOnAddFile2();
		
		WebElement uploadLink      = driver.findElement(mediaUploadLink);
		uploadLink.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\softsuave\\Auto it\\sampleVideo.exe");
		Thread.sleep(3000);
		
		enterFileName();
	}
	
	public void enterUrlForMaquette()
	{
		waitForElement(marquitLink);
		WebElement maquette       = driver.findElement(marquitLink);
		maquette.click();
		
		clickOnAdd();
		
		waitForElement(urlTextField);
		WebElement link           = driver.findElement(urlTextField);
		link.sendKeys("https://i.imgur.com/3pyYy5p.jpg");
	}
	
	public void enterUrlForVisite()
	{
		waitForElement(visitLink);
		WebElement visit          = driver.findElement(visitLink);
		visit.click();
		
		clickOnAdd();
		
		waitForElement(urlTextField1);
		WebElement link1          = driver.findElement(urlTextField1);
		link1.sendKeys("https://i.imgur.com/3pyYy5p.jpg");

	}
	public void enterFileName()
	{
		WebElement file           = driver.findElement(fileName);
		file.sendKeys("Beautiful House");
	}
//	public void selectTypology()
//	{
//		List<WebElement> typology = driver.findElements(typologie);
//		for (WebElement chooseTypology : typology) {
//			if(chooseTypology.getText().equals("T3"))
//			{
//				chooseTypology.click();
//			}
//			
//		}
//	}
	public void clickOnSave()
	{
		waitForElement(saveButton);
		WebElement next           = driver.findElement(saveButton);
		next.click();
	}
	public void clickOnNext() throws InterruptedException
	{
		WebElement savebutton     = driver.findElement(nextButton);
		Thread.sleep(2000);
		savebutton.click();
	}

}
