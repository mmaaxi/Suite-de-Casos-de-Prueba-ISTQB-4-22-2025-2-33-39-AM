Feature: Login Functionality
  Scenario: Verify login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And the user clicks on the login button
    Then the user should be redirected to the homepage
    And the user's session should be started successfully