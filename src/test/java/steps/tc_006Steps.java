package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page;

    public tc_006Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        page.navigateToLoginPage();
    }

    @When("el usuario inicia sesión con credenciales válidas")
    public void elUsuarioIniciaSesionConCredencialesValidas() {
        page.login("usuarioValido", "contraseniaValida");
    }

    @Then("el usuario es autenticado exitosamente")
    public void elUsuarioEsAutenticadoExitosamente() {
        Assert.assertTrue(page.isUserLoggedIn());
    }

    @When("el usuario navega hacia la sección de perfil")
    public void elUsuarioNavegaHaciaLaSeccionDePerfil() {
        page.navigateToProfileSection();
    }

    @Then("el sistema muestra la información del perfil del usuario")
    public void elSistemaMuestraLaInformacionDelPerfilDelUsuario() {
        Assert.assertTrue(page.isProfileInformationDisplayed());
    }
}