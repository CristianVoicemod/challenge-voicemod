package apps;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppsPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class AppsTests extends BaseTests {
    private HomePage homePage;
    private AppsPage appsPage;

    /**
     * It checks if the Google Play button links to the correct Google PLay link
     */
    @Test
    public void testSelectGooglePlay() {
        appsPage.selectGooglePlay();
        assertTrue(appsPage.getCurrentUrl().equals("https://play.google.com/store/apps/details?id=net.voicemod.android.clips"),
                "The correct URL in Google Play couldn't be reached");
    }

    /**
     * It checks if the App Store button links to the correct App Store link
     */
    @Test
    public void testSelectAppStore() {
        appsPage.selectAppStore();
        assertTrue(appsPage.getCurrentUrl().equals("https://apps.apple.com/app/id1123562958"),
                "The correct URL in App Store couldn't be reached");
    }

    /**
     * It navigates to the home page and set cookies to skip accepting cookies
     * Then it clicks on Our Apps
     */
    @BeforeMethod
    public void testSetUp() {
        driver.get("https://www.voicemod.net/");
        Cookie cookie = new Cookie.Builder("OptanonAlertBoxClosed", "2021-05-15T21:38:43.735Z")
                .domain("voicemod.net")
                .build();
        driver.manage().addCookie(cookie);
        homePage = new HomePage(driver);
        appsPage = homePage.goToOurApps();
    }

    /**
     * It deletes all cookies
     */
    @AfterMethod
    public void testTearDown() {
        driver.manage().deleteAllCookies();
    }
}
