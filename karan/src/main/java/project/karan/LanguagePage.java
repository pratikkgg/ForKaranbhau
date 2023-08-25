package project.karan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class LanguagePage {
	WebDriver driver;

	public LanguagePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@class='language-list']//span[text()='Hindi']")
	private WebElement hindiLanguage;
	@FindBy(xpath = "//div[@class='language-list']//span[text()='English']")
	private WebElement englishLanguage;
	@FindBy(xpath = "//div[@class='language-list']//span[text()='Japanese']")
	private WebElement japaneseLanguage;

	public boolean isSelectLanguagePageDisplayed() {
		return driver.findElements(By.className("language-list")).size() > 0;
	}

	public boolean isLanguageAvailable(String language) {
		switch (language.toLowerCase()) {
		case "hindi":
			return hindiLanguage.isDisplayed();
		case "english":
			return englishLanguage.isDisplayed();
		case "japanese":
			return japaneseLanguage.isDisplayed();
		default:
			return false;
		}
	}

	public void selectLanguage(String language) {
		switch (language.toLowerCase()) {
		case "hindi":
			hindiLanguage.click();
			break;
		case "english":
			englishLanguage.click();
			break;
		case "japanese":
			japaneseLanguage.click();
			break;
		default:
			System.out.println("Desired language not found");
		}
	}
}