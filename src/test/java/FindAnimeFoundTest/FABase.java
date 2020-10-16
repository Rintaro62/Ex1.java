package FindAnimeFoundTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class FABase {
    WebDriver driver;
    protected String ggrUrl = "http://localhost:4445";
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeTest

    public void beforetest() {


        ChromeOptions options = new ChromeOptions();

        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setCapability(ChromeOptions.CAPABILITY, options);

        URL hub = null;
        try {
            hub = new URL(ggrUrl + "/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new RemoteWebDriver(hub, dc);

        System.out.println("Дейсивие перед тестом");
    }

    @AfterTest
    public void aftertest() {

        driver.quit();
        if (driver != null) {
            driver.quit();
        }

        System.out.println("Действие после теста");


    }
}
