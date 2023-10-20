Feature: Login User with correct email and password

  Scenario: Successful user login
    Given Launch browser
    And Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on Signup | Login button
#Verify 'Login to your account' is visible
#Enter correct email address and password
#Click 'login' button
#Verify that 'Logged in as username' is visible
#lick 'Delete Account' button
#Then Verify that 'ACCOUNT DELETED!' is visible