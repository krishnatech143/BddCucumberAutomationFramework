Feature: To Validate AdactinHotelApp Login Functionality
@wip123
Scenario: To Login With Valid Credentials 

Given user is on "Login_page"
Then user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user verify The Title using "Adactin.com - Search Hotel"