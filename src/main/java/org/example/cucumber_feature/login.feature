Feature: login functionality of saucedemo.com
  Background: execute after each scenario
    Scenario: loginWithValidCredentials

      Given open the browser
      Then go to the saucedemo.com
      When username is <standard_user>
      And password is <secret_sauce>
      Then  click on login  button
      Then close the webdriver instance

    Scenario: Login with invalid credentials
      Given open the browser
      Then go to the saucedemo.com
      When enter "standard_user" and "secret_sauce" in sauce website login page
      Then click on login  button
      Then close the webdriver instance

      Scenario Outline: login with credentials combination
        Given open the browser
        Then go to the saucedemo.com
        When enter <username> and <password> in sauce website login page
        Then click on login  button
        Then close the webdriver instance
        Examples:
        |username|password|
        |standard_user|secret_sauce|
        |problem_user|secret_sauce|