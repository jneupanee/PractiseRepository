package basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicCommandsForBrowser {
	
	
	
	private WebDriver driver;

	private WebDriver driver1;
	@Test
	public void basicCommandTest() {
		
		
		//Implicit wait
		driver = WebDriverConfig.getChromeDriver();
		
		driver.navigate().to("http://www.google.com");

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).getText();
		
		
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		

		
	}
	
	
	@AfterTest
	public void close() {
		driver.close();
	}
	

}
