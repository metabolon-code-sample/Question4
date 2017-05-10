package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	// Starts Chromedriver
	public static WebDriver OpenChromedriver(String filepath){
		System.setProperty("webdriver.chrome.driver", filepath);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	// Closes Chromedriver
	public static void CloseChromedriver(WebDriver driver){
		driver.close();
	}
	
	// Navigates driver to targetUrl
	public static void NavigateToPage(WebDriver driver, String targetUrl){
		driver.get(targetUrl);
	}
	
	// Waits for targetElement to be present
	public static void WaitForElement(WebDriver driver, By targetBy){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(targetBy));
	}
	
	// Confirm current URL contains targetUrl
	public static boolean ConfirmUrl(WebDriver driver, String targetUrl){
		String currentUrl = driver.getCurrentUrl();
		return currentUrl.contains(targetUrl);
	}
}
