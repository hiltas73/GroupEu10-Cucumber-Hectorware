
Feature: Edit function

  Scenario: User can rename conversation
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button
   When User click Talk button
    And User click and conversation name under conversation list
    And User click three little dots right next to start call
    And User click rename conversation from dropdown menu
    And User enter alphanumerical characters between 3 and 25 chars
    And User click small arrow
    Then User should verify edited conversation name
