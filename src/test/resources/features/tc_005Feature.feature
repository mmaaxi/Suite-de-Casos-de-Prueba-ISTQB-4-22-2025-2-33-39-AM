Feature: Password Reset Functionality

  Scenario: Verify password reset functionality
    Given I am on the login page
    When I click on the 'Forgot Password' link
    Then I should be redirected to the password reset page
    When I input my associated email and submit
    Then I should receive an email with password reset instructions