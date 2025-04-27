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

    @FindBy(xpath = "//a[@class='t-menu__link-item t966__tm-link']")
    public WebElement programMenu;

    @FindBy(xpath = "//div[text()='Software Development Engineer in Test']")
    public WebElement sdet;

    @FindBy(xpath = "//div[text()='Data Science Bootcamp']")
    public WebElement dataScienceBootcamp;

    @FindBy(xpath = "//div[text()='Artificial Intelligence']")
    public WebElement intelligence;

    @FindBy(xpath = "//div[text()='Android Developer Bootcamp']")
    public WebElement androidDeveloper;

    @FindBy(xpath = "(//div[@class='t966__menu-item-title t966__typo__menu_474856319 t-name'])[5]")
    public WebElement mastersProgram;

    @FindBy (xpath = "(//*[@class='t228__list_item'])[4]")
    public WebElement blogsButton;

    @FindBy (xpath = "//*[@class='js-feed t-feed t-feed_col']/ul/li")
    public List<WebElement> blogsList;

    @FindBy(xpath = "//*[text()='SIGN IN']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[text()='Terms of Use']")
    public WebElement termOfUse;

    @FindBy(xpath = "//h2[contains(text(),'Choose a program')]")
    public WebElement chooseProgramText;

    @FindBy(xpath = "(//a[contains(text(),'Learn more')])[2]")
    public WebElement learnMoreButton1;

    @FindBy(xpath = "(//a[contains(text(),'Learn more')])[3]")
    public WebElement learnMoreButton2;

    @FindBy(xpath = "(//a[contains(text(),'Learn more')])[1]")
    public WebElement learnMoreButton3;

    @FindBy(xpath = "//div[@class='t420__logo t-title']")
    public WebElement technostudyButton;

    @FindBy(xpath = "//img[@class='t228__imglogo ']")
    public WebElement technostudyBackButton;

    @FindBy(xpath = "//*[@alt='TechnoStudy']")
    public WebElement tcPicture;

    @FindBy(xpath = "//*[@role='menu']/div")
    public List<WebElement> cources;

    @FindBy(xpath = "(//*[text()='Programs'])[1]")
    public WebElement programs;

    @FindBy(xpath = "//nav[@class='t228__centercontainer']//li")
    public List<WebElement> headMenu;

    @FindBy(xpath = "//*[text()='En']")
    public WebElement _EN;

    @FindBy(xpath = "//*[contains(text(), '6 Ayda')]")
    public WebElement text6Months;

    @FindBy(xpath = "//*[text()='Tr']")
    public WebElement _TR;

    @FindBy(xpath = "//*[text()='APPLY NOW']")
    public WebElement applyNow;

    @FindBy(xpath = "//*[@field='descr2']//li")
    public List<WebElement> company;

    @FindBy(xpath = "//*[text()='Learn more']")
    public List<WebElement> learnMore;

    @FindBy(xpath = "//*[contains(text(),'FAQ')]")
    public WebElement _faq;

    @FindBy(xpath = "//*[text()='What is coding bootcamp?']")
    public WebElement span_1;

    @FindBy(xpath = "//*[text()='Are coding bootcamps worth it?']")
    public WebElement span_2;

    @FindBy(xpath = "//*[text()='Get Started']")
    public WebElement getStarted;

    @FindBy(xpath = "//*[text()='most popular programming languages']")
    public WebElement mostPopular_Prgrms;

    @FindBy(xpath = "//*[text()='Read Now']")
    public WebElement read_Now;

    @FindBy(xpath = "//*[@class='t686__container t-card__container t-container']/div[1]")
    public WebElement readMore1;

    @FindBy(xpath = "//*[@class='t686__container t-card__container t-container']/div[2]")
    public WebElement readMore2;

    @FindBy(xpath = "//a[contains(text(),'Join Now')]")
    public WebElement joinNow2;

    @FindBy(xpath = "//*[text()='Save Your Spot']")
    public WebElement saveYourSpot;

    @FindBy(xpath = "//a[contains(text(),'ENROLL NOW')]")
    public WebElement entrollNow;

    @FindBy(xpath = "//*[@data-elem-type='button']")
    public WebElement joinNowButton;

    @FindBy(xpath = "//a[contains(text(),'The Average')]")
    public WebElement theAvarage;

    @FindBy(linkText = "IT bootcamp")
    public WebElement It_bootcamp;

    @FindBy(xpath = "//*[text()='What will I learn during the SDET course?']")
    public WebElement whatWillIlearn;

    @FindBy(xpath = "//*[text()='Automation Testing']")
    public WebElement autoMation_testingBtn;

    @FindBy(xpath = "//*[text()='Interview Preparation']")
    public WebElement interviewPreparation_Btn;

    @FindBy(xpath = "//span[contains(text(),'I never learned to code before, can I still achieve success?')]")
    public WebElement IneverLearned;

    @FindBy(xpath = "//*[text()='online IT courses in the USA']")
    public WebElement onlineItCourses;

    @FindBy(xpath = "//a[contains(text(),'Learn more')]")
    public WebElement learnMoreBtn;



}
