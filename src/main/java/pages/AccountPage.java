package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    private By discordButton = By.cssSelector("[data-testid='Discord']");
    private By twitchButton = By.cssSelector("[data-testid='Twitch']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void useDiscord() {
        clickOnElement(discordButton);
    }

    public void useTwitch() {
        clickOnElement(twitchButton);
    }
}
