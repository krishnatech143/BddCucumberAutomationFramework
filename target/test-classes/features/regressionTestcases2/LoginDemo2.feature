Feature: To validate Login in softwaretestingtool
@test123
Scenario: To validDate Login 

Given user start browser "edge"
And user Lunch Application using url "https://magento.softwaretestingboard.com/"
When user clicks on the LoginButton using xpath "//a[contains(text(),'Sign In')]"
And user verify The Title using "Customer Login"
And user Enter the text in textBox "krishnateja8466@gmail.com" using xpath "//input[@id='email']"
And user Enter the text in textBox "krishna@123" using xpath "//input[@id='pass']"
And user clicks on the LoginButton using xpath "//span[text()='Sign In']"
Then user verify The Title using "Home Page"