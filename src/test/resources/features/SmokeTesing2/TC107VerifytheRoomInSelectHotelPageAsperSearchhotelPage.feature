Feature: TC_107 Verify RoomType Asper Search HotelPage
@wip0605
Scenario: Validate RoomType In SearchHotelPage using AdactinHotelApp

Given user is on "Login_page"
Then user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user verify The Title using "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
And user Select the Text in dropDown Using "Location_dropDown" "Sydney"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Creek"
And user gettext of Element using getAttribute "//option[@value='Deluxe']" "value"
And user Select the Text in dropDown Using "Roomtype_dropDown" "Deluxe"
And user Enter Text in "07/06/2024" "CheckinDate_dropDown"
And user Enter Text in "08/06/2024" "Checkout_dropDown"
And user clicks on SearchButton "ContinueButton"
Then user verify The Title using "Adactin.com - Select Hotel"
When user verify the using Text GetAttribute2 "room_type_0" "value"