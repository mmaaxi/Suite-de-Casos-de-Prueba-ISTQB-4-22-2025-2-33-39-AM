package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By homePageIdentifier = By.id("homepage");

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void enterUsername(String username) {
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }

    public boolean isHomePageDisplayed() {
        WebElement homePageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(homePageIdentifier));
        return homePageElement.isDisplayed();
    }

    public boolean isUserLoggedIn() {
        // Implementation to verify if the user session started, could be a successful login message or user settings button appearance.
        // Assuming a check on some session identifier or element that becomes visible with successful login
        WebElement loggedInElement = driver.findElement(homePageIdentifier);
        return loggedInElement.isDisplayed();
    }
}