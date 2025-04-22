Feature: Verificar acceso al perfil de usuario

  Scenario: El usuario inicia sesión y verifica su perfil
    Given el usuario está en la página de inicio de sesión
    When el usuario inicia sesión con credenciales válidas
    Then el usuario es autenticado exitosamente
    When el usuario navega hacia la sección de perfil
    Then el sistema muestra la información del perfil del usuario