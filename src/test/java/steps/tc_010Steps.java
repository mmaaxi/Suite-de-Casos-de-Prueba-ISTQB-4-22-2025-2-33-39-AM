package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page contactPage;

    @Given("el usuario está en la página del formulario de contacto")
    public void el_usuario_está_en_la_página_del_formulario_de_contacto() {
        driver = new ChromeDriver();
        driver.get("URL_DE_LA_PÁGINA_DEL_FORMULARIO_DE_CONTACTO");
        contactPage = new tc_010Page(driver);
    }

    @When("el usuario intenta enviar el formulario con campos obligatorios vacíos")
    public void el_usuario_intenta_enviar_el_formulario_con_campos_obligatorios_vacíos() {
        contactPage.submitFormWithEmptyMandatoryFields();
    }

    @Then("el sistema muestra mensajes de error indicando la necesidad de completar los campos obligatorios")
    public void el_sistema_muestra_mensajes_de_error_indicando_la_necesidad_de_completar_los_campos_obligatorios() {
        assertTrue(contactPage.areErrorMessagesDisplayed());
        driver.quit();
    }
}