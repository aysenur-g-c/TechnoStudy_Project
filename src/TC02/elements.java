package TC02;

import Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elements {
    public elements(WebDriver driver){
        PageFactory.initElements(BaseDriver.driver,this);}


    @FindBy(xpath = "//*[text()='SIGN IN']")
    public WebElement signInButton;


}
