Feature: Default

	#{color:#de350b}*US:*{color}
	#As an application basic user, I should be able to view Talk Module so that I can use the function
	#**
	#
	#{color:#de350b}*AC:*{color}
	#Display all conversation lists under the Talk module
	@HECWARE10-120 @smoke
	Scenario: User can see Talk Functionality_Alen_cucumber
		Given user navigates to the url
		When user click Talk button
		Then user should see conversation list on the left side of the page