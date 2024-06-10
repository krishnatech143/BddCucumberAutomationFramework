Feature: To Verify the Later dates In Adactin HotelApp
@wip103
Scenario: To Validate the Dates

Given user is on "Login_page"
And user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user validate title to be "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
And user Select the Text in dropDown Using "Location_dropDown" "Adelaide"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Sunshine"
And user Select the Text in dropDown Using "Roomtype_dropDown" "Standard"
And user Select the Text in dropDown Using "NoofRooms_dropDown" "3 - Three"
And user Enter Text in "02/06/2024" "CheckinDate_dropDown"
And user Enter Text in "31/05/2024" "Checkout_dropDown"
And user Select the Text in dropDown Using "Adutls_dropDown" "2 - Two"
And user clicks on SearchButton "SearchButton"
Then user verify the text "Check-In Date shall be before than Check-Out Date" using xpath "//span[@id='checkin_span']"
And user verify the text "Check-Out Date shall be after than Check-In Date" using xpath "//span[@id='checkout_span']"
Then user verify The Title using "Adactin.com - Search Hotel"