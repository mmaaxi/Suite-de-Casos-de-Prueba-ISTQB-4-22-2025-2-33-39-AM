package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    WebDriver driver;

    By searchField = By.name("q");
    By searchButton = By.name("btnK");
    By resultStats = By.id("result-stats");
    By informativeMessage = By.id("informative-message");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchText(String searchText) {
        driver.findElement(searchField).sendKeys(searchText);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public boolean isResultDisplayed() {
        return driver.findElements(resultStats).size() > 0;
    }

    public boolean isInformativeMessageDisplayed() {
        return driver.findElements(informativeMessage).size() > 0;
    }
}