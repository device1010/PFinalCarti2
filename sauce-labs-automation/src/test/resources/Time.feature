Feature: Time OrangeHRM
  Background: User login into OrangeHRM
    Given Im in OrangeHRM

  @LogOutNeed
  Scenario: Looking for employees timesheet
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    And I click on Time button
    And I click on see timesheet of "Linda Jane Anderson"
    Then I verify the timesheet is displayed