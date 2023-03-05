Feature: Data Table functionality


  Background: Login
    Given user should go to Login page
    And user should login with invalid valid credentials
    Then user should login successfully
    And user click on add user button
    Then user should land to create new user page

  @table
  Scenario: Verify that admin can create new user in the system
    Given create new user with following data

      | randomFirstname | randomLastname | randomEmail | randomUsername | randomPassword | bio |

    Then admin should successfully create a user


