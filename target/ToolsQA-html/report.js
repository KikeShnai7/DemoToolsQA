$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Exitoso",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC Validar login con datos correctos",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "He abierto el sitio web de ToolsQA Demo",
  "keyword": "Given "
});
formatter.step({
  "name": "Ingreso al login de la seccion Book Store",
  "keyword": "When "
});
formatter.step({
  "name": "Realizo el login con \"\u003cuser\u003e\" y \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Valido el ingreso al perfil \"\u003cuser\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ]
    },
    {
      "cells": [
        "kikeshnai7",
        "Selenium1*"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC Validar login con datos correctos",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "He abierto el sitio web de ToolsQA Demo",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.he_abierto_el_sitio_web_de_ToolsQA_Demo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ingreso al login de la seccion Book Store",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.ingreso_al_login_de_la_seccion_Book_Store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Realizo el login con \"kikeshnai7\" y \"Selenium1*\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.realizo_el_login_con_y(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido el ingreso al perfil \"kikeshnai7\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.valido_el_ingreso_al_perfil(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});