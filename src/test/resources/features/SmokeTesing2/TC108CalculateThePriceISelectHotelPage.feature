Feature: To verify the Price on SelectHotelPage In AdactinHotelApp

@wip12345
Scenario: TC108 To Validate Price 

Given user is on "Login_page"
Then user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
When user is on "Search_HotelPage"
And user Select the Text in dropDown Using "Location_dropDown" "Sydney"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Creek"
And user Select the Text in dropDown Using "NoofRooms_dropDown" "2 - Two"
And user clicks on the Loginbutton "ContinueButton"
Then user verify The Title using "Adactin.com - Select Hotel"
And user Verify the price as PricePernght id "price_night_1" ,NoofRooms id "rooms_1" ,NoofNights id "no_days_1"

