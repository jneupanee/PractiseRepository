package basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ScrollTest {

	private WebDriver driver;

	@Test
	public void testScroll() {
		driver = WebDriverConfig.getChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/button")));
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement toaster = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[1]/div[2]/div[2]/div/div/div[7]/div[2]/div/div[1]/div/div[2]/div/a/div[1]/div/img"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", toaster);
		
		

	}

}
