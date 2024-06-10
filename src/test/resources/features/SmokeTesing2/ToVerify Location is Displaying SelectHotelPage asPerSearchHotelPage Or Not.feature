Feature: To Verify Location is Displaying SelectHotelPage asPerSearchHotelPage Or Not
@wip104
Scenario: To Valiadate Location As per SearchHotelPage in SelectHotelPage

Given user is on "Login_page"
Then user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user verify The Title using "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
And user Select the Text in dropDown Using "Location_dropDown" "Brisbane"
And user gettext of Element using xpath "//option[@value='Brisbane']"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Hervey"
And user Select the Text in dropDown Using "Roomtype_dropDown" "Standard"
And user Select the Text in dropDown Using "NoofRooms_dropDown" "3 - Three"
And user Enter Text in "29/05/2024" "CheckinDate_dropDown"
And user Enter Text in "31/05/2024" "Checkout_dropDown"
And user Select the Text in dropDown Using "Adutls_dropDown" "2 - Two"
And user clicks on SearchButton "SearchButton"
And user verify the using Text GetAttribute "location_0" "value"