package steps;

import common.ConfigReader;
import common.WebElementActions;
import driverManager.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    WebElementActions elementActions = new WebElementActions();
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();


    @Given("user should go to Login page")
    public void user_should_go_to_login_page() {
       driver.get(ConfigReader.getProperty("qa_env"));
    }
    @Given("user should enter in username field valid credential")
    public void user_should_enter_in_username_field_valid_credential() {
      loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
    }
    @Given("user should enter in password field valid password credential")
    public void user_should_enter_in_password_field_valid_password_credential() {
     loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
    }
    @When("user click Login button")
    public void user_click_login_button() {
     loginPage.submitLoginBtn.click();
    }
    @Then("user should login successfully")
    public void user_should_login_successfully() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/dashboard");
    }

    @Given("user should enter in username field invalid username")
    public void user_should_enter_in_username_field_invalid_username() {

    }
    @Then("user should not login and user should see error message")
    public void user_should_not_login_and_user_should_see_error_message() {

    }


}
