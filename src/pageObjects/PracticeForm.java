package pageObjects;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helpers.Selenium;

public class PracticeForm {
	// Element Identifiers
	private static By txtFirstName = By.name("firstname");
	private static By txtLastName = By.name("lastname");
	private static String radSex = "//*[@name='sex']/..";
	private static String radTeaYears = "//*[@name='exp']/..";
	private static By txtDateStopped = By.id("datepicker");
	private static By chkBlackTea = By.id("tea1");
	private static By chkRedTea = By.id("tea2");
	private static By chkOolongTea = By.id("tea3");
	private static By chkBreak = By.id("tool-0");
	private static By chkHarmlessAddiction = By.id("tool-1");
	private static By chkOneOfThose = By.id("tool-2");
	private static By drpContinents = By.id("continents");
	private static By selBackToWork = By.id("selenium_commands");
	private static By btnOK = By.id("submit");
	
	// helper methods
	
	public static void PopulateFirstName(WebDriver driver, String firstname){
		Selenium.WaitForElement(driver, txtFirstName);
		WebElement targetTextBox = driver.findElement(txtFirstName);
		targetTextBox.sendKeys(firstname);
	}
	
	public static void PopulateLastName(WebDriver driver, String lastname){
		Selenium.WaitForElement(driver, txtLastName);
		WebElement targetTextBox = driver.findElement(txtLastName);
		targetTextBox.sendKeys(lastname);
	}
	
	public static void SelectSex(WebDriver driver, String gender){
		Selenium.WaitForElement(driver, By.xpath(radSex));
		By targetButtonBy = By.xpath(radSex + "/*[@value='" + gender + "']");
		WebElement targetButton = driver.findElement(targetButtonBy);
		targetButton.click();
	}
	
	public static void SelectYearsDrinkingTea(WebDriver driver, String duration){
		Selenium.WaitForElement(driver, By.xpath(radTeaYears));
		By targetButtonBy = By.xpath(radTeaYears + "/*[@value='" + duration + "']");
		WebElement targetButton = driver.findElement(targetButtonBy);
		targetButton.click();
	}
	
	public static void PopulateDateStopped(WebDriver driver, String dateStopped){
		Selenium.WaitForElement(driver, txtDateStopped);
		WebElement targetTextBox = driver.findElement(txtDateStopped);
		targetTextBox.sendKeys(dateStopped);
	}
	
	public static void SelectFavoriteChai(WebDriver driver, String[] favoriteTeas){
		Selenium.WaitForElement(driver, chkBlackTea);
		Selenium.WaitForElement(driver, chkRedTea);
		Selenium.WaitForElement(driver, chkOolongTea);
		
		if(Arrays.asList(favoriteTeas).contains("Black Tea")){
			WebElement blackTea = driver.findElement(chkBlackTea);
			blackTea.click();
		}
		
		if(Arrays.asList(favoriteTeas).contains("Red Tea")){
			WebElement redTea = driver.findElement(chkRedTea);
			redTea.click();
		}
		
		if(Arrays.asList(favoriteTeas).contains("Oolong Tea")){
			WebElement oolongTea = driver.findElement(chkOolongTea);
			oolongTea.click();
		}
	}
	
	public static void SelectExcitement(WebDriver driver, String[] excitementReason){
		Selenium.WaitForElement(driver, chkBreak);
		Selenium.WaitForElement(driver, chkHarmlessAddiction);
		Selenium.WaitForElement(driver, chkOneOfThose);
		
		if(Arrays.asList(excitementReason).contains("Break")){
			WebElement exciteBreak = driver.findElement(chkBreak);
			exciteBreak.click();
		}
		
		if(Arrays.asList(excitementReason).contains("Harmless Addiction")){
			WebElement harmlessAddiction = driver.findElement(chkHarmlessAddiction);
			harmlessAddiction.click();
		}
		
		if(Arrays.asList(excitementReason).contains("One of those things")){
			WebElement oneOfThose = driver.findElement(chkOneOfThose);
			oneOfThose.click();
		}
	}
	
	public static void SelectContinent(WebDriver driver, String targetContinent){
		Selenium.WaitForElement(driver, drpContinents);
		WebElement continentList = driver.findElement(drpContinents);
		Select continentSelect = new Select(continentList);
		continentSelect.selectByVisibleText(targetContinent);
	}
	
	public static void SelectTopic(WebDriver driver, String targetTopic){
		Selenium.WaitForElement(driver, selBackToWork);
		WebElement topicList = driver.findElement(selBackToWork);
		topicList.sendKeys(targetTopic);
	}
	
	public static void ClickOk(WebDriver driver){
		Selenium.WaitForElement(driver, btnOK);
		WebElement okButton = driver.findElement(btnOK);
		okButton.click();
	}
}
