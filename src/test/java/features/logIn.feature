Feature: Login Panel

Scenario: Verify login panel with valid credentials
Given user is on login page
When user enters username "Admin" and password "admin123" 
And user click on login button
Then user navigate dashboard to page

Scenario: Verify login panel with empty password
Given user is on login page
When user enters username "Admin" and password "" 
And user click on login button
Then user should get massege as "Required"

Scenario: Verify login panel with invalid credentials
Given user is on login page
When user enters username "Admin" and password "Manish" 
And user click on login button
Then user should get massege  "Invalid credentials"