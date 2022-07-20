Feature: Funcionalidad de creacion de cuenta cliente
@regresion
  Scenario: Creacion de cuenta exitosa
    Given que la web este disponible
    And ingresar al login
    When ingresar un correo "teletubies@gmail.com"
    And seleccionar el genero "señor"
    And ingresar el nombre "Geanmarcos"
    And ingresar el apellido "Tataje"
    And validar el correo "teletubies@gmail.com"
    And ingresar la clave "123456789"
    And ingresar la fecha de nacimiento "9/5/1999"
    And "si" permitir envio de newsletter
    And "si" permitir envio de ofertas
    And ingresar empresa "empresa xd"
    And ingresar primera direccion "direccion 123"
    And ingresar segunda direccion "direccion 123456"
    And ingresar ciudad "Lima"
    And seleccionar estado "Arizona"
    And ingresar codigo postal "0000"
    And seleccionar pais "United States"
    And ingresar informacion "Este es mi registro"
    And ingresar telefono "1234567"
    And ingresar celular "123456789"
    And ingresar alias "mi cuenta px"
    And guardar registro
