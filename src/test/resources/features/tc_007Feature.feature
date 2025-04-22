Feature: Search Functionality

  Scenario: Verify search with valid terms
    Given the user is on the homepage
    When the user enters a valid search term in the search bar
    Then the system displays results relevant to the search term