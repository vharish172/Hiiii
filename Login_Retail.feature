@main
Feature: Login to the webpage

  Background: Background Section
    Given User on the hompage
    When enter the username
    And enter the password
    Then user will navigate to sales 
    Then User navigate to GIFT VOUCHER Webpage 

  @login
  Scenario: Login with authorized user
    When user enter valid Username
    And user enter valid password
    Then login button enabled
