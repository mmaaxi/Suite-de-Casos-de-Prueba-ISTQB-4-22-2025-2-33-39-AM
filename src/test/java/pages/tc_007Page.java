package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_007Page {
    WebDriver driver;

    @FindBy(name = "q")
    WebElement searchBar;

    @FindBy(id = "searchButton")
    WebElement searchButton;

    @FindBy(id = "results")
    WebElement resultsSection;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchTerm(String term) {
        searchBar.clear();
        searchBar.sendKeys(term);
    }

    public void submitSearch() {
        searchButton.click();
    }

    public boolean resultsAreRelevant(String term) {
        return resultsSection.getText().contains(term);
    }
}