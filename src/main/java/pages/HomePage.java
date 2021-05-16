package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By getVoicemodFreeLink = By.cssSelector(".download-button a");
    private By getVoicemodFreeLinkSecondary = By.cssSelector("a[class='btn btn-primary btn-lg']");
    private By ourAppsLink = By.cssSelector("#menu-menu-vm li:nth-child(5) a");

    /**
     * Constructor of HomePage
     * @param driver WebDriver object
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * It clicks on the main button 'GET VOICEMOD FREE'
     * @return An instance of AccountPage which is the next page
     */
    public AccountPage getVoicemodFree() {
        clickOnElement(getVoicemodFreeLink);
        return new AccountPage(driver);
    }

    /**
     * It clicks on the button 'GET VOICEMOD FREE' that appears after scrolling
     * @return An instance of AccountPage which is the next page
     */
    public AccountPage getVoicemodFreeSecondary() {
        goToEndOfPage();
        waitForElementToBeVisible(getVoicemodFreeLinkSecondary);
        waitForElementToBeClickable(getVoicemodFreeLinkSecondary);
        clickOnElement(getVoicemodFreeLinkSecondary);
        return new AccountPage(driver);
    }

    /**
     * It clicks on the tab Our Apps
     * @return An instance of AppsPage which is the next page
     */
    public AppsPage goToOurApps() {
        clickOnElement(ourAppsLink);
        return new AppsPage(driver);
    }
}
