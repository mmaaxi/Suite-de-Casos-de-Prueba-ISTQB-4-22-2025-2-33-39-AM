package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_008Page;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page searchPage;

    @Given("el usuario está en la página principal del motor de búsqueda")
    public void el_usuario_está_en_la_página_principal_del_motor_de_búsqueda() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com");
        searchPage = new tc_008Page(driver);
    }

    @When("el usuario ingresa {string} en la barra de búsqueda")
    public void el_usuario_ingresa_en_la_barra_de_búsqueda(String searchText) {
        searchPage.enterSearchText(searchText);
    }

    @When("presiona el botón de buscar")
    public void presiona_el_botón_de_buscar() {
        searchPage.clickSearchButton();
    }

    @Then("el sistema debería manejar la entrada adecuadamente y mostrar resultados o un mensaje informativo")
    public void el_sistema_debería_manejar_la_entrada_adecuadamente_y_mostrar_resultados_o_un_mensaje_informativo() {
        Assert.assertTrue(searchPage.isResultDisplayed() || searchPage.isInformativeMessageDisplayed());
        driver.quit();
    }
}