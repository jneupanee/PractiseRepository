package basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
	
	private static WebDriver driver;
	
	
	
	
	public static WebDriver getChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bishnu\\Documents\\Jeevan QA Practise Material\\chromedriver.exe");
		
		driver = new ChromeDriver();
		return driver;
	}
	

	public static WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bishnu\\Documents\\Jeevan QA Practise Material\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		return driver;
	}
	
	
	public static void main(String[] args) {
		
		WebDriver driver = WebDriverConfig.getChromeDriver();                                                                                                                                                    
		
		
		
		
	}
	
	
	
	

}
