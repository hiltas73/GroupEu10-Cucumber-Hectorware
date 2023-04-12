Feature: Online Status functionality "Set a Status Message"
  User story: As a user, I should be able to set a status message

  Background: User is logged in with valid credentials
    Given user is successfully logged in

  Scenario Outline: User should be able to set a status message
    When user clicks on User Profile icon
    And user clicks on Set status
    And user clicks on "<statusMessage>" from the displayed options
    And user clicks on Set status message
    Then message should be set to "<statusMessage>"
    Examples:
      | statusMessage    |
      | In a meeting     |
      | Commuting        |
      | Working remotely |
      | Out sick         |
      | Vacationing      |
