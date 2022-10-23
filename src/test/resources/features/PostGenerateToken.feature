Feature: Post Generate Token
  As a user
  I want to generate my token
  So that I can login

  Scenario: Post generate token with null username and null password
    Given I set url and null username and null password to post generate token
    When I request post generate token
    Then I will get 400
    And get Error message

  Scenario: Post generate token with null username and valid password
    Given I set url and null username and valid password to post generate token
    When I request post generate token with null username and valid password
    Then I will get 400
    And get Error message

  Scenario: Post generate token with valid username and null password
    Given I set url and valid username and null password to post generate token
    When I request post generate token with valid username and null password
    Then I will get 400
    And get Error message

  Scenario: Post generate token with invalid username and invalid password
    Given I set url and invalid username and invalid password to post generate token
    When I request post generate token with invalid username and invalid password
    Then I will get code 200
    And get Failed message

  Scenario: Post generate token with valid username and invalid password
    Given I set url and valid username and invalid password to post generate token
    When I request post generate token with valid username and invalid password
    Then I will get code 200
    And get Failed message

  Scenario: Post generate token with invalid username and valid password
    Given I set url and invalid username and valid password to post generate token
    When I request post generate token with invalid username and valid password
    Then I will get code 200
    And get Failed message

  Scenario: Post generate token with valid username and valid password
    Given I set url and valid username and valid password to post generate token
    When I request post generate token with valid username and valid password
    Then I will get code 200
    And get Success message