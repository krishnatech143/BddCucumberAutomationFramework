Feature: Validate Login Functionality
@wiplogin
Scenario Outline: Validate Log In valid credentials 

Given user start browser "chrome"
And user Lunch Application using url "https://adactinhotelapp.com/"
When user Enter the text in textBox "<username>" using xpath "//input[@id='username']"
And user Enter the text in textBox "<password>" using xpath "//input[@id='password']"
And user clicks on the LoginButton using xpath "//input[@id='login']"
Then user verify The Title using "<exptitle>"

Examples:
| username | password | exptitle |
|krishnateja19|krishna123|Adactin.com - Search Hotel|
|krishna123|krishna456|Adactin.com - Hotel Reservation System|
|krishnateja19|teja4569|Adactin.com - Hotel Reservation System|
|kaream123|krishna123|Adactin.com - Hotel Reservation System|
|krishnateja19||Adactin.com - Hotel Reservation System|
||krishna123|Adactin.com - Hotel Reservation System|
@wiplogin
Scenario: Validate login Scenario2
Given user start browser "chrome"
And user Lunch Application using url "https://adactinhotelapp.com/"
When user clicks on the LoginButton using xpath "//input[@id='login']"
Then user verify The Title using "Adactin.com - Hotel Reservation System"