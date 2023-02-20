Feature: Parameters in cucumber


  @StringParams
  Scenario: Login with invalid credentials
    Given user should go to Login page
    And user should enter invalid user name "testName"
    And user should enter invalid password "test123!"
    When user click Login button
    Then user should not login and user should see error message

    @int
    Scenario: Int param
      Given number  5
      And float 5.5
