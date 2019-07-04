Feature: Searching product
Description: Registered user can login into application using valid username and valid password

Scenario: Login with valid credentials and search for a product
Given user opens login page in TestMee application
When userr enters un as "shwesam" 
And userr enters pd  as "password123"
And click signin button
And userr searches for headphones in sb as "head"
And userr selects headphones from suggestion list
And userr clicks on find button
Then verify loginn succes

