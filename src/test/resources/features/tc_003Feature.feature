Feature: Login functionality

  Scenario: Verify login with empty password
    Given I am on the login page
    When I enter a valid username and leave the password field empty
    And I click on the login button
    Then I should see a message indicating that the password cannot be empty