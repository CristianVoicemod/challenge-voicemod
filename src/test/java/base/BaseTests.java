package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected WebDriver driver;

    /**
     * It initializes the FirefoxDriver
     */
    @BeforeMethod
    public void suiteSetUp() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    /**
     * It quits the driver
     */
    @AfterMethod
    public void suiteTearDown() {
        driver.quit();
    }
}
