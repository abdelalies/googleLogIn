@tag
  Feature: Google Login
    I want to be able to login with valid credentials.
    I shouldnt be logged in with invalid credentials.

  @GoogleLogIn
  Scenario: User should be directed to the login page
    Given I'm on google homepage
    And the signin button is displayed
    When I click on the signin button
    Then I should be directed to the login page