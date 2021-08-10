# This feature covers the account transaction and hardware-driver modules
@smoke @transactions
Feature: Withdraw Cash
  In order to buy beer
  As an account holder
  I want to withdraw cash from the ATM

  Scenario: Withdraw too much from an account in credit
    Given I have "60" dollars in my account
    When I withdraw "100" dollars
    Then I get system message "Insufficient funds"

  Scenario: Withdraw same amount that I have in my account in credit
    Given I have 100.09 dollars in my account
    When I withdraw 100 dollars
    Then I get the money withdrawn
    And I get system message "Transaction is successful"
    But the account balance should not be 100.09