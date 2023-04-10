
Feature:File upload

  Background:
    Given user is logged in with valid credentials

@smoke
  Scenario: User should be able to upload a file to the files page
    When user clicks on the plus button
    And user uploads a file with the features defined in AC
    Then the uploaded file should be visible on the files page


