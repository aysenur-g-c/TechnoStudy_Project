package TC06;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import Utility.Elements;
import Utility.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;

public class TC06 extends BaseDriverParameter {

    @Test(groups = "@Smoke")
    public void US_06() {
        Elements elements = new Elements(driver);

        driver.get("https://techno.study/");

        // cources
        for (int i = 0; i < elements.cources.size(); i++) {
            new Actions(driver).moveToElement(elements.programs).build().perform();
            elements.cources.get(i).click();

            wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
            elements.tcPicture.click();

            wait.until(ExpectedConditions.urlContains("https://techno.study/"));
            Assert.assertTrue(driver.getCurrentUrl().contains("https://techno.study/"));
        }

        for (int i = 0; i < elements.headMenu.size(); i++) {

            elements.headMenu.get(i).click();
            MyFunc.Bekle(1);

            wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
            elements.tcPicture.click();

            wait.until(ExpectedConditions.urlContains("https://techno.study/"));
            Assert.assertTrue(driver.getCurrentUrl().contains("https://techno.study/"));
        }

        elements._EN.click();
        elements._TR.click();

        wait.until(ExpectedConditions.visibilityOf(elements.text6Months));
        driver.navigate().back();

        wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
        elements.tcPicture.click();

        elements.applyNow.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
        elements.tcPicture.click();
        elements.blogsButton.click();

        for (int i = 0; i < elements.blogsList.size(); i++) {

            elements = new Elements(driver);
            List<WebElement> blogs = elements.blogsList;

            WebElement blog = blogs.get(i);
            wait.until(ExpectedConditions.elementToBeClickable(blog));

            String anaSekme = driver.getWindowHandle();
            blog.click();
            MyFunc.Bekle(1);

            Set<String> newWindow = driver.getWindowHandles();

            if (newWindow.size() > 1) {
                for (String sekme : newWindow) {
                    if (!sekme.equals(anaSekme)) {
                        driver.switchTo().window(sekme);
                        break;
                    }
                }
            }
            Assert.assertTrue(driver.getCurrentUrl().contains("techno.study"), "Blog sayfası açılmadı!");

            if (newWindow.size() > 1) {
                driver.close();
                driver.switchTo().window(anaSekme);
            } else {
                driver.navigate().back();
            }
        }
        // company
        for (int i = 0; i < elements.company.size(); i++) {
            elements.company.get(i).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
            elements.tcPicture.click();

        }
        // learnMore
        for (int i = 0; i < elements.learnMore.size(); i++) {
            elements.learnMore.get(i).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
            elements.tcPicture.click();

        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elements._faq);
        wait.until(ExpectedConditions.visibilityOf(elements._faq));

        elements.span_1.click();
        elements.It_bootcamp.click();
        elements.applyNow.click();
        js.executeScript("arguments[0].scrollIntoView(true);", elements._faq);
        wait.until(ExpectedConditions.visibilityOf(elements._faq));

        elements.span_2.click();
        elements.getStarted.click();
        driver.navigate().back();

        elements.mostPopular_Prgrms.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));

        js.executeScript("arguments[0].scrollIntoView(true);", elements.joinNowButton);
        wait.until(ExpectedConditions.elementToBeClickable(elements.joinNowButton));
        js.executeScript("arguments[0].click();", elements.joinNowButton);

        driver.navigate().to("https://techno.study/are-coding-bootcamps-worth-it");

        wait.until(ExpectedConditions.elementToBeClickable(elements.read_Now));
        elements.read_Now.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.readMore1));
        elements.readMore1.click();
        driver.navigate().back();

        wait.until(ExpectedConditions.elementToBeClickable(elements.readMore2));
        elements.readMore2.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.theAvarage));
        elements.theAvarage.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.saveYourSpot));
        elements.saveYourSpot.click();
        elements.entrollNow.click();
        driver.navigate().to("https://techno.study/average-salary-for-it-specialists");

        wait.until(ExpectedConditions.elementToBeClickable(elements.joinNow2));
        elements.joinNow2.click();

        elements.learnMoreBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
        elements.tcPicture.click();

        js.executeScript("arguments[0].scrollIntoView(false);", elements._faq);
        wait.until(ExpectedConditions.visibilityOf(elements._faq));

        elements.whatWillIlearn.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.autoMation_testingBtn));
        elements.autoMation_testingBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> preHandles = driver.getWindowHandles();

        for (String handle : preHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindowHandle);
        wait.until(ExpectedConditions.elementToBeClickable(elements.interviewPreparation_Btn));
        elements.interviewPreparation_Btn.click();

        Set<String> postHandles = driver.getWindowHandles();
        for (String handle : postHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
                driver.close();
            }
        }
        driver.switchTo().window(mainWindowHandle);

        wait.until(ExpectedConditions.elementToBeClickable(elements.whatWillIlearn));
        elements.whatWillIlearn.click();

        elements.IneverLearned.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.onlineItCourses));
        elements.onlineItCourses.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.tcPicture));
        elements.tcPicture.click();

        wait.until(ExpectedConditions.urlContains("https://techno.study/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://techno.study/"));

    }
}