Feature: Login into application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://money.rediff.com/index.html" Site
And click on sign in link on Home page to land on Secure sign in page
When User enters <username> and <password> and logs in 
Then Verify that user is successfully logged in

Examples:
|	username			|	password		|
|	merwyn@abc.com		|	123456			|
|	sonu@abc.com		|	567890			|
