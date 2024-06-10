Feature: To Verify the Past Dates in Adactin Hotel App
@wip102
Scenario: To Check The Past Dates 

Given user start browser "chrome"
And user Lunch Application using url "https://adactinhotelapp.com/"
When user Enter the text in textBox "krishnateja19" using xpath "//input[@id='username']"
And user Enter the text in textBox "krishna123" using xpath "//input[@id='password']"
And user clicks on the Loginbutton2 using xpath "//input[@id='login']"
Then user verify The Title using "Adactin.com - Search Hotel"
When user Select the Text in dropDown2 Using "//select[@id='location']" "Melbourne"
And user Select the Text in dropDown2 Using "//select[@id='hotels']" "Hotel Sunshine"
And user Select the Text in dropDown2 Using "//select[@id='room_type']" "Double"
And user Select the Text in dropDown2 Using "//select[@id='room_nos']" "3 - Three"
And user Enter Text2 in "//input[@id='datepick_in']" "22/05/2024"
And user Enter Text2 in "//input[@id='datepick_out']" "24/05/2024"
And user Select the Text in dropDown2 Using "//select[@id='adult_room']" "2 - Two"
And user clicks on SearchButton2 "//input[@id='Submit']"
Then user verify The Title using "Adactin.com - Select Hotel"