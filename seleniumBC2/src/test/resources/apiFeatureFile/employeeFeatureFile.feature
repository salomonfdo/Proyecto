
@Rest
Feature: Employee feature

  @GetEmployees
  Scenario: Title of your scenario
    Given User set valid auth key
    When User send a Get request on "users"  
    Then User should get Status code 200


 @GetEmployees
  Scenario: Title of your scenario
    Given User set valid auth key
    And User sends and id of 2
    When User send a Get request on "users"  
    Then User should get Status code 200