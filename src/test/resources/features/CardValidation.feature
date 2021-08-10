Feature: Feedback when entering invalid card details

  User tend to provide not 16 digit card numbers.
  The app should user friendly and provide some information
  when the following scenario happens.

  @smoke
  Scenario: Credit card number is too short
    Given Not sixteen digit card number
    When user submits the request
    Then the message advising to check the card number will be provided
  #  Then user redirects to the start page
  #  The step above disabled until DE12345 is fixed

  #  The reason why you are disabling tests?
  #   dev develops
  #   dev commits and push code to github
  #   dev merge to master (main branch)
  #   CI trigger tests in the particular environment (dev, qa, staging)
  #                                           localhost:9232/card-validation - local dev environment
  #                                           www.ks.development.cucumberproject.com/card-validation  v2
  #                                           www.ks.qa.cucumberproject.com/card-validation  v2
  #                                           www.ks.staging.cucumberproject.com/card-validation  v2
  #   CI report result
  #       test failure
  #   Rollback to the previous version of master (main branch)

  # bash scripting - done by DevOps engineers
