package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class CucumberParamsSteps {

    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    @Given("user should enter invalid user name {string}")
    public void user_should_enter_invalid_user_name(String username) {
        username = faker.name().username();
        loginPage.usernameInput.sendKeys(username);

    }

    @Given("user should enter invalid password {string}")
    public void user_should_enter_invalid_password(String password) {
        password = faker.internet().password();
        loginPage.passwordInput.sendKeys(password);
    }

//    @Given("number  {int}")
//    public void number(Integer num) {
//        System.out.println(num);
//    }
//    @Given("float {double}")
//    public void floate(Double num) {
//        System.out.println(num);
//    }
}
