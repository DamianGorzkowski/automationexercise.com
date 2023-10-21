Feature: Login User with incorrect email and password

  Scenario Outline: Unsuccessful user login
    Given Launch browser
    And Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on Signup | Login button
    And Verify 'Login to your account' is visible
    When Enter incorrect '<email>' address and '<password>'
    And Click 'login' button
    Then Verify error 'Your email or password is incorrect!' is visible
#    And Quit Driver

    Examples:
      |email|password|
      |tc3abc@gmail.com|WrongPassword|
