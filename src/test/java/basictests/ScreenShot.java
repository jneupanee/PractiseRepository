package basictests;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot {
	
	
	
	private WebDriver driver;
	@Test
	public void takeScreenShot() {
	driver = WebDriverConfig.getChromeDriver();
	driver.navigate().to("https://www.flipkart.com");
	driver.manage().window().maximize();
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	Files.copy(src, new File("C:\\TEMP\\screenshot.jpg"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	
	
	
	
	}


}
