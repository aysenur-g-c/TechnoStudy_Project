package TC08;

import Utility.BaseDriverParameter;
import Utility.Elements;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TC08 extends BaseDriverParameter {

    @Test

    public void termOfUse(){

        driver.get("https://techno.study/");

        Elements elements=new Elements(driver);

        elements.applyNowButton.click();


        elements.termOfUse.click();




    }
}
