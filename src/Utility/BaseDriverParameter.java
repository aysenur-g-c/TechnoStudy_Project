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

    @BeforeClass
    @Parameters("BrowserTipi")
    public void Setup(String browserTipi) {
        LogTutma.info("Log Tutma işlemi Başladı");

        switch (browserTipi.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 5 sn mühlet: elementi bulma mühleti

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        LogTutma.info("Başlangıç değişkenleri driver, wait, log tanımlandı ve başlatıldı");

    }


    @AfterClass
    public void TearDown() {
        // seleniumdaki BekleKapat
        MyFunc.Bekle(3);
        driver.quit();  // bütün açılmış windowları kapatır
        LogTutma.info("Driver kapatıldı");

        LogTutma.warn("Driver kapatılamadı.");
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("BrowserTipi")
    public void setup(String browserTipi) {
        LogTutma.info("Log Tutma işlemi Başladı");

        switch (browserTipi.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        LogTutma.info("Başlangıç değişkenleri driver, wait, log tanımlandı ve başlatıldı");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        MyFunc.Bekle(3);
        if (driver != null) {
            driver.quit();
            LogTutma.info("Driver kapatıldı");
        } else {
            LogTutma.warn("Driver kapatılamadı.");
        }
    }




}
