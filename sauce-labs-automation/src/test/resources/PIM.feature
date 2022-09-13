Feature: PIM
  Background: User login into OrangeHRM
    Given Im in OrangeHRM

  @LogOutNeed
  Scenario: Search an nonexistence id
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    Then I set the employee id field with "70"
    And I click button search
    Then I verify a message is displayed

  @LogOutNeed
  Scenario Outline: Creating new employee
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    Then I click on add employee button
    And I introduce the employee
      | <fname> | <mname> | <lname> |
    And I click on save employee info button
    Then I verify was created
    Examples:
      | fname   | mname   | lname |
      | firname | medname | dess  |
      | generic | user    | pol   |



