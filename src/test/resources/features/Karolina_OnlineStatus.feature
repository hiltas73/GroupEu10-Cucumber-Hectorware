Feature: Online Status functionality - "View and Change Online Status"
  User story: As a user, I should be able to see and change Online Status

  Background: User is logged in with valid credentials
    Given user is successfully logged in

@kar
  Scenario: User should be able to see "Online", "Away", "Do not disturb" and "Invisible" displayed as status options
    When user clicks on User Profile icon
    And user clicks on Set status
    Then user should see following status options are displayed
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |
@kar
  Scenario Outline: User should be able to change the online status
    When user clicks on User Profile icon
    And user clicks on Set status
    And user clicks on "<OnlineStatusOption>" status from the displayed options
    Then online status should be set to "<OnlineStatusOption>"
    Examples:
      | OnlineStatusOption |
      | Online             |
      | Away               |
      | Do not disturb     |
      | Invisible          |
