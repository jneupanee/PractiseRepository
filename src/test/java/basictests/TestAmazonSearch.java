package basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAmazonSearch {
	
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = WebDriverConfig.getChromeDriver();
		
	}
	
	@Test
	public void searchingIphone() {
		driver.navigate().to("http://www.amazon.com");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone cases");;
		
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	
		
		
		
		
		
		
		
	}
	
	
	
	
	@AfterClass
	public void close() {
		driver.close();
		
	}

}
