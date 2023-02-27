Feature: Scenario Outline examples


  Background: Go to Login page
    Given user should go to Login page

  @Outline
  Scenario Outline: Login test
    Given enter in username field "<username>"
    And enter in password field "<password>"
    When user click Login button
    Then Login not successful
    Examples:
      | username      | password      |
      | fakeUsername1 | fakePassword1 |
      | fakeUsername2 | fakePassword2 |
      | fakeUsername3 | fakePassword3 |
      | fakeUsername4 | fakePassword4 |
      | fakeUsername5 | fakePassword5 |