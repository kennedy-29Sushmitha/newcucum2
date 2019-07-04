Feature: Login Test
Description: Registered user can login into application using valid username and valid password


Scenario Outline: Login with valid combination
Given user opens login page in TestMe application
When user enters un as "<username>" 
And user as "<password>"
And click Signin button
Then verify loginn success

Examples:
|username|password|
|lalitha|password123|
