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
      | username | password       |
      | test123  | HGVUJhsa       |
      | 123test  | DSADsadasd     |
      | 555Test  | DSADASDEWQDSA  |
      | 8888Test | EWQEWQDSdsadas |
      | 0000Test | dsADWQDSAd     |