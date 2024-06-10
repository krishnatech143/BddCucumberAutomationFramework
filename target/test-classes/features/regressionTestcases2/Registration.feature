Feature: To Register the softwaretesingpage
@wip1204
Scenario: To validate create Account in softwaretesingpage

Given user start browser "firefox"
And user Lunch Application using url "https://magento.softwaretestingboard.com/customer/account/create/"
When user fill the Create New Customer Account Form 
|Gabber|Singh|gabbersingh123@gmail.com|gabber@123|gabber@123|
And user clicks on the LoginButton using xpath "//span[text()='Create an Account']"
And user verify The Title using "Create New Customer Account"


@test123
Scenario: To Validate create Account in softwaretesingpage using MapList

Given user start browser "chrome"
And user Lunch Application using url "https://magento.softwaretestingboard.com/customer/account/create/"
When user fill the Create New Customer Account Form2
|FirstName|LastName|Email|Password|ConformPassword|
|Gabber|Singh|gabbersingh123@gmail.com|gabber@123|gabber@123|
And user clicks on the LoginButton using xpath "//span[text()='Create an Account']"
And user verify The Title using "Create New Customer Account"