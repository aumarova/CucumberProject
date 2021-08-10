Feature: Scenario Outline Demo

  Background:
    Given user is on "qa-chase.com"
    And user is logged in as "test@gmail.com"

    # Scenario Outline: = Scenario Template:
  Scenario Outline: Scenario Outline Demo
    Given user balance is <accountBalance>
    When user deposits <depositAmount>
    Then user balance should be <result>

    # Each Scenario Outline will require Examples/Scenarios
    Examples:
    # Examples: keyword will contain data set which is stored in data table
      | accountBalance | depositAmount | result |
      | 1000           | 100           | 1100   |
      | 2000           | 200           | 2200   |
      | 1500           | 300           | 1800   |

  @smoke
  Scenario Template: Scenario Template Demo
    Given user balance is <accountBalance>
    When user deposits <depositAmount>
    Then user balance should be <result>

    Scenarios:
      | accountBalance | depositAmount | result |
      | 1000           | 100           | 1100   |
      | 2000           | 200           | 2200   |
      | 1500           | 300           | 1800   |

  Scenario Outline: Withdraw fixed amount
    Given I have <Balance> in my account
    When I choose to withdraw the fixed amount of <Withdrawal> Then I should <Outcome>
    And the balance of my account should be <Remaining>

    Examples: Successful withdrawal
      | Balance | Withdrawal  | Outcome             | Remaining   |
      | $500    | $50         | receive $50 cash    | $450        |
      | $500    | $100        | receive $100 cash   | $400        |

    Examples: Attempt to withdraw too much
      | Balance | Withdrawal  | Outcome               | Remaining |
      | $100    | $200        | see an error message  | $100      |
      | $0      | $50         | see an error message  | $0        |