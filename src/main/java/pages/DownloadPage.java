package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage extends BasePage {
    private By downloadSucessElement = By.cssSelector("ul[class='download-success-view__downloading']");

    /**
     * Constructor of DownloadPage
     * @param driver WebDriver object
     */
    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    /**
     * It checks whether the download has started or not
     * @return True or False
     */
    public boolean HasDownloadStarted() {
        waitForElementToBeVisible(downloadSucessElement);
        return isDisplayed(downloadSucessElement);
    }
}
