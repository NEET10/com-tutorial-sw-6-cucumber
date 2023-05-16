Feature: Top Menu Test
  As a user I want to check all top menu tabs redirecting relevant pages

 @sanity @regression
  Scenario: User should navigate to Desktops Page
    Given I am on homepage
    When I click on Desktops
    And I choose show all desktops
    Then I should navigate to desktops successfully

  @smoke @regression
  Scenario: User should navigate to Laptops And Notebooks Page
    Given I am on homepage
    When I click on Laptops And Notebooks
    And I choose show all Laptops And Notebooks
    Then I should navigate to Laptops And Notebooks page successfully

  @regression
  Scenario: User should navigate to Components Page
    Given I am on homepage
    When I click on Components
    And I choose show all Components
    Then I should navigate to Components page successfully

  @regression
  Scenario: User should navigate to Tablets Page
    Given I am on homepage
    When I click on Tablets
    Then I should navigate to Tablets page successfully

  @regression
  Scenario: User should navigate to Software Page
    Given I am on homepage
    When I click on Software
    Then I should navigate to Software page successfully

