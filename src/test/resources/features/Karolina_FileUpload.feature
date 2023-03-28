Feature: File upload
  User story: As a user, I'd like to be able to upload a file so that I can share them with other app users.

  Background: User is logged in with valid credentials
    Given user is successfully logged in


  Scenario Outline: User should be able to upload a file of a maximum size of 5 MB
    When user hovers over Files module
    And user clicks on Files module
    And user clicks on All files folder from the left navigation menu
    And user clicks on + button
    And user clicks on Upload file from the displayed dropdown
    And user selects a file from "<fileLocation>" sized "<fileSize>" to upload
    Then user should see a file "<fileName>" uploaded from "<fileLocation>" is displayed in All files folder
    Examples:
      | fileLocation                                                 | fileSize | fileName           |
      | C:\Users\Karolina\Desktop\File_upload\SamplePNGImage_5mb.png | 5.00 MB  | SamplePNGImage_5mb |
      | C:\Users\Karolina\Desktop\File_upload\PNG_3MB.png            | 2.82 MB  | PNG_3MB            |

  @Ignore
    #TODO bug HECWARE10-28
  Scenario Outline: User shouldn’t be able to upload a file whose size exceeds 5 MB
    When user hovers over Files module
    And user clicks on Files module
    And user clicks on All files folder from the left navigation menu
    And user clicks on + button
    And user clicks on Upload file from the displayed dropdown
    And user selects a file from "<fileLocation>" sized "<fileSize>" to upload
    Then user should see error message File size exceeds the maximum limit of 5 MB is displayed
    Examples:
      | fileLocation                                                      | fileSize |
      | C:\Users\Karolina\Desktop\File_upload\TestPDF.pdf                 | 5.86 MB  |
      | C:\Users\Karolina\Desktop\File_upload\Test_Data_7MB_MP4.mp4       | 7.00 MB  |
