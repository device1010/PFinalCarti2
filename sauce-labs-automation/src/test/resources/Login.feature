Feature: Login OrangeHRM
  Background: User login into OrangeHRM
    Given Im in OrangeHRM

  @LogOutNeed
  Scenario: Login into OrangeHRM page with valid credentials
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on login button
    Then The PIM page should be displayed

  @LoginWhitBadCredentials
  Scenario: Login into OrangeHRM page with invalid credentials
    Given I set the user name field with "wrong_user"
    And I set the password field with "wrong password"
    When I click on login button
    Then An error message that says "Invalid credentials" is displayed


