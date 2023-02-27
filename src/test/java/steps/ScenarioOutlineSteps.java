package steps;


import common.MockDataGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;


public class ScenarioOutlineSteps {
    LoginPage loginPage = new LoginPage();
    MockDataGenerator fakers = new MockDataGenerator();

    private String fakeUsername = fakers.generateMockUsername();

    private String fakePassword = fakers.generatePassword(8);


    @Given("enter in username field {string}")
    public void enter_in_username_field(String username) {
        username = fakeUsername;
       loginPage.usernameInput.sendKeys(username);
    }
    @Given("enter in password field {string}")
    public void enter_in_password_field(String password) {
        password = fakePassword;
        loginPage.passwordInput.sendKeys(password);
    }
    @Then("Login not successful")
    public void login_not_successful() {
        System.out.println("Login is not successful");
    }

}
