Feature: Login with generate token
  As a user
  I want to login with generate token
  So I can access all features

  Scenario: Login with valid token
    Given I set url and valid token
    When I request with valid username and password
    Then I get status code 400

  Scenario: Login with null body
    Given I set url and null body
    When I request with null body
    Then I get status code 400

  Scenario: Login with null username
    Given I set url and valid password
    When I request with null username
    Then I get status code 400

  Scenario: Login with null password
    Given I set url and valid username
    When I request with null password
    Then I get status code 400

  Scenario: Login with invalid body
    Given I set url and invalid body
    When I request with invalid body
    Then I get status code 400

  Scenario: Login with integer body
    Given I set url and integer body
    When I request with integer body
    Then I get status code 400

  Scenario: Login with integer username
    Given I set url
    And I set integer username and valid password
    When I request with integer username and valid password
    Then I get status code 400

  Scenario: Login with integer password
    Given I set url
    And I set valid username and integer password
    When I request with valid username and integer password
    Then I get status code 400

  Scenario: Login with invalid token
    Given I set url and invalid token
    When I request with invalid token
    Then I get status code 200