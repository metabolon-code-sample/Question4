import org.openqa.selenium.WebDriver;

import pageObjects.PracticeForm;
import helpers.Selenium;

public class Question4 {
	static String targetUrl = "http://www.practiceselenium.com/practice-form.html";
	static String firstName = "Roscoe";
	static String lastName = "Wallace";
	static String gender = "Female";
	static String yearsDrinking = "6";
	static String dateStopped = "June 2, 1938";
	static String[] favorites = {"Black Tea", "Oolong Tea"};
	static String[] reasons = {"One of those things"};
	static String continent = "North America";
	static String topic = "Wait Commands";
	static String finalUrl = "http://www.practiceselenium.com/welcome.html";
	
	public static void main(String[] args){
		// Open Chrome, and navigate to target page
		WebDriver driver = Selenium.OpenChromedriver(args[0]);
		Selenium.NavigateToPage(driver, targetUrl);
		
		// Populate form on page
		PracticeForm.PopulateFirstName(driver, firstName);
		PracticeForm.PopulateLastName(driver, lastName);
		PracticeForm.SelectSex(driver, gender);
		PracticeForm.SelectYearsDrinkingTea(driver, yearsDrinking);
		PracticeForm.PopulateDateStopped(driver, dateStopped);
		PracticeForm.SelectFavoriteChai(driver, favorites);
		PracticeForm.SelectExcitement(driver, reasons);
		PracticeForm.SelectContinent(driver, continent);
		PracticeForm.SelectTopic(driver, topic);
		
		// Click OK and confirm page navigation.
		PracticeForm.ClickOk(driver);
		if(Selenium.ConfirmUrl(driver, finalUrl)){
			System.out.println("Successfully loaded welcome page.");
		} else {
			System.out.println("Failed to navigate to welcome page.");
		}
		
		// Close chrome.
		Selenium.CloseChromedriver(driver);
	}
}
