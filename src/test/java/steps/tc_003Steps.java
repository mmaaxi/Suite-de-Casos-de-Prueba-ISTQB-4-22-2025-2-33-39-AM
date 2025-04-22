package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tc_003Page;

public class Tc_003Steps {
    Tc_003Page loginPage = new Tc_003Page();

    @When("I enter a valid username and leave the password field empty")
    public void iEnterAValidUsernameAndLeaveThePasswordFieldEmpty() {
        loginPage.enterUsername("valid_user");
        loginPage.enterPassword("");
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should see a message indicating that the password cannot be empty")
    public void iShouldSeeAMessageIndicatingThatThePasswordCannotBeEmpty() {
        loginPage.verifyEmptyPasswordMessage();
    }
}