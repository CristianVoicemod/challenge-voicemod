package getVoicemod;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class GetVoicemodTests extends BaseTests {
    private HomePage homePage;

    /**
     * It checks if the main 'GET VOICEMOD FREE' button links to the account page
     */
    @Test
    public void testGetVoicemodFree() {
        AccountPage accountPage = homePage.getVoicemodFree();
        assertTrue(accountPage.getCurrentUrl().contains("account.voicemod.net"),
                "account.voicemod.net couldn't be reached");
    }

    /**
     * It checks if the button 'GET VOICEMOD FREE' button that appears after scrolling links to the account page
     */
    @Test
    public void testScrollGetVoicemodFree() {
        AccountPage accountPage = homePage.getVoicemodFreeSecondary();
        assertTrue(accountPage.getCurrentUrl().contains("account.voicemod.net"),
                "account.voicemod.net couldn't be reached");
    }

    /**
     * It navigates to the home page and set cookies to skip accepting cookies
     */
    @BeforeMethod
    public void testSetUp() {
        driver.get("https://www.voicemod.net/");
        Cookie cookie = new Cookie.Builder("OptanonAlertBoxClosed", "2021-05-15T21:38:43.735Z")
                .domain("voicemod.net")
                .build();
        driver.manage().addCookie(cookie);
        homePage = new HomePage(driver);
    }

    /**
     * It deletes all cookies
     */
    @AfterMethod
    public void testTearDown() {
        driver.manage().deleteAllCookies();
    }
}
