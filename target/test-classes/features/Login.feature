
#Author: Enrique de Jesús García Espinosa
#Email: kiike_futball@hotmail.com

Feature: Login Exitoso
	
	Scenario Outline: TC Validar login con datos correctos
  	Given He abierto el sitio web de ToolsQA Demo
  	When Ingreso al login de la seccion Book Store
  	And Realizo el login con "<user>" y "<password>"
  	Then Valido el ingreso al perfil "<user>"
  	
    Examples:
    | user | password |
    | kikeshnai7 | Selenium1* |
