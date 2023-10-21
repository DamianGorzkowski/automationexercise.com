Feature: Logout user

  Scenario Outline: Successful user logout
    Given Launch browser
    And Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on Signup | Login button
    And Verify 'Login to your account' is visible
    And Enter correct '<email>' address and '<password>'
    And Click 'login' button
    And Verify that 'Logged in as '<name>'' is visible
    When Click 'Logout' button
    Then Verify that user is navigated to login page
    And Quit Driver

    Examples:
      |name|email|password|
      |Damian|tc4abc@gmail.com|Dami123456!|