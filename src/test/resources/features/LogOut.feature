@FID10-248
Feature: Default

	#* 
	#*{color:#de350b}1- User can log out and ends up in login page.{color}*
	#2- The user can not go to the home page again by clicking the step back button after successfully logged out.
	#h4.
@FID10-301
	Scenario Outline:  User can log out and ends up in login page.
		Given user goes to login page
		Then user enters "<username>" as username
		And enters "<password>" as password
		Then user clicks to login button and should be on the homepage
		And user should see the log out option from the dropdowns by clicking the profile icon
		Then user should be able to click to logout button and land back on the login page
		Examples:
		|username               |password    |
		|salesmanager45@info.com|salesmanager|
		|posmanager80@info.com  |posmanager  |
		|salesmanager62@info.com|salesmanager|

	#* {color:#172b4d}1- User can log out and ends up in login page.{color}
	#*{color:#de350b}2- The user can not go to the home page again by clicking the step back button after successfully logged out.{color}*
	#h4.  
@FID10-307
	Scenario Outline: The user can not go to the home page again by clicking the step back button after successfully logged out.
		Given user goes to login page
		Then user enters "<username>" as username
		And enters "<password>" as password
		Then user clicks to login button and should be on the homepage
		And user should see logut button the dropdowns by cliking the profile icon
		Then user should be able to click to logout button and land back on the login page
		And user navigate back and takes expiremessage
		Examples:
		|username|password|
		|salesmanager42@info.com|salesmanager|
		|posmanager60@info.com|posmanager|
		|salesmanager19@info.com|salesmanager|
