Feature: Delete File

	#_{color:#de350b}*User Story:*{color}_
	#
	#As a user, I'd like to be able to add, edit, and delete a file so that I can share them with other app users.
	#
	#_*{color:#de350b}AC:{color}*_
	#
	#*Verify that the user can delete any selected item*

	@HECWARE10-122

	Scenario: User should be able to delete a file
		Given user is logged in with valid credentials
		When user clicks all files button
		And user right click the file that is to be deleted
		And user click delete file option
		And user click deleted files button
		Then name of recently deleted file should be displayed
