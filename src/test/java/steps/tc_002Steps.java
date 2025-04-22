package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver = new ChromeDriver();
    tc_002Page loginPage = new tc_002Page(driver);

    @Given("el usuario está en la página de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        loginPage.navigateToLoginPage();
    }

    @When("el usuario ingresa un nombre de usuario inválido y una contraseña inválida")
    public void el_usuario_ingresa_un_nombre_de_usuario_invalido_y_una_contrasena_invalida() {
        loginPage.enterUsername("usuario_invalido");
        loginPage.enterPassword("contraseña_invalida");
        loginPage.clickLoginButton();
    }

    @Then("el sistema muestra un mensaje de error indicando credenciales inválidas")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_credenciales_invalidas() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed("Credenciales inválidas"));
        driver.quit();
    }
}