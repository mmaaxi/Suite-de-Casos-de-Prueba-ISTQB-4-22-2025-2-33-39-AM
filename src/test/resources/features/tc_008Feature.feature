Feature: Verificar búsqueda con términos especiales

  Scenario: Usuario ingresa caracteres especiales en la barra de búsqueda
    Given el usuario está en la página principal del motor de búsqueda
    When el usuario ingresa "!@#$%^&*()_+" en la barra de búsqueda
    And presiona el botón de buscar
    Then el sistema debería manejar la entrada adecuadamente y mostrar resultados o un mensaje informativo