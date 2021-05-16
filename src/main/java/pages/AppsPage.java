package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppsPage extends BasePage {
    private By googlePlayDownload = By.cssSelector("img[alt='Download Google Play']");
    private By appStoreDownload = By.cssSelector("img[alt='Download App Store']");

    /**
     * Constructor of AppsPage
     * @param driver WebDriver object
     */
    public AppsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * It clicks on the Google Play button
     */
    public void selectGooglePlay() {
        clickOnElement(googlePlayDownload);
    }

    /**
     * It clicks on the App Store button
     */
    public void selectAppStore() {
        clickOnElement(appStoreDownload);
    }
}
