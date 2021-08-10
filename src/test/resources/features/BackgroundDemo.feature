@transactions
Feature: BackgroundDemo

  Background:
    Given user is on "qa-chase.com"
    And user is logged in as "test@gmail.com"

  @smoke
  Scenario: Demo1
    When user clicks on transaction
    Then user should see all transactions

  Scenario: Demo2
    Given user balance is 1000
    When user deposits 200
    Then user balance should be 1200

  Scenario: Demo3
    Given user balance is 1500
    When user deposits 200
    Then user balance should be 1200

  Scenario: Demo4
    Given user balance is 2000
    When user deposits 200
    Then user balance should be 1200

  Scenario: Demo4 - negative
    Given user balance is 999
    When user deposits 200
    Then user balance should be 1200
