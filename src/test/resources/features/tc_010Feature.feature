Feature: Verificar envío de formulario de contacto con datos incompletos

Scenario: Completar el formulario de contacto dejando campos obligatorios vacíos
  Given el usuario está en la página del formulario de contacto
  When el usuario intenta enviar el formulario con campos obligatorios vacíos
  Then el sistema muestra mensajes de error indicando la necesidad de completar los campos obligatorios