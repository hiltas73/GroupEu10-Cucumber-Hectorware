Feature: Calendar Functionality
  User Story:
  As a user, I should be able to see Daily-Weekly-Monthly calendar view  under the Calendar GH


  Background: User is logged in with valid credentials and on the calendar module
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    And user is on calendar module



  Scenario: User should be able to see  daily calendar view on calendar menu

    When user clicks on grid tab
    And user clicks on  day button
    Then user sees the daily calendar view


  Scenario: User should be able to see weekly calendar view on calendar menu

    When user clicks on grid tab
    And user clicks on  week button
    Then user sees the weekly calendar view


  Scenario: User should be able to see monthly calendar view on calendar menu

    When user clicks on grid tab
    And user clicks on  month button
    Then user sees the monthly calendar view

  @wip

  Scenario: User should be able to create a new event

    When user clicks on the New Event button
    And enters the name of the New Event as "CEO meeting"
    And enters the date "30 April 2023"
    And clicks the saves  button
    Then verifies that event is saved


@wip
  Scenario Outline: User should be able to update an existing event
    When user clicks on the saved event to update
    And updates the name as "<New Event>"
    And updates the event
    Then user verifies that event is updated.

    Examples:
      | New Event |
      | Party    |

