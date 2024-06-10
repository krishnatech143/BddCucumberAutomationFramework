Feature: To Verify Noof Rooms on SelectHotel in AdactinHotelApp
@wip235
Scenario: To Validate Noof Rooms in SelectHotelPage Asper SearchHotelPage

Given user is on "Login_page"
And user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user verify The Title using "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
And user Select the Text in dropDown Using "Location_dropDown" "Sydney"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Creek"
And user verify the text using Stringmethods "//select[@id='room_nos']//parent::option[@value='3']" " "
And user Select the Text in dropDown Using "NoofRooms_dropDown" "3 - Three"
And user Enter Text in "31/05/2024" "CheckinDate_dropDown"
And user Enter Text in "01/06/2024" "Checkout_dropDown" 
And user clicks on Continue Button "ContinueButton"
Then user verify The Title using "Adactin.com - Select Hotel"
When user verify the text using Stringmethods2 "//input[@value='3 Rooms']" " "