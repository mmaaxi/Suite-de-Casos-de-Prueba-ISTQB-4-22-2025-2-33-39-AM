import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Page Object for the login page
public class tc_004Page {

    WebDriver driver;

    @FindBy(id = "password")
    WebElement passwordField;
    
    @FindBy(id = "loginButton")
    WebElement loginButton;
    
    @FindBy(id = "userErrorMessage")
    WebElement userErrorMessage;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUserErrorMessage() {
        return userErrorMessage.getText();
    }
}