Feature: Searching product
Description: Registered user can login into application using valid username and valid password

Scenario: Login with valid credentials and search for a product
Given user open login page in TestMee application
When userr enter un as "shwesam" 
And userr enter pd  as "password123"
And click signinn button
And userr searche for headphones in sb as "head"
And userr select headphones from suggestion list
And userr click on find button
And click on cart button
Then verify cart is empty or not