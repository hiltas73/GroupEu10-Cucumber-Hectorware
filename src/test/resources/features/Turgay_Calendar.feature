Feature: Calendar Functionality
  User Story:
  As a user, I should be able to see Daily-Weekly-Monthly calendar view  under the Calendar GH


  Background: User is logged in with valid credentials
    Given  user is successfully logged in
    Given user is on calendar module



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



  Scenario: User should be able to see monthly calendar view on calendar menu

    When user clicks on grid tab
    And user clicks on  month button
    Then user sees the monthly calendar view

