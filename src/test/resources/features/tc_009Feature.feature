Feature: Verificar envío de formulario de contacto con datos válidos

  Scenario: Envío exitoso del formulario de contacto
    Given el usuario está en la página del formulario de contacto
    When el usuario completa el formulario con datos válidos
    And envía el formulario
    Then el sistema muestra un mensaje de éxito