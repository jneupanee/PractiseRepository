package basictests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMercuryTours {
	
	private WebDriver driver;
	
	
	
	
	@BeforeClass
	public void beforeClass() {
		
		driver = WebDriverConfig.getChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
	}
	
	@Test
	public void signup() {
		
		
	}
		
		
	}
	
	


