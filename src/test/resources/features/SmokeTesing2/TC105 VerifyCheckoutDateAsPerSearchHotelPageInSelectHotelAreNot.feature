Feature: TC_105 To verify The CheckoutDate is displaying as per SearchHotelPage or not
@wip105
Scenario: To Validate The CheckoutDate In SelectHotelPage

Given user is on "Login_page"
Then user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user verify The Title using "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
And user Select the Text in dropDown Using "Location_dropDown" "London"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Hervey"
And user Select the Text in dropDown Using "NoofRooms_dropDown" "4 - Four"
And user Enter Text in "30/05/2024" "CheckinDate_dropDown"
And user gettext of Element using getAttribute "//input[@id='datepick_out']" "value"
And user Enter Text in "31/05/2024" "Checkout_dropDown"
And user Select the Text in dropDown Using "Adutls_dropDown" "4 - Four"
And user clicks on SearchButton "SearchButton"
And user verify The Title using "Adactin.com - Select Hotel"
And user verify the using Text GetAttribute2 "dep_date_1" "value"