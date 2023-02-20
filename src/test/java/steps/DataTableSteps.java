package steps;


import common.ConfigReader;
import common.WebElementActions;
import driverManager.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AddUserPage;
import pages.AdminHomePage;
import pages.LoginPage;
import pojo.UserDetails;


import java.util.List;
import java.util.Map;

public class DataTableSteps {

    WebElementActions elementActions = new WebElementActions();
    WebDriver driver = Driver.getDriver();

    LoginPage loginPage = new LoginPage();
    AdminHomePage adminHomePage = new AdminHomePage();
    AddUserPage addUserPage = new AddUserPage();
    private DataTable dataTable;


    @DataTableType
    public UserDetails userDetails(Map<String, String> row) {
        return new UserDetails(
                row.get("firstname"),
                row.get("lastname"),
                row.get("email"),
                row.get("username"),
                row.get("password"),
                row.get("bio")
        );
    }

    @Given("user should login with invalid valid credentials")
    public void user_should_login_with_invalid_valid_credentials() {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginPage.submitLoginBtn.click();

    }

    @Then("user click on add user button")
    public void user_click_on_add_user_button() {
        adminHomePage.adminAddUserBtn.click();


    }

    @Then("user should land to create new user page")
    public void user_should_land_to_create_new_user_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/user/create");

    }

    //    @Given("create new user with following data")
//    public void create_new_user_with_following_data(DataTable dataTable) {
//        List<List<String>> userDetails = dataTable.asLists();
//
//        System.out.println(userDetails.get(1).get(0));
//        System.out.println(userDetails.get(3).get(3));
//        System.out.println(userDetails.get(4).get(4));
//
//    }
    @Given("create new user with following data")
    public void create_new_user_with_following_data(DataTable dataTable) {
//        addUserPage.firstNameInput.sendKeys(userDetails.get(0).getFirstname());
//        addUserPage.lastNameInput.sendKeys(userDetails.get(0).getLastname());
//        addUserPage.emailInput.sendKeys(userDetails.get(0).getEmail());
//        addUserPage.usernameInput.sendKeys(userDetails.get(0).getUsername());
//        addUserPage.passwordInput.sendKeys(userDetails.get(0).getPassword());
//        addUserPage.bioDescriptions.sendKeys(userDetails.get(0).getBio());
//        addUserPage.submitAddUserBtn.click();

        this.dataTable = dataTable;
        List<List<String>> userDetails = dataTable.asLists();
        addUserPage.firstNameInput.sendKeys(userDetails.get(1).get(0));
        addUserPage.lastNameInput.sendKeys(userDetails.get(1).get(1));
        addUserPage.emailInput.sendKeys(userDetails.get(1).get(2));
        addUserPage.usernameInput.sendKeys(userDetails.get(1).get(3));
        addUserPage.passwordInput.sendKeys(userDetails.get(1).get(4));
        addUserPage.bioDescriptions.sendKeys(userDetails.get(1).get(5));
        addUserPage.submitAddUserBtn.click();
//        System.out.println(userDetails.get(3).getFirstname());
//        for (UserDetails e : userDetails){
//            System.out.println(e.getFirstname());
//        }
    }

    @Then("admin should successfully create a user")
    public void admin_should_successfully_create_a_user() {
        List<List<String>> userDetails = dataTable.asLists();
        String username = userDetails.get(1).get(0).charAt(0) + ". " + userDetails.get(1).get(1);
        Assert.assertEquals(addUserPage.userTitle.getText(), username);
    }

}
