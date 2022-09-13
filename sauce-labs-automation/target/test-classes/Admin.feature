Feature: Admin OrangeHRM
  Background: User login into OrangeHRM
    Given Im in OrangeHRM

  @LogOutNeed
  Scenario Outline: Creating a nationality
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    Then I click on Admin button
    And I click on Nationalities button
    And I click on add button
    Then I introduce "<nationalities>" nationalities
    And I click on save button
    Then I verify "<nationalities>" is displayed
  Examples:
    | nationalities |
    | Bosnio        |
    | Americano     |

