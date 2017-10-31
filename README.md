WebDriver JUnit Archetype
==========================

An existing archetype from github is used for creating the project structure

Project Structure
-----------------------------------

The project follows the standard Maven structure, so all the tests go in the `src/test/java` folder. Tests should inherit from the `JUnitTestBase` class that performs common setup and teardown tasks. This class uses [WebDriverFactory](https://github.com/barancev/webdriver-factory) to manage drivers.

`SampleJUnitTest` class (in `src/test/java`) is an example of a test class for testing the a page of a web application. In the setup method of this class, the `PageFactory` class is used
 to help supporting the [PageObjects](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) pattern.

All test classes should be listed in `JUnitTestSuite` class that is used as a start point to run the tests.

Project Configuration
-----------------------------------

The project uses Maven profiles to set configuration parameters. There are three profile groups: 1) to specify a browser, 2) to specify the target application properties, 3) to specify Selenium Grid location.

use following command to run the test from command line:
mvn clean test -e

The target application URL and the grid location should be specifies in the `pom.xml` file in the corresponding profiles.

Driver capabilities can be tuned in the files `src/test/resources/*.capabilities`.
