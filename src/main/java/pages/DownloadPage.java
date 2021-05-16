package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage extends BasePage {
    private By downloadSucessElement = By.cssSelector("ul[class='download-success-view__downloading']");

    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    public boolean HasDownloadStarted() {
        waitForElementToBeVisible(downloadSucessElement);
        return isDisplayed(downloadSucessElement);
    }
}
