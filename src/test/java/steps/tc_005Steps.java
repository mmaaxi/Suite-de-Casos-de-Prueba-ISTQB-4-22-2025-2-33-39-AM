package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page = PageFactory.initElements(driver, tc_005Page.class);

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        driver.get("https://example.com/login");
    }

    @When("^I click on the 'Forgot Password' link$")
    public void iClickOnTheForgotPasswordLink() {
        page.clickForgotPasswordLink();
    }

    @Then("^I should be redirected to the password reset page$")
    public void iShouldBeRedirectedToThePasswordResetPage() {
        assertTrue(page.isPasswordResetPageDisplayed());
    }

    @When("^I input my associated email and submit$")
    public void iInputMyAssociatedEmailAndSubmit() {
        page.enterEmail("user@example.com");
        page.submitEmail();
    }

    @Then("^I should receive an email with password reset instructions$")
    public void iShouldReceiveAnEmailWithPasswordResetInstructions() {
        assertTrue(page.isEmailSentConfirmationDisplayed());
    }
}