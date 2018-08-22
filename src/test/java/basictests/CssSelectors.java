package basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CssSelectors {
	
	
	private WebDriver driver = WebDriverConfig.getChromeDriver();
	
	
	@Test
	public void checkingCss() throws InterruptedException {
		
		driver.navigate().to("http://www.google.com");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.cssSelector("#lst-ib")).sendKeys("CSS types");
	
		WebElement searchbox = driver.findElement(By.cssSelector("#lst-ib"));
		searchbox.sendKeys("CSS Selectors");
		
		 
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	

}
