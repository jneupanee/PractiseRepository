package basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRadioButtonClick {

	private WebDriver driver;
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = WebDriverConfig.getChromeDriver();
		
		driver.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		
		
	}
	
	@Test
	public void radioButton() {
		
		driver.findElement(By.id("male")).click();
		
		
		
	}
	
	
}
