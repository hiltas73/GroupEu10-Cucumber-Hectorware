Feature: Default

	#{color:#de350b}*US:*{color}
	#
	#As an application basic user, I should be able to start and stop a new group conversation so that I can communicate with
	#
	#
	#
	#{color:#de350b}*AC:*{color}
	#
	#User can start and stop any conversation
	@HECWARE10-129
	Scenario: Talk Functionality - User can start and stop conversation_Alen_Cucumber
		Given user navigates to the url
		And user click Talk button
		And user click any conversation name from conversation list
		And user click Start Call button
		When user click Leave Call button 
		Then user verify stoped conversation