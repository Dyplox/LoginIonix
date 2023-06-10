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
      | username     | password   | repeatpassword | email                           | description                      | Info escenario |
      | ionixtesters | Password#1 | Password#1     | abel.gutierrezarias@outlook.com | OK - Valid information           |                |
      | ionixtesters | Password#1 | Password#1     |                                 | OK - Valid information sin email |                |


  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con username invalida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el las alertas para el campo username "<description>"

    Ejemplos:
      | username         | password        | repeatpassword  | email                           | description                   | Info escenario |
      | ionixtester      | ValidPassword#0 | ValidPassword#0 | abel.gutierrezarias@outlook.com | Username exist                |                |
      | @invalidUserName | ValidPassword#0 | ValidPassword#0 | abel.gutierrezarias@outlook.com | Username should not contain @ |                |
      |                  | ValidPassword#0 | ValidPassword#0 | abel.gutierrezarias@outlook.com | UN - Usuario Vacio            |                |

  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con password invalida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el las alertas para el campo password "<description>"

    Ejemplos:
      | username    | password          | repeatpassword    | email                           | description                       | Info escenario            |
      | ionixtester | Dos#3             | Dos#3             | abel.gutierrezarias@outlook.com | Password does not have the format | PW - Mayor A 8 Carateres  |
      | ionixtester | LETRAMAYUSCULA#4  | LETRAMAYUSCULA#4  | abel.gutierrezarias@outlook.com | Password does not have the format | PW - Una Letra Mayuscula  |
      | ionixtester | letraminuscula#5  | letraminuscula#5  | abel.gutierrezarias@outlook.com | Password does not have the format | PW - Una Letra Minuscula  |
      | ionixtester | caracternumerico  | caracternumerico  | abel.gutierrezarias@outlook.com | Password does not have the format | PW - Un Caracter Numerico |
      | ionixtester | CaracterEspecial0 | CaracterEspecial0 | abel.gutierrezarias@outlook.com | Password does not have the format | PW - Un caracter Especial |
      | ionixtester | $&*@#_()/?[]{}    | $&*@#_()/?[]{}    | abel.gutierrezarias@outlook.com | Password does not have the format | PW - Solo caracterer Esp. |
      | ionixtester |                   | ValidPassword#0   | abel.gutierrezarias@outlook.com | Password is required              | PW - No Puede Estar Vacio |

  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con reapeatPassword invalida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el las alertas para el campo Repeat Password "<description>"

    Ejemplos:
      | username    | password        | repeatpassword  | email                           | description                          | Info escenario |
      | ionixtester | ValidPassword#  |                 | abel.gutierrezarias@outlook.com | Repeat password is required          |                |
      | ionixtester | ValidPassword#0 | ValidPassword#2 | abel.gutierrezarias@outlook.com | Password do not have the same format |                |
      | ionixtester | ValidPassword#  | password        | abel.gutierrezarias@outlook.com | Password does not have the format    |                |


  @Regression @TestException
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con email invalida
    Cuando el ingresa "<username>", "<password>", "<repeatpassword>" y "<description>"
    Y ingresa el "<email>"
    Entonces valida el las alertas para el campo email "<description>"

    Ejemplos:
      | username    | password       | repeatpassword | email                         | description                | Info escenario                |
      | ionixtester | ValidPassword# | ValidPassword# | abel.gutierrezarias_gmail.com | Please enter a valid email | EM - Conterner el @           |
      | ionixtester | ValidPassword# | ValidPassword# | @outlook.com                  | Please enter a valid email | EM - Contener user            |
      | ionixtester | ValidPassword# | ValidPassword# | abel.gutierrezarias@.com      | Please enter a valid email | EM - Contener dominio inicial |
      | ionixtester | ValidPassword# | ValidPassword# | abel.gutierrezarias@outlook   | Please enter a valid email | EM - Contener dominio final   |