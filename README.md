## outsourcing.ankhora web-automation

This is the web test automation project for testing https://outsourcing.ankhora.co.uk/ website. It was built using Java 19, Selenide 6, JUnit frameworks.

## Tests

Project has a test class which represents the following scenario:

Main page:
  * click on each section (IT CONSULTING, MANAGEMENT CONSULTING....) 
  * it is supposed to redirect to a specific page when clicked
  * click on the "Send" button, a form opens.

Services page

Form Send:
  * send form was tested

## Prerequisites Software/Tools

1. Java Development Kit (Java 19)
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. Chrome browser
6. JUnit

## Installation/Running Tests

`git clone https://github.com/Furmanova/outsourcing.ankhora`

`cd outsourcing.ankhora/`

`mvn test`

## Contributors

Olha Furmanova furmanovolga@gmail.com
