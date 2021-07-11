Feature: This feature file will have all the test scenarios to test IRCTC Registration functionality.

Background:
Given User has to launch https://www.irctc.co.in url in the Chrome browser.

@TC001 @Regression @ProdStage
Scenario Outline: This scenario will test the IRCTC User registration functionality by entering valid details.
When user click on register button in the home page
Then the irctc registration page should open
When user enter the Basic information 
And user enters the address details
And User Verified Country Dropdown values
|country|country1|country2|country3|
|India|Pakistan|America|Russia|
|India|Pakistan|America|Russia|
And submit the regitration form 
Then user should ba able to see a success message.
Then user launches "<browserName>" browser
And Loads the url as "<URL>"

Examples:
|browserName|URL|
|chrome|facebook.com|
|Firefox|gmail.com|
|Safari|google.com|



@TC002
Scenario: This scenario will test the error messages in IRCTC User registration functionality by entering invalid details.
When user click on register button in the home page
Then the irctc registration page should open
When user enter the invalid Basic information
Then the error messgaes should display 
And user enters the invalid address details
And submit the regitration form 
Then user should ba able to see a error message.