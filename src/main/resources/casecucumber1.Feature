Feature: register
Description: User can register into the Test Me App to purchase products

Scenario: Register with valid credentials for any user
Given user opens Register page in TestMe application
When user enter username as "sushmi" and firstname as "kennedy" 
And user enters lastname as "kumar"
And user enters password as "LordMuruga" 
And user enters conpasswd as "LordMuruga"
And user enters gender as "Female"
And user enters email as "sush54@gmail.com"
And user enters mobileno as "8608992027"
And user enters dob as "23-03-1998"
And user enters address as "abc,xyz"
And user selects secquestion as "What is your favourite colour"
And user enters answer as "Blue"
And click Register button
Then verify register process