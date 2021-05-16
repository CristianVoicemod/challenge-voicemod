package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppsPage extends BasePage {
    private By googlePlayDownload = By.cssSelector("img[alt='Download Google Play']");
    private By appStoreDownload = By.cssSelector("img[alt='Download App Store']");

    public AppsPage(WebDriver driver) {
        super(driver);
    }

    public void selectGooglePlay() {
        clickOnElement(googlePlayDownload);
    }

    public void selectAppStore() {
        clickOnElement(appStoreDownload);
    }
}
