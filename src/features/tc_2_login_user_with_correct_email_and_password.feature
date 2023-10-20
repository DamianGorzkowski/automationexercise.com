Feature: Login User with correct email and password

  Scenario Outline: Successful user login
    Given Launch browser
    And Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on Signup | Login button
    And Verify 'Login to your account' is visible
    And Enter correct '<email>' address and '<password>'
    And Click 'login' button
    And Verify that 'Logged in as '<name>'' is visible
    When Click 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible

  Examples:
    |name|email|password|
    |Damian|dami5@gmail.com|Dami12345!|
