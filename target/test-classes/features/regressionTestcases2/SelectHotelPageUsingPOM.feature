Feature: To Validate Functionality  Select Hotel Page in AdactinHotelWebPage
@wip1403
Scenario: To Validate Select Hotel Page

Given user is on "Login_Page"
When user validate title to be "Adactin.com - Hotel Reservation System"
When user Enter Text in "username_Textbox" "krishnateja19"
And user Enter Text in "password_TextBox" "krishna123"
And user clicks on the Loginbutton "Login_Button"
And user validate title to be "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
Then user Select the Text in dropDown Using "Location_dropDown" "Adelaide"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Hervey"
And user Select the Text in dropDown Using "Roomtype_dropDown" "Double"
And user Select the Text in dropDown Using "NoofRooms_dropDown" "3 - Three"
And user Enter Text in "CheckinDate_dropDown" "14/04/2024"
And user Enter Text in "Checkout_dropDown" "15/04/2024"
And user Select the Text in dropDown Using "Adutls_dropDown" "3 - Three"
And user clicks on SearchButton "SearchButton"
Then user validate title to be "Adactin.com - Select Hotel"
Then user clicks on the RadioButton "RadioButton"
And user clicks on Continue Button "ContinueButton"