package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_003Page {
    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginBtn");
    By errorMessage = By.id("error");

    public Tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void verifyEmptyPasswordMessage() {
        String message = driver.findElement(errorMessage).getText();
        if (!message.equals("Password cannot be empty")) {
            throw new AssertionError("Expected error message not displayed");
        }
    }
}