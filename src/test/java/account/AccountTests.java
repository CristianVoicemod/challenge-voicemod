package account;

import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;

import static org.testng.Assert.assertTrue;

public class AccountTests extends BaseTests {
    private AccountPage accountPage;

    /**
     * It checks if the Discord button links to Discord
     */
    @Test
    public void testUseDiscord() {
        accountPage.useDiscord();
        assertTrue(accountPage.getCurrentUrl().contains("discord.com/oauth2"),
                "discord.com/login couldn't be reached");
    }

    /**
     * It checks if the Twitch button links to Twitch
     */
    @Test
    public void testUseTwitch() {
        accountPage.useTwitch();
        assertTrue(accountPage.getCurrentUrl().contains("twitch.tv/login"),
                "twitch.tv/login couldn't be reached");
    }

    /**
     * It navigates to the account page
     */
    @BeforeMethod
    public void testSetUp() {
        driver.get("https://account.voicemod.net/");
        accountPage = new AccountPage(driver);
    }
}
