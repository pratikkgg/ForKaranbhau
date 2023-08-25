package project.karan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LanguageSelectionTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Navigate to the page
		driver.get("URL_OF_THE_PAGE");

		// Initialize the Page Object
		LanguagePage languagePage = PageFactory.initElements(driver, LanguagePage.class);

		// Check if the select language page is displayed
		if (languagePage.isSelectLanguagePageDisplayed()) {
			if (languagePage.isLanguageAvailable("Desired Language")) {
				languagePage.selectLanguage("HINDI");
			}
		}
		driver.quit();
	}
}