package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page searchPage;

    @Given("the user is on the homepage")
    public void userIsOnHomepage() {
        searchPage = PageFactory.initElements(driver, tc_007Page.class);
        driver.get("https://example.com");
    }

    @When("the user enters a valid search term in the search bar")
    public void userEntersValidSearchTerm() {
        searchPage.enterSearchTerm("valid term");
        searchPage.submitSearch();
    }

    @Then("the system displays results relevant to the search term")
    public void systemDisplaysRelevantResults() {
        assertTrue(searchPage.resultsAreRelevant("valid term"));
    }
}