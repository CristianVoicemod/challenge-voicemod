package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    private By discordButton = By.cssSelector("[data-testid='Discord']");
    private By twitchButton = By.cssSelector("[data-testid='Twitch']");

    /**
     * Constructor of AccountPage
     * @param driver WebDriver object
     */
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    /**
     * It clicks on the Discord button
     */
    public void useDiscord() {
        clickOnElement(discordButton);
    }

    /**
     * It clicks on the Twitch button
     */
    public void useTwitch() {
        clickOnElement(twitchButton);
    }
}
