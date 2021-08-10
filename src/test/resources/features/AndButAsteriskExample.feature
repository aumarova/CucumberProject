@ignore
Feature: Feedback when entering invalid card details

  User tend to provide not 16 digit card numbers.
  The app should user friendly and provide some information
  when the following scenario happens.

  # Example without And keyword
  Scenario: Credit card number is too short
    Given user on Card Validation page
    Given Not sixteen digit card number
    When user inputs the card number
    When user submits the request
    Then the message advising to check the card number will be provided
    Then user redirects to the start page

  # And keyword
  Scenario: Credit card number is too short
    Given user on Card Validation page
    And user has not sixteen digit card number
    When user inputs the card number
    And submits the request
    Then the message advising to check the card number will be provided
    And user redirects to the start page (automatically)

  # And keyword
  Scenario: Credit card number is too short
    Given user on Card Validation page
    And user has not sixteen digit card number
    When user inputs the card number
    And submits the request
    Then the message advising to check the card number will be provided
    And user redirects to the start page (automatically)
    And the user input is saved

  # Asterisk / Wildcard
  # It might not be the case of using this wildcard
  # But everything depends on the standards in your company
  Scenario: Credit card number is too short
    * user on Card Validation page
    * user has not sixteen digit card number
    * user inputs the card number
    * submits the request
    * the message advising to check the card number will be provided
    * user redirects to the start page (automatically)
