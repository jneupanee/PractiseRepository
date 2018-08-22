package basictests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MouseOver {
	
	
	public static void beforeMethod(WebDriver driver) throws InterruptedException {
		

		
		driver.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		String title = "Sample Webpage with dummy elements for learning automation";
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(title));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	

	@Test
	public void linkTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/p[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.close();
	}
	
	@Test
	public void textBoxTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Jeevan Neupane");

		driver.close();
	}
	
	
	@Test
	public void submitButtonTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
		
		driver.findElement(By.xpath("//*[@id=\"idOfButton\"]")).click();
		driver.close();
		 
	}
	
	@Test
	public void doubleClickTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
		
		WebElement dblClickbtn = driver.findElement(By.xpath("//*[@id=\"dblClkBtn\"]"));
		Actions action = new Actions(driver);
		action.doubleClick(dblClickbtn).perform();
		driver.switchTo().alert().accept();
		driver.close();
		 
	}
	
	@Test
	public void radioButtonTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
	
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
	
		driver.close();
		 
	}
	
	@Test
	public void checkBoxTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
	
		
		
		WebElement autobutton = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form[2]/input[1]")); 
		
		WebElement performButton = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form[2]/input[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(autobutton).click().perform();
		action.moveToElement(performButton).click().perform();
		driver.close();
		 
	}
	
	@Test
	public void DropDownTest() throws InterruptedException {
	
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
	
		
		
		WebElement view = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form[2]/input[1]"));
		
		
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view);
		
		WebElement drpdwn = driver.findElement(By.id("testingDropdown")); 
		
		Select select = new Select(drpdwn);
		
		select.selectByIndex(2);
		driver.close();
		
		
		
	}
	
	@Test
	public void alertboxTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
	
		
		WebElement generateAlertBox= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/button"));
		WebElement view = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form[2]/input[1]"));
		
		
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view);
		generateAlertBox.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@Test
	public void confirmboxTest() throws InterruptedException {
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
	
		
		WebElement confirmBox = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[3]/button"));
		WebElement generateAlertBox= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", generateAlertBox );
		confirmBox.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
	
		WebDriver driver = WebDriverConfig.getChromeDriver();
		MouseOver.beforeMethod(driver);
	
		
		WebElement dragElement = driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dragElement);
	
		WebElement dropElement = driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
		
		Actions act = new Actions(driver);
		
	
		
		
		
		act.dragAndDrop(dragElement, dropElement).perform();
		
		driver.close();
		
	}
	
	
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
	}


		
	}
	
	
		

