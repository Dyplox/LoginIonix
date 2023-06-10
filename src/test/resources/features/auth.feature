# language: es
# author: @AbelGuAr
# encoding: utf-8

Necesidad del negocio: Realizar las pruebas automatizadas al modulo Login

  Antecedentes: Ingresar a la vida de Login
    Dado que "Abel" se entcuentra en la vista para logueaser en la App

  @Regression
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con info valida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el ingreso y carga de la pagina Welcome

    Ejemplos:
      | username     | password   | repeatpassword | email                           | description            |
      | ionixtesters | Password#1 | Password#1     | abel.gutierrezarias@outlook.com | OK - Valid information |
    #  | ionixtesters | Password#1 | Password#1     |                                 | OK - Valid information sin email |


  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con username invalida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el las alertas para el campo username "<description>"

    Ejemplos:
      | username         | password        | repeatpassword  | email                           | description                   |
      | ionixtester      | ValidPassword#0 | ValidPassword#0 | abel.gutierrezarias@outlook.com | Username exist                |
      | @invalidUserName | ValidPassword#0 | ValidPassword#0 | abel.gutierrezarias@outlook.com | Username should not contain @ |
      |                  | ValidPassword#0 | ValidPassword#0 | abel.gutierrezarias@outlook.com | UN - Usuario Vacio            |

  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con password invalida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el las alertas para el campo password "<description>"

    Ejemplos:
      | username         | password        | repeatpassword  | email                           | description                   |
      | ionixtesters | Dos#3             | Dos#3             | abel.gutierrezarias@outlook.com | PW - Mayor A 8 Carateres        |
      | ionixtesters | LETRAMAYUSCULA#4  | LETRAMAYUSCULA#4  | abel.gutierrezarias@outlook.com | PW - Una Letra Mayuscula        |
      | ionixtesters | letraminuscula#5  | letraminuscula#5  | abel.gutierrezarias@outlook.com | PW - Una Letra Minuscula        |
      | ionixtesters | caracternumerico  | caracternumerico  | abel.gutierrezarias@outlook.com | PW - Un Caracter Numerico       |
      | ionixtesters | CaracterEspecial0 | CaracterEspecial0 | abel.gutierrezarias@outlook.com | PW - Un caracter Especial       |
      | ionixtesters | $&*@#_()/?[]{}    | $&*@#_()/?[]{}    | abel.gutierrezarias@outlook.com | PW - Solo caracterer Especiales |
      | ionixtesters |                   | ValidPassword#0   | abel.gutierrezarias@outlook.com | PW - No Puede Estar Vacio       |
  # validation repeat password
  #    | ionixtesters     | ValidPassword#0   |                   | abel.gutierrezarias@outlook.com | RPW - No Puede Estar Vacio      |
  #    | ionixtesters     | ValidPassword#1   | ValidPassword#2   | abel.gutierrezarias@outlook.com | RPW - Ser identico a password   |
  # Validacion email
  #    | ionixtesters      | ValidPassword#0   | ValidPassword#0   | abel.gutierrezarias_gmail.com | EM - Conterner el @             |
  #    | ionixtesters      | ValidPassword#0   | ValidPassword#0   | @outlook.com                  | EM - Contener user              |
  #    | ionixtesters      | ValidPassword#0   | ValidPassword#0   | abel.gutierrezarias@.com      | EM - Contener dominio inicial   |
  #    | ionixtesters     | ValidPassword#0   | ValidPassword#0   | abel.gutierrezarias@outlook   | EM - Contener dominio final     |