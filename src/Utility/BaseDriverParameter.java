package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriverParameter {
    public static Logger LogTutma = LogManager.getLogger();

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    @Parameters("BrowserTipi")
    public void setup(String browserTipi) {
        LogTutma.info("Driver kurulumu başlatıldı: " + browserTipi);

        driver = switch (browserTipi.toLowerCase()) {
            case "firefox" -> new FirefoxDriver();
            case "edge" -> new EdgeDriver();
            default -> new ChromeDriver();
        };

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        LogTutma.info("Driver başarıyla başlatıldı.");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        MyFunc.Bekle(3);
        if (driver != null) {
            driver.quit();
            LogTutma.info("Driver kapatıldı");
        } else {
            LogTutma.warn("Driver zaten kapalıydı.");
        }
    }
}