package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {

    public Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);    }

    @FindBy(xpath = "//*[text()='APPLY NOW']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//*[@placeholder='Full name']")
    public WebElement fullNameInputField;

    @FindBy(xpath = "//*[@placeholder='Email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//*[@class='t-input-phonemask__select-flag']")
    public WebElement phoneFlagSelect;

    @FindBy(xpath = "//*[@class='t-input t-input-phonemask']")
    public WebElement phoneNumberInputField;

    @FindBy(xpath = "//*[@name='country']")
    public WebElement countySelect;

    @FindBy(xpath = "//*[@name='course']")
    public WebElement courseSelect;

    @FindBy(xpath = "//*[@name='survey']")
    public WebElement howDidYouButton;

    @FindBy(xpath = "//*[@name='promo code']")
    public WebElement promoCodeInputField;

    @FindBy(xpath = "//*[@name='Checkbox']//following::div")
    public WebElement agreeCheckBox;

    @FindBy(xpath = "//*[text()='Book a Call']")
    public WebElement bookACallButton;

    @FindBy(xpath = "//*[@id='tildaformsuccesspopuptext']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@class='t-form__errorbox-item']")
    public List<WebElement> errorMessages;


}
