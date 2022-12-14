package utilities;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driver {

    private static WebDriver driver;
    public static WebDriver getDriver() {
        String browser = System.getProperty("browser"); //null
        if (browser == null) {
            browser = PropertiesReader.getProperty("browser");
        }
        if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
            switch (browser) {
                case "firefox":
                    FirefoxDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    InternetExplorerDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "chrome":
                    ChromeDriverManager.chromedriver().setup();
                    ChromeOptions chromeoptions = new ChromeOptions();
                    chromeoptions.addArguments("--disable-gpu");
                    chromeoptions.addArguments("--no-sandbox");
                    driver = new ChromeDriver(chromeoptions);
                    break;

                case "chrome-headless":
                default:
                    ChromeDriverManager.chromedriver().setup();
                    ChromeOptions opts = new ChromeOptions();
                    opts.addArguments("--headless");
                    opts.addArguments("--disable-gpu");
                    opts.addArguments("--no-sandbox");
                    driver = new ChromeDriver(opts);
            }
        }
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
