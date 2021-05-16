package account;

import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;

import static org.testng.Assert.assertTrue;

public class AccountTests extends BaseTests {
    private AccountPage accountPage;

    @Test
    public void testUseDiscord() {
        accountPage.useDiscord();
        assertTrue(accountPage.getCurrentUrl().contains("discord.com/oauth2"),
                "discord.com/login couldn't be reached");
    }

    @Test
    public void testUseTwitch() {
        accountPage.useTwitch();
        assertTrue(accountPage.getCurrentUrl().contains("twitch.tv/login"),
                "twitch.tv/login couldn't be reached");
    }

    @BeforeMethod
    public void testSetUp() {
        driver.get("https://account.voicemod.net/");
        accountPage = new AccountPage(driver);
    }
}
