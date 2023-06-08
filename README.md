# mobile-automation-testing

Este es un proyecto de Automatización Mobile que utiliza Serenity BDD y Appium para la creación de
un framework de automatización que permita probar el apk
[app-test-QA](https://drive.google.com/file/d/163IBOI9sN2YPShYQfvXaAQz1VASRtsZv/view?usp=share_link)

Este proyecto ha sido desarrollado por [Abel Gutierrez Arias](https://www.linkedin.com/in/abelguar/)
para mejorar el desarrollo en pruebas avanzadas de mobile automation.
***

## 🏠 Detalles del Tester

* Name: `Abel Gutierrez Arias`
* Country: `Colombia`
* City: `Manizales`
* LinkedIn: [https://www.linkedin.com/in/abelguar/](https://www.linkedin.com/in/abelguar/)

***

## 🛠️ Lenguajes & Frameworks

Este proyecto utiliza los siguientes lenguajes y frameworks:

* [Serenity BDD](https://serenity-bdd.github.io/) como framework de pruebas automatizadas.
* [Appium](http://appium.io/docs/en/2.0/) como framework para probar y validar aplicaciones web
  nativas, híbridas y móviles.
* [Cucumber](https://cucumber.io/) como software de testing BDD que permite elaborar pruebas a
  partir de AC.
* [Java 11](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html) como
  lenguaje de
  programación.
* [ScreenPlay](https://serenity-js.org/handbook/thinking-in-serenity-js/screenplay-pattern.html)
  como el patrón de
  diseño.
* [Gradle](https://gradle.org/) como herramienta de compilación.

***

## 🟢 Pre-requisitos: 🟢

1. Descargar la versión estable de
   Java [JDK](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
2. Instalar [git](https://git-scm.com)
3. Instalar [Gradle](https://gradle.org/install/) Build Tool
4. Instalar [Android Studio](https://developer.android.com/studio)
5. Instalar [Appium Desktop](https://github.com/appium/appium-desktop) (Server GUI) o Instalar
   Appium V2 [Appium V2](https://github.com/appium/appium)
6. Instalar [Appium Inspector](https://github.com/appium/appium-inspector)

**🗒️ Nota**: `build.gradle` tiene toda la configuración del proyecto instalada, ejecutar el
siguiente comando para
iniciar todas las tareas (Incluidos los test).

👀 Adicional en su **IDE** de preferencia deberá tener instalados los siguientes plugins:

1. [x] *JUnit*
2. [x] *Cucumber for Java*
3. [x] *Gherkin*
4. [x] *Lombok*

***

**📄️ Generando los reportes de prueba**:  
Con la ejecución del pipepile se generará un artefacto `testing-reports` donde se alojarán los
reportes con los
resultados de esa ejecución realizada.

## ▶️ Ejecución del proyecto:

1. Descarga el proyecto desde GitHub
    * **Opción 1** (HTTPS): `https://github.com/Dyplox/LoginIonix.git`
    * **Opción 2** (SSH): `git@github.com:Dyplox/LoginIonix.git`
    * **Opción 3:** Descárgalo como archivo Zip y extráelo

2. **CD** en la carpeta `mobile-automation-testing`.
3. Configurar Gradle
    * Ejecute el siguiente comando en el terminal:`./gradlew build`.

4. Ejecutar las pruebas en el proyecto
    * **Opción 1**: ejecutar en la ruta del proyecto alguno de los siguientes comandos:

    ```bash
    ./gradlew clean test --info
    ```

    ```bash
    gradle clean test --no-build-cache -Dcucumber.filter.tags="@Regression"
    ```

* **Opción 2**: Ir a las clases de la carpeta **runners** `src/test/java/io/appium/login/runners` y
  ejecutar
  cada Runner.

***

## 📄 Generación de informes

El informe al detalle con los pasos y resultados de las pruebas que se registrará en la ruta:
`target/site/serenity/index.html`.

Adicional se genera un reporte single page si se desea una revisión de alto nivel sobre los
resultados de los test, el
cual se registrará en la ruta:
`target/site/serenity/serenity-summary.html`.

Este comando permitirá generar ambos reportes:

```bash
./gradlew reports
```

***