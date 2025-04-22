import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_009Page;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page contactPage;

    @Given("el usuario está en la página del formulario de contacto")
    public void el_usuario_esta_en_la_pagina_del_formulario_de_contacto() {
        driver = new ChromeDriver();
        driver.get("http://miweb.com/contacto");
        contactPage = new tc_009Page(driver);
    }

    @When("el usuario completa el formulario con datos válidos")
    public void el_usuario_completa_el_formulario_con_datos_validos() {
        contactPage.enterName("Juan Pérez");
        contactPage.enterEmail("juan.perez@correo.com");
        contactPage.enterMessage("Este es un mensaje de prueba.");
    }

    @When("envía el formulario")
    public void envia_el_formulario() {
        contactPage.submitForm();
    }

    @Then("el sistema muestra un mensaje de éxito")
    public void el_sistema_muestra_un_mensaje_de_exito() {
        assertTrue(contactPage.isSuccessMessageDisplayed());
        driver.quit();
    }
}