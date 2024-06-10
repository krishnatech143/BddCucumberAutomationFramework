Feature: To verify the Logout Button In BooknowPage
@wip123456
Scenario: TO validate Logout Scenario in AdactinHotelApp 

Given user is on "Login_page"
Then user verify The Title using "Adactin.com - Hotel Reservation System"
When user enter the text "krishnateja19" using xpath "username_Textbox"
And user enter the text "krishna123" using xpath "password_TextBox"
And user clicks on the Loginbutton "Login_Button"
Then user verify The Title using "Adactin.com - Search Hotel"
When user is on "Search_HotelPage"
When user Select the Text in dropDown Using "Location_dropDown" "Sydney"
And user Select the Text in dropDown Using "Hotel_dropDown" "Hotel Creek"
And user Select the Text in dropDown Using "Roomtype_dropDown" "Standard"
And user Select the Text in dropDown Using "NoofRooms_dropDown" "2 - Two"
And user Select the Text in dropDown Using "Adutls_dropDown" "2 - Two"
And user clicks on SearchButton "ContinueButton"
And user clicks on the RadioButton "RadioButton"
And user clicks on SearchButton "SearchButton"
And user is on "Book_Hotelpage"
And user enter the text "krishna" using xpath "Fullname_textbox"
And user enter the text "teja" using xpath "LastName_textBox"
And user enter the text "Guntur" using xpath "Adderss_textBar"
And user enter the text "7896589632156987" using xpath "CreditCardnum_textBox"
And user Select the Text in dropDown Using "Cardtype" "American Express"
And user Select the Text in dropDown Using "cardExpiryDate" "February"
And user Select the Text in dropDown Using "CardYear" "2027"
And user enter the text "125" using xpath "cvvnum"
And user clicks on the Loginbutton "BookNowButton"
And user clicks on the LogOutButton "LogoutButton"



