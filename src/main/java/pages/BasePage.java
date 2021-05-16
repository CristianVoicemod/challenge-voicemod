package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final int TIMEOUT = 5;

    protected WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor of BasePage
     * @param driver WebDriver object
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    /**
     * It finds an element
     * @param locator
     * @return The WebElement object found
     */
    private WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    /**
     * It clicks on an element
     * @param locator
     */
    protected void clickOnElement(By locator) {
        findElement(locator).click();
    }

    /**
     * It waits for an element to be clickable
     * @param locator
     */
    protected void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * It waits for an element to be visible
     * @param locator
     */
    protected void waitForElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * It checks whether an element is displayed or not
     * @param locator
     * @return True or False
     */
    protected boolean isDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    /**
     * It returns the current URL of the driver
     * @return The String of the current URL
     */
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * It clicks the END key to go to the end of the page
     */
    public void goToEndOfPage() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
    }
}
