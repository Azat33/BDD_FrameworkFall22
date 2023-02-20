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
      | firstname | lastname | email               | username | password     | bio            |
      | John16    | Doe16    | johndoe16@gmail.com | john16   | Test123!@156 | Bio test 12316 |
      | John3     | Doe3     | johndoe3@gmail.com  | john3    | Test123!@13  | Bio test 1233  |
      | John4     | Doe4     | johndoe4@gmail.com  | john4    | Test123!@14  | Bio test 1234  |
      | John7     | Doe7     | johndoe7@gmail.com  | john7    | Test123!@17  | Bio test 1237  |
    Then admin should successfully create a user


