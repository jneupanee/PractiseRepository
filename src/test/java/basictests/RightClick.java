package basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightClick {

	private WebDriver driver;
	
	
	
	
	@BeforeClass
	public void beforeClass() {
		
		driver = WebDriverConfig.getChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
	}
	
	@Test
	public void rightClickFunctionTest() {
		
		Actions action = new Actions(driver);
		
		
		
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

