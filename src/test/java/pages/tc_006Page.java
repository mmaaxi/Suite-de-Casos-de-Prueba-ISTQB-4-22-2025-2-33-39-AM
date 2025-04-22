package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    By loginField = By.id("login");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By profileLink = By.id("profileLink");
    By profileInformation = By.id("profileInformation");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void login(String username, String password) {
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isUserLoggedIn() {
        // Verifica alguna condición post-login
        return driver.getCurrentUrl().equals("http://example.com/home");
    }

    public void navigateToProfileSection() {
        driver.findElement(profileLink).click();
    }

    public boolean isProfileInformationDisplayed() {
        return driver.findElement(profileInformation).isDisplayed();
    }
}