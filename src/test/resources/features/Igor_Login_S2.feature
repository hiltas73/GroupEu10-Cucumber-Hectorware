Feature: Default

	#{color:#4c9aff}*User story:*{color}
	#
	#{color:#172b4d}As a user, I should be able to log in with valid credentials so that I can use the app{color}
	#
	# 
	#
	#{color:#de350b}*AC5:*{color} users should be able to log in with a valid username and password, launch the dashboard main page, and see “Files - Hectorware – QA“ text as the page title
	@HECWARE10-109
	Scenario: Verify that users can log in with valid credentials - Igor S2
		Given   Navigate to URL
		When    Enter valid username in username field
		And     Enter valid password in password field
		And     Click on login button
		Then    Verify the dashboard main page