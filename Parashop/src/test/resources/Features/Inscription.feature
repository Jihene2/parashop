
@Inscription
Feature: Inscription on parashop

  @tag1
  Scenario Outline: Inscription
    Given Browser is open
    And User clicks on s enregistrer
    When User enter name <Name>
    And Enter familly name <Familly name>
    And Enter email <Email>
    And Enter telephone <telephone>
    And Enter password <password>
    And Enter confirm password <confirm password>
    And clicks on accept legal mentions
    And clicks on continuer
    Then User is signed in on the website

    Examples: 
      | Name   | Familly name | Email                   | telephone | password | confirm password |
      | jihene | saidene      | test.academy9@yahoo.com |  26555888 | Test123  | Test123          |