//Anton Dolganov

package baseTest;

import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestObjects {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;

    @Parameters({"url", "browser"})
    @BeforeMethod
    public void startUp(String url, String browser){
        enums.BrowserType type = browser.equals("chrome") ? enums.BrowserType.CHROME : BrowserType.FIERFOX;
        driver = BrowserFabric.getDriver(type);
        this.url = url;
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
