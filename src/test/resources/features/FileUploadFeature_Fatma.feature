@fatma
Feature:File upload
  Scenario: User should be able to upload a file to the files page
    Given user is logged in with valid credentials
    When user clicks on the plus button
    And user uploads a file with the features defined in AC
    Then the uploaded file should be visible on the files page
