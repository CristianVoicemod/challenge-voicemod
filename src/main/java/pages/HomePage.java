package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By getVoicemodFreeLink = By.cssSelector(".download-button a");
    private By getVoicemodFreeLinkSecondary = By.cssSelector("a[class='btn btn-primary btn-lg']");
    private By ourAppsLink = By.id("menu-item-1140");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AccountPage getVoicemodFree() {
        clickOnElement(getVoicemodFreeLink);
        return new AccountPage(driver);
    }

    public AccountPage getVoicemodFreeSecondary() {
        goToEndOfPage();
        waitForElementToBeVisible(getVoicemodFreeLinkSecondary);
        waitForElementToBeClickable(getVoicemodFreeLinkSecondary);
        clickOnElement(getVoicemodFreeLinkSecondary);
        return new AccountPage(driver);
    }

    public AppsPage goToOurApps() {
        clickOnElement(ourAppsLink);
        return new AppsPage(driver);
    }
}
