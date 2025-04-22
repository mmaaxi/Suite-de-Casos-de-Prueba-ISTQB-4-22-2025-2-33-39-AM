package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_005Page {
    WebDriver driver;

    @FindBy(linkText = "Forgot Password")
    WebElement forgotPasswordLink;
    
    @FindBy(id = "email")
    WebElement emailField;
    
    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(css = ".confirmation-message")
    WebElement confirmationMessage;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }

    public boolean isPasswordResetPageDisplayed() {
        return driver.getCurrentUrl().contains("password-reset");
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void submitEmail() {
        submitButton.click();
    }

    public boolean isEmailSentConfirmationDisplayed() {
        return confirmationMessage.isDisplayed();
    }
}