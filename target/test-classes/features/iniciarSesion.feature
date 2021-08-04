Feature: Iniciar sesión en el Portal de Firma
  Como usuario quiero iniciar sesión en el portal de firma.


 @TestCaseKey=DEMOJSW-T31
    Scenario: Iniciar Sesión1
    
  Scenario: Iniciar sesión con los datos correctos
    Given El usuario accede a la URL del Portal de Firma
    And Ingresa su nombre de usuario Usuario1
    When Da clic en Continuar
    And Ingresa su clave de acceso 12121212Qw.
    When Da clic en el botón Ingresar
    Then El usuario inicia sesión correctamente

