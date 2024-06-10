Feature: To Validate Login in AdatinHotelApp

Scenario: To Validate Login using valid Credentials

Given user start browser "chrome"
And user Lunch Application using url "https://adactinhotelapp.com/"
When user Enter the text in textBox "krishnateja19" using xpath "//input[@id='username']"
And user Enter the text in textBox "krishna123" using xpath "//input[@id='password']"
Then user clicks on the LoginButton using xpath "//input[@id='login']"  

Scenario Outline: To Login invalid Credentionals

Given user start browser "chrome"
And user Lunch Application using url "https://adactinhotelapp.com/"
When user Enter the text in textBox '<username>' using xpath "//input[@id='username']"
And user Enter the text in textBox '<password>' using xpath "//input[@id='password']"
And user clicks on the LoginButton using xpath "//input[@id='login']"
Then user verify The Title using '<expTitle>'


Examples: 
| username | password | expTitle|
|kumar@89|kumar123|Adactin.com - Hotel Reservation System|
|krishnateja19|kumar123|Adactin.com - Hotel Reservation System|
|kumar@89|krishna123|Adactin.com - Hotel Reservation System|