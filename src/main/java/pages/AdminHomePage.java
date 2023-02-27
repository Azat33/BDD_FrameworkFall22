package pages;

import driverManager.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage extends BasePage{

    @FindBy(xpath = "(//a[contains(text(),'Add user')])[1]")
    public WebElement adminAddUserBtn;

    @FindBy(xpath = "//a[contains(text(),'Gamification')]")
    public WebElement gamificationLink;

}
