package basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class W3School {
	
	
	
	private WebDriver driver = WebDriverConfig.getChromeDriver();
	
	@Test
	public void clickingLearnHtml() {
		
		driver.get("http://www.w3schools.com");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]")).click();
		

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.navigate().back();
		

		
	}
	
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
