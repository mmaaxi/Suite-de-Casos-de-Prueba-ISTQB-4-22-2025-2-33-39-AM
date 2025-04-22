Feature: Login functionality

  Scenario: Verificar login con usuario vacío
    Given El usuario está en la página de login
    When El usuario deja el campo de usuario vacío y ingresa una contraseña válida
    Then El sistema muestra un mensaje que indica que el usuario no puede estar vacío