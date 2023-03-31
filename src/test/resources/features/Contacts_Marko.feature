
Feature: contacts function
  Scenario:
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button

    And user click on contacts button
    And user click on button New contact
    And user click on new contact on the right side of the interface
    And user put the first and last name in the box
    And user enter digit number in phone empty box
    And user enter email address in empty box
    And verify that name of the contact
