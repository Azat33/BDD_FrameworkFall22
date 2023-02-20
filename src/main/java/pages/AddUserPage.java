package pages;

import common.WebElementActions;
import driverManager.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends BasePage{


    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement bioDescriptions;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement submitAddUserBtn;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[1]/span[2]")
    public WebElement userTitle;





}
