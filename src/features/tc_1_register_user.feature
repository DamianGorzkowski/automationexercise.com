Feature: User register procedure

  Scenario Outline: Successful user registration procedure
    Given Launch browser
    And Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on Signup | Login button
    And Verify 'New User Signup!' is visible
    When Enter '<name>' and '<email>' address
    And Click 'Signup' button
    And  Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: '<title>', '<name>', '<email>', '<password>', '<date of birth>'
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
#    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#    And Click 'Create Account button'
#    Then Verify that 'ACCOUNT CREATED!' is visible
#    And Click 'Continue' button
#    And Verify that 'Logged in as username' is visible

    Examples:
      |name  |email          |title     |password  |date of birth|first name|last name |company|address      |address2|country|state      |city    |zipcode|mobile number|
      |Damian|dami5@gmail.com|Mr.       |Dami12345!|1989-04-07   |Damian    |Gorzkowski|Masakra|Multimedialna|Park    |Poland |Mazowieckie|Warszawa|02-785 |673334992    |