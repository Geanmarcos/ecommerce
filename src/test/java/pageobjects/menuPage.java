package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;

public class menuPage extends util {

    @FindBy(xpath = "//a[contains(text(),'Sign in')]") protected WebElement lnklogin;

    public menuPage() {
        PageFactory.initElements(driver,this);
    }

    public void clicklogin(){
        wait.until(ExpectedConditions.elementToBeClickable(lnklogin));
        lnklogin.click();
    }

}
