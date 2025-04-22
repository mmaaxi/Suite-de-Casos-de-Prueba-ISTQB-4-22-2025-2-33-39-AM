Feature: Verificar login con credenciales inválidas

  Scenario: Intentar iniciar sesión con credenciales incorrectas
    Given el usuario está en la página de login
    When el usuario ingresa un nombre de usuario inválido y una contraseña inválida
    Then el sistema muestra un mensaje de error indicando credenciales inválidas