package basictests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test1 {

	private WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		
		
		driver = WebDriverConfig.getChromeDriver();
		
	
	}
		
	@Test
	public void openBrowser() {
		driver.get("http://www.google.com");
		
	}
	
	
	@Test()
	public void basicCommands() throws InterruptedException {
		
	driver.navigate().to("http://amazon.com");
		
	Thread.sleep(6000);
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
		driver.close();
		
		
	}
	

}
