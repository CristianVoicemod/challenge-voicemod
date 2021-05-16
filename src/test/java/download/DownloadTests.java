package download;

import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DownloadPage;

import static org.testng.Assert.assertTrue;

public class DownloadTests extends BaseTests {
    private DownloadPage downloadPage;

    /**
     * It checks if the download process has started
     */
    @Test
    public void testDownloadStarts() {
        assertTrue(downloadPage.hasDownloadStarted(),
                "Download didn't start");
    }

    /**
     * It goes to the download page
     */
    @BeforeMethod
    public void testSetUp() {
        driver.get("https://account.voicemod.net/?t=1620998025#/account-activated-success/");
        downloadPage = new DownloadPage(driver);
    }
}
