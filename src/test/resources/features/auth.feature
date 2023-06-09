#language: es
#author: @AbelGuAr
#encoding: utf-8

Necesidad del negocio: Realizar las pruebas automatizadas al modulo Login

  Antecedentes: Ingresar a la vida de Login
    Dado que "Abel" se entcuentra en la vista para logueaser en la App

  @Regression
  Esquema del escenario:Verificar si un usuario podra iniciar sesion con un username y una password validos
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<email>"
    Entonces valida el ingreso y carga la pagina Welcome

    Ejemplos:
      | username    | password   | repeatpassword | email                           | description                      |
      | ionixtester | Password#1 | Password#1     | abel.gutierrezarias@outlook.com | OK - Valid information           |
      | ionixtester | Password#1 | Password#1     |                                 | OK - Valid information sin email |


  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con un username y una password invalidos
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<email>"
    Entonces valida el las alertas para cada campo

    Ejemplos:
      | username         | password          | repeatpassword    | email                         | description                |
    # Validation username
      | sameUserName     | ValidPassword#0   | ValidPassword#0   |                               | Usuario Exitente           |
      | @invalidUserName | ValidPassword#0   | ValidPassword#0   |                               | Usiario Invalido           |
      |                  | ValidPassword#0   | ValidPassword#0   |                               | Usuario Vacio              |
    # validation password
      | ionixtester      | Dos#3             | Dos#3             |                               | Mayor A 8 Carateres        |
      | ionixtester      | LETRAMAYUSCULA#4  | LETRAMAYUSCULA#4  |                               | Una Letra Mayuscula        |
      | ionixtester      | letraminuscula#5  | letraminuscula#5  |                               | Una Letra Minuscula        |
      | ionixtester      | caracternumerico  | caracternumerico  |                               | Un Caracter Numerico       |
      | ionixtester      | CaracterEspecial0 | CaracterEspecial0 |                               | Un caracter Especial       |
      | ionixtester      | $&*@#_()/?[]{}    | $&*@#_()/?[]{}    |                               | Solo caracterer Especiales |
      | ionixtester      |                   | ValidPassword#0   |                               | No Puede Estar Vacio       |
    # validation repeat password
      | ionixtester      | ValidPassword#0   |                   |                               | No Puede Estar Vacio       |
      | ionixtester      | ValidPassword#1   | ValidPassword#2   |                               | Ser identico a password    |
    # Validacion email
      | ionixtester      | ValidPassword#0   | ValidPassword#0   | abel.gutierrezarias_gmail.com | Conterner el @             |
      | ionixtester      | ValidPassword#0   | ValidPassword#0   | @outlook.com                  | Contener user              |
      | ionixtester      | ValidPassword#0   | ValidPassword#0   | abel.gutierrezarias@.com      | Contener dominio inicial   |
      | ionixtester      | ValidPassword#0   | ValidPassword#0   | abel.gutierrezarias@outlook   | Contener dominio final     |