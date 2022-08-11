# Falabella
Desafio Falabella Automation Test
Una vez descargado el proyecto, se debe proceder a crear una carpeta que contenga los drivers ded los navegadores que vamos a utilizar, en este caso Frirefox -->geckoDriver
y para el caso de Google Chrome --> chromeDriver
Para poder lanzar los test al menos de forma local, es necesario tener instalado en este caso un IDE como InteliJ Idea o Eclipse y asegurarnos
de que todas las dependencias esten correctas.
El proyecto esta estructurado de la siguiente manera:
package pages --> Se encuentran los WebElements extraidos de la pagina web y los metodos correspondientes para las validaciones
package testClasses --> Se encuentran las testClasses donde se hacen llamar a los metodos declarados previamente en las pages
package testSuite --> Se incluyen los test de cada uno de los casos de pruebas creados a partir de los criterios de aceptacion
                      y a partir de esta testSuites entonces se ejecuta el test necesario a validar
package utils --> Se encuentran algunos metodos utiles para hacer respectivas validaciones en distintas casuisticas

src/main/java
package constants --> Se setean los tipos de navegadores que se van a utilizar para la ejecucion
package driver --> Se trabaja con el driver en este caso WebDriver y se setea la configuracion de despliegue del navegador en este caso
