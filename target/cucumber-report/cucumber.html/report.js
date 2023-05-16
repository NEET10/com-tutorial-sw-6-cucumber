$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktop.feature");
formatter.feature({
  "line": 1,
  "name": "Desktop Test",
  "description": "As a user I want to check all Desktop features on page",
  "id": "desktop-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20170997500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should choose descending order for displaying products",
  "description": "",
  "id": "desktop-test;user-should-choose-descending-order-for-displaying-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Desktops",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I choose show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I choose sort by name : Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see products in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 269570900,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 291412400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iChooseShowAllDesktops()"
});
formatter.result({
  "duration": 3737059400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageSteps.iChooseSortByNameZToA()"
});
formatter.result({
  "duration": 681356000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageSteps.iShouldSeeProductsInDescendingOrder()"
});
formatter.result({
  "duration": 429242200,
  "status": "passed"
});
formatter.after({
  "duration": 979284200,
  "status": "passed"
});
formatter.uri("laptopsandnotebooks.feature");
formatter.feature({
  "line": 1,
  "name": "Laptop And Notebook Test",
  "description": "\r\nAs a user I want to check functionality of laptop and notebook page",
  "id": "laptop-and-notebook-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13722478400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "User should arrange product in price high to low order successfully",
  "description": "",
  "id": "laptop-and-notebook-test;user-should-arrange-product-in-price-high-to-low-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@sanity"
    },
    {
      "line": 7,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I mouse hover and click on laptop and notebook tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on show all laptop and notebook",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on sort by position",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select product sort by \"Price (High \u003e Low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see product arrange in price high to low order successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iMouseHoverAndClickOnLaptopAndNotebookTab()"
});
formatter.result({
  "duration": 159215000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iClickOnShowAllLaptopAndNotebook()"
});
formatter.result({
  "duration": 1548965600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iClickOnSortByPosition()"
});
formatter.result({
  "duration": 122865500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 26
    }
  ],
  "location": "LaptopsAndNotebooksPageSteps.iSelectProductSortBy(String)"
});
formatter.result({
  "duration": 703381000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iShouldSeeProductArrangeInPriceHighToLowOrderSuccessfully()"
});
formatter.result({
  "duration": 263183800,
  "status": "passed"
});
formatter.after({
  "duration": 814677400,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a User I want to login into tutorials ninja website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17053489400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select \"Login\" option from my account options",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountRegisterPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 73807000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 10
    }
  ],
  "location": "AccountRegisterPageSteps.iSelectOptionFromMyAccountOptions(String)"
});
formatter.result({
  "duration": 2295722800,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginPageSteps.iShouldNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 71643200,
  "status": "passed"
});
formatter.after({
  "duration": 765440500,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Page Test",
  "description": "\r\nAs a user i want to do registration into tutorial ninja website",
  "id": "register-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12572660300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "User should navigate to register page successfully",
  "description": "",
  "id": "register-page-test;user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@sanity"
    },
    {
      "line": 7,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select \"Register\" option from my account options",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should navigate to register page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountRegisterPageSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 246918100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "AccountRegisterPageSteps.iSelectOptionFromMyAccountOptions(String)"
});
formatter.result({
  "duration": 2336426400,
  "status": "passed"
});
formatter.match({
  "location": "AccountRegisterPageSteps.iShouldNavigateToRegisterPageSuccessfully()"
});
formatter.result({
  "duration": 34839800,
  "status": "passed"
});
formatter.after({
  "duration": 639683700,
  "status": "passed"
});
formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu Test",
  "description": "As a user I want to check all top menu tabs redirecting relevant pages",
  "id": "top-menu-test",
  "keyword": "Feature"
});fformatter.before({
  "duration": 10352375200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to Desktops Page",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-desktops-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Desktops",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I choose show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to desktops successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 21500,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 169490400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iChooseShowAllDesktops()"
});fformatter.result({
  "duration": 2459974800,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldNavigateToDesktopsSuccessfully()"
});
formatter.result({
  "duration": 27592100,
  "status": "passed"
});
formatter.after({
  "duration": 747760500,
  "status": "passed"
});
});