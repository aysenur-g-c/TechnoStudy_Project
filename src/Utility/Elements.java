package Utility;

import Utility.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    WebDriver driver;

    @FindBy(xpath = "//h2[contains(text(),'Choose a program')]")
    WebElement chooseProgramText;

    @FindBy(xpath = "(//a[contains(text(),'Learn more')])[2]")
    WebElement learnMoreButton1;

    @FindBy(xpath = "(//a[contains(text(),'Learn more')])[3]")
    WebElement learnMoreButton2;

    @FindBy(xpath = "(//a[contains(text(),'Learn more')])[1]")
    WebElement learnMoreButton3;

    @FindBy(xpath = "//div[@class='t420__logo t-title']")
    WebElement technostudyButton;

    @FindBy(xpath = "//img[@class='t228__imglogo ']")
    WebElement technostudyBackButton;

  /*  public Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickLearnMoreButton(WebElement learnMoreButton) {
        scrollToElement(learnMoreButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", learnMoreButton);
    }

    public void clickTechnostudyButton() {
        scrollToElement(technostudyButton);
        technostudyButton.click();
    }

    public void clickTechnostudyBackButton() {
        technostudyBackButton.click();
    }

    public boolean isChooseProgramTextVisible() {
        return chooseProgramText.isDisplayed();

    }*/
}

