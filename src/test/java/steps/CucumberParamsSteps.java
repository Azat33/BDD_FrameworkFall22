package steps;

import io.cucumber.java.en.Given;

public class CucumberParamsSteps {

    @Given("user should enter invalid user name {string}")
    public void user_should_enter_invalid_user_name(String username) {
        user_should_enter_invalid_password(username);

    }
    @Given("user should enter invalid password {string}")
    public void user_should_enter_invalid_password(String password) {
        System.out.println(password);
    }

    @Given("number  {int}")
    public void number(Integer num) {
        System.out.println(num);
    }
    @Given("float {double}")
    public void floate(Double num) {
        System.out.println(num);
    }
}
