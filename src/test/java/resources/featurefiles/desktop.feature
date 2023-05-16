Feature: Desktop Test
  As a user I want to check all Desktop features on page

  @sanity @regression
  Scenario: User should choose descending order for displaying products
    Given I am on homepage
    When I click on Desktops
    And I choose show all desktops
    And I choose sort by name : Z to A
    Then I should see products in descending order

  @smoke @regression
  Scenario: User Should redirect to product specification
    Given I am on homepage
    When I click on Desktops
    And I choose show all desktops
    And I Click on product HP LP3065
    Then I should redirected to the product
 @regression
  Scenario: Use can successfully add product into shopping cart
    Given I am on homepage
    When I click on Desktops
    And I choose show all desktops
    And I Click on product
      #And I select DeliveryDate "year","month","Date"
    And I choose quantity one
    And I click on add to cart Button
    Then I should get message that product added to cart successfully


