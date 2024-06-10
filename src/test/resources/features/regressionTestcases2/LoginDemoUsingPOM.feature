Feature: To Check Login Functionality AdatinHotelApp

Scenario: To Validate LogIn Valid Credentials

Given user is on "Login_Page"
When user validate title to be "Adactin.com - Hotel Reservation System"
When user Enter Text in "username_Textbox" "krishnateja19"
And user Enter Text in "password_TextBox" "krishna123"
And user clicks on the Loginbutton "Login_Button"
Then user validate title to be "Adactin.com - Search Hotel"




 
