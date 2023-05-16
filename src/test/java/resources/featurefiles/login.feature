Feature: Login Test
  As a User I want to login into tutorials ninja website
  Background: I am on homepage

  @sanity @regression
  Scenario: User should navigate to login page successfully
    When I click on my account link
    And I select "Login" option from my account options
    Then I should navigate to login page successfully

  @smoke @regression
  Scenario: User should login and logout successfully
    When I click on my account link
    And I select "Login" option from my account options
    And I enter email "admin123@gmail.com"
    And I enter password "Admin12"
    And I click on login button
    Then I should login successfully
