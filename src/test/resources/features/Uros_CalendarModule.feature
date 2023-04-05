Feature:Calendar module

  Background: User is logged in with valid credentials
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button

  Scenario: User navigates to the calendar module

    Then user clicks on a calendar module icon
    And user verifies the calendar module page

  @wip
  Scenario: User can change the view by day, week, month

    Then user clicks on a calendar module icon
    And user clicks on six-dot-button in the upper left corner
    Then user chooses view by day
    And verifies that view has changed to the day interface
    Then user chooses view by week
    And verifies that view has changed to the week interface
    Then user chooses view by month
    And verifies that view has changed to the month interface
@smoke
  Scenario Outline: User can create a new event and update any event
    Then user clicks on a calendar module icon
    And user clicks on the New Event button
    And enters the name of the New Event
    Then enters the date of the event
    And saves the event
    Then verifies that the event has been saved
    And user clicks on the saved event
    Then changes the name to "<Name of the Event>"
    And changes the "<date>"
    And updates the event
    Then user verifies that event is updated with the same "<Name of the Event>" and "<date>"
    Examples:
      | Name of the Event | date                       |
      | Test Event 2      | from 04/16/2024 at 9:00 PM |
      | Test Event 3      | from 04/18/2024 at 9:00 PM |


  @Ignore
    #TODO bug
    Scenario: User should not be able to add new event in the past time

      Then user clicks on a calendar module icon
      And user clicks on the New Event button
      And enters the name of the New Event
      Then enters the date of the event in the past:"from 04/18/2022 at 9:00 PM" and tries to save the event
      Then verifies that the event has not been saved
