Feature: To ValidateLogin 
@wip13041
Scenario Outline: To Validate Login Invalid Credentials 

When user is on "Login_Page"
And user Enter Text in "username_Textbox" '<username>'
And user Enter Text in "password_TextBox" '<password>'
And user clicks on the Loginbutton "Login_Button"
Then user validate title to be '<exptitle>'

Examples: 
| username | password | exptitle|
|kumar@89|kumar123|Adactin.com - Hotel Reservation System|
|krishnateja19|kumar123|Adactin.com - Hotel Reservation System|
|kumar@89|krishna123|Adactin.com - Hotel Reservation System|
