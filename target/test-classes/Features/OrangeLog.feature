@tag
Feature: Validating the OrangeHRM Login functionality
  Background:
       Given Launch the browser
    And Open the Orange HRM
  @reg
  Scenario: Validating the OrangeHRM Login functionality with valid credentials
    
    When Enter the username and password
    |username|password|
    |admin|admin123|
    |admin|admin|
    And click the login button
    Then I validate the outcomes
    And Close the browser
    
    @tag1
  Scenario Outline: Validating the OrangeHRM Login functionality with valid credentials
    
    When Enter the "<username>" and "<password>"
    |admin|admin123|
    And click the login button
    Then I validate the outcomes
    And Close the browser
    Examples:
    |username|password|
    |admin|admin123|
    |admin|admin|
    |admin123|admin|
