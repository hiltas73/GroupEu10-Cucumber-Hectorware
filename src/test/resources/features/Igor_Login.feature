Feature: Hectorware app login feature
  User story:
  As a user, I should be able to log in with valid credentials so that I can use the app


  Scenario: login with valid credentials
    Given Navigate to URL
    When Enter valid username in username field
    And Enter valid password in password field
    And Click on login button
    Then Verify the dashboard main page

