@Login
Feature: Login Page
  As a user I shoul be able to log in
  So i can buy products

  @ValidCredentials
  Scenario: User should be able to Login
    Given User is on login page
    When User enter userame as "test800@hotmail.com"
    And User enters password as "test123"
    And User click on Sign in button
    And User click on Woman
    And User click on Add product   
    And User click on proceed to checkout
    And User click on payment methode
		Then User confirm order

  @InvalidCredentials
  Scenario: User should show a message
    Given User is on login page
    When User enter userame as "sfernando98@hotmail.com"
    And User enters password as "test123"
    And User click on Sign in button
    Then User should see an error message

  @EmptyCredentials
  Scenario: User should show a message
    Given User is on login page
    When User enter userame as " "
    And User enters password as " "
    And User click on Sign in button
    Then User should see an error message
    Then User should be logged correctly

  @ForgotPass
  Scenario: User should show a message
    Given User is on login page
    When User click on Forgot your password link
    Then User should be sent to a page to change password
