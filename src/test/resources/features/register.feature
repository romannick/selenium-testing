Feature: Register

  Background:
    # And I click on the "Към сайта" button

  Scenario: Successful register
    When I click on the person icon
    And I click on the register button
    And I type "nikolay.romanov" in the "firstname" input
    And I type "nikiromanov14@gmail.com" in the "email_address" input
    And I type "MyTest123" in the "password" input
    And I type "MyTest123" in the "confirmation" input
    And I click the "terms" checkbox
    And I click on the register button inside the registration form

#  Scenario Outline: Input validations
