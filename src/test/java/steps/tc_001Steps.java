package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    tc_001Page loginPage = new tc_001Page();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.enterUsername("validUser");
        loginPage.enterPassword("validPassword");
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        assertTrue(loginPage.isHomePageDisplayed());
    }

    @Then("the user's session should be started successfully")
    public void the_user_s_session_should_be_started_successfully() {
        assertTrue(loginPage.isUserLoggedIn());
    }
}