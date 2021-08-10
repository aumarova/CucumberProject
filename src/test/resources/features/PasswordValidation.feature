@passwordValidation @ignore
Feature: Password validation

  Scenario: User tries to sign in with invalid password
    Given valid user "johndoe@gmail.com"
    But invalid password "12345"
    When user tries to sign in
    Then error message pops up "Invalid password"

  Scenario: Unsuccessful Login with Invalid entries
    Given user navigates to the website "javatpoint.com"
    And user logs in through Login Window by using Username as "USER" and Password as "1234erty"
    But user entered wrong password
    Then login must be unsuccessful.