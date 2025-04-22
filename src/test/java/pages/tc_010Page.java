package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;
    
    By submitButton = By.id("submit-btn");
    By errorMessage = By.cssSelector(".error-message");

    public tc_010Page(WebDriver driver){
        this.driver = driver;
    }

    public void submitFormWithEmptyMandatoryFields(){
        driver.findElement(submitButton).click();
    }

    public boolean areErrorMessagesDisplayed(){
        return driver.findElements(errorMessage).size() > 0;
    }
}