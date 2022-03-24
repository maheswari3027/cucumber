@tag
Feature: Validating the adactinhotel booking functionality
  Background:
   Given Launch the browser
    And open the adactinhotelbooking url

  @tag1
  Scenario Outline: Validating the adactinhotel booking functionality with valid credentials
    
    
    When Enter the "<username>" and "<password>"
    And Click the login button
    And Select the location
    And Select the hotels
    And Select the Room Type
    And Select the Numebr of Rooms
    And Click the Search button
    And Click the Radio button
    And Click the Continue button
    And Enter the first name
    And Enter the last name
    And Enter the billing address
    And Enter the Credit Card number
    And Select the credit card type
    And Select the ExpiryMonth and ExpiryYear
    And Enter the CVV Number
    And Click the BookNow button
    Then Print the Order Id
    And Close the browser
    
  
  Examples:
    |username|password|
    |maheswariprabhu|DM928P|