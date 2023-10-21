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
    And Fill details: '<first name>', '<last name>', '<company>', '<address>', '<address2>', '<country>', '<state>', '<city>', '<zipcode>', '<mobile number>'
    And Click 'Create Account button'
    Then Verify that 'ACCOUNT CREATED!' is visible
    And Click 'Continue' button
    And Verify that 'Logged in as '<name>'' is visible
#    And Quit Driver

    Examples:
      |name  |email          |title     |password  |date of birth|first name|last name |company|address      |address2|country|state      |city    |zipcode|mobile number|
      |Damian|tc2abc@gmail.com|Mr.       |Dami123456!|1989-04-07   |Damian    |Gorzkowski|Masakra|Multimedialna|Park    |Canada |Mazowieckie|Warszawa|02-785 |673334992    |
      |Damian|tc3abc@gmail.com|Mr.       |Dami123456!|1989-04-07   |Damian    |Gorzkowski|Masakra|Multimedialna|Park    |Canada |Mazowieckie|Warszawa|02-785 |673334992    |
      |Damian|tc4abc@gmail.com|Mr.       |Dami123456!|1989-04-07   |Damian    |Gorzkowski|Masakra|Multimedialna|Park    |Canada |Mazowieckie|Warszawa|02-785 |673334992    |