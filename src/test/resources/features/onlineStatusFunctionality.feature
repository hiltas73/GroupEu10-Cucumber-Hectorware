
Feature: Online Status feature

  User Story:
  Online Status functionality - "View and Change Online Status"



  Scenario: User I should be abel to see Online status
    Given user is already at the home page of Hectorware app
    When user clicks on avatar button
    And user clicks Set status button
    Then user should see online status

  Scenario:  User should be abel to change Online status to 'Online' status
    Given user is already at the home page of Hectorware app
    When user clicks on avatar button
    And user clicks Set status button
    And user clicks Online button
    And user clicks X button to close the online status window
    And user clicks on avatar button
    Then user should see in dropdown menu that status has changed to Online


  Scenario:  User should be abel to change Online status to 'Away' status
    Given user is already at the home page of Hectorware app
    When user clicks on avatar button
    And user clicks Set status button
    And user clicks Away button
    And user clicks X button to close the online status window
    And user clicks on avatar button
    Then user should see in dropdown menu that status has changed to Away

  Scenario:  User should be abel to change Online status to 'Do not disturb' status
    Given user is already at the home page of Hectorware app
    When user clicks on avatar button
    And user clicks Set status button
    And user clicks Do not Disturb button
    And user clicks X button to close the online status window
    And user clicks on avatar button
    Then user should see in dropdown menu that status has changed to Do not Disturb

  Scenario:  User should be abel to change Online status to 'Invisible'
    Given user is already at the home page of Hectorware app
    When user clicks on avatar button
    And user clicks Set status button
    And user clicks Invisible button
    And user clicks X button to close the online status window
    And user clicks on avatar button
    Then user should see in dropdown menu that status has changed to Invisible

