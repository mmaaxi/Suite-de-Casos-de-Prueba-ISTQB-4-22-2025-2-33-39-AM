import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

// Assuming you have a WebDriver instance
public class tc_004Steps {

    WebDriver driver;
    tc_004Page loginPage;
    
    public tc_004Steps() {
        // Initialize the WebDriver and Page Object
        // Example: driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, tc_004Page.class);
    }
    
    @Given("El usuario está en la página de login")
    public void usuarioEnPaginaDeLogin() {
        driver.get("https://example.com/login");
    }

    @When("El usuario deja el campo de usuario vacío y ingresa una contraseña válida")
    public void usuarioDejaCampoUsuarioVacio() {
        loginPage.enterPassword("passwordValida");
        loginPage.clickLoginButton();
    }

    @Then("El sistema muestra un mensaje que indica que el usuario no puede estar vacío")
    public void sistemaMuestraMensajeUsuarioVacio() {
        String actualMessage = loginPage.getUserErrorMessage();
        Assert.assertEquals("El usuario no puede estar vacío", actualMessage);
    }
}