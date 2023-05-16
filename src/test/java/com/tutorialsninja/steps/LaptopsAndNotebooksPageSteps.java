package com.tutorialsninja.steps;

import com.tutorialsninja.pages.CheckoutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAnsNotebooksPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LaptopsAndNotebooksPageSteps {
    @When("^I mouse hover and click on laptop and notebook tab$")
    public void iMouseHoverAndClickOnLaptopAndNotebookTab() {
        new HomePage().clickOnLaptopsAndNotebooksLink();
    }

    @And("^I click on show all laptop and notebook$")
    public void iClickOnShowAllLaptopAndNotebook() {
        new HomePage().selectMenuAndClickShowAllLaptopAndNoteBooks();
    }

    @And("^I click on sort by position$")
    public void iClickOnSortByPosition() {
        new LaptopsAnsNotebooksPage().clickOnSortByPosition();
    }

    @And("^I select product sort by \"([^\"]*)\"$")
    public void iSelectProductSortBy(String text) {
        new LaptopsAnsNotebooksPage().selectProductSortedPriceHighToLow("Price (High > Low)");
    }

    @Then("^I should see product arrange in price high to low order successfully$")
    public void iShouldSeeProductArrangeInPriceHighToLowOrderSuccessfully() {
        Assert.assertEquals("Product not sorted by price High to Low", new LaptopsAnsNotebooksPage().priceHighToLow(), new LaptopsAnsNotebooksPage().getPriceHighToLow());
    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency() {
        new ShoppingCartPage().selectCurrency("£Pound Sterling");
    }

    @And("^I select product \"([^\"]*)\" from laptop and notebook page$")
    public void iSelectProductFromLaptopAndNotebookPage(String product) {
        new LaptopsAnsNotebooksPage().selectProductByName("MacBook");
       // new LaptopsAnsNotebooksPage().clickOnProductMacBook();
    }

    @Then("^I should navigate to \"([^\"]*)\" product$")
    public void iShouldNavigateToProduct(String product) {
        String expectedText = "MacBook";
        String actualText = new LaptopsAnsNotebooksPage().getMacbookText();
        Assert.assertEquals("Text not matched", expectedText, actualText);

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ShoppingCartPage().clickOnAddToCartButton();
    }

    @Then("^I should see product macbook added successfully message$")
    public void iShouldSeeProductMacbookAddedSuccessfullyMessage() {
        String expectedMessage = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        String actualMessage = new ShoppingCartPage().getProductAddedMessage();
        Assert.assertEquals("Message not matched", expectedMessage, actualMessage);

    }

    @And("^I click on shopping cart button$")
    public void iClickOnShoppingCartButton() {
        new ShoppingCartPage().clickOnShoppingCart();
        new ShoppingCartPage().clickOnViewCart();

    }

    @Then("^I should see shopping cart text$")
    public void iShouldSeeShoppingCartText() {
        String expectedText = "Shopping Cart  (0.00kg)";
        String actualText = new ShoppingCartPage().getShoppingCartText();
        Assert.assertEquals("Text not matched", expectedText, actualText);

    }

    @And("^I should see \"([^\"]*)\" product$")
    public void iShouldSeeProduct(String productName) {
        Assert.assertEquals("Product name not matched", "MacBook", new ShoppingCartPage().getProductText());
    }

    @And("^I change quantity \"([^\"]*)\" for product$")
    public void iChangeQuantityForProduct(String qty) {
        new ShoppingCartPage().changeQuantityForProduct(qty);
    }

    @And("^I click on update quantity$")
    public void iClickOnUpdateQuantity() {
        new ShoppingCartPage().clickOnUpdateQuantity();
    }

    @Then("^I should see cart modified message$")
    public void iShouldSeeCartModifiedMessage() {
        Assert.assertTrue("Cart not modified", new ShoppingCartPage().getUpdateSuccessfullyText().contains("Success: You have modified your shopping cart!"));
    }

    @And("^I should see total price for macbook products$")
    public void iShouldSeeTotalPriceForMacbookProducts() {
        Assert.assertEquals("Total not matched", "$1,204.00", new ShoppingCartPage().getTotalPrice());
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("^I should navigate to checkout page$")
    public void iShouldNavigateToCheckoutPage() {
        Assert.assertEquals("Not Navigate to right page", "Checkout", new CheckoutPage().getCheckoutText());
    }

    @And("^I should see new customer text$")
    public void iShouldSeeNewCustomerText() {
        Assert.assertEquals("New Customer Text not found", "New Customer", new CheckoutPage().getNewCustomerText());
    }

    @And("^I click on guest checkout button$")
    public void iClickOnGuestCheckoutButton() {
        new CheckoutPage().clickOnGuestCheckOutRadioButton();
    }

    @And("^I click on continue button of guest checkout page$")
    public void iClickOnContinueButtonOfGuestCheckoutPage() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("^I filled all mandatory field of checkout page$")
    public void iFilledAllMandatoryFieldOfCheckoutPage() {
        new CheckoutPage().enterFirstName("Admin");
        new CheckoutPage().enterLastName("Bhai");
        new CheckoutPage().enterEmailId("admin@yourstore@gmail.com");
        new CheckoutPage().enterTelephone("01234567890");
        new CheckoutPage().enterAddressLine1("10 Dawning Street");
        new CheckoutPage().enterCity("London");
        new CheckoutPage().enterPostCode("NN1 1NN");
        new CheckoutPage().selectCountry("United Kingdom");
        new CheckoutPage().selectRegion("London");
    }

    @And("^I click on continue after fill all detail on checkout page$")
    public void iClickOnContinueAfterFillAllDetailOnCheckoutPage() {
        new CheckoutPage().clickOnContinue();
    }

    @And("^I add comments to text area about product order$")
    public void iAddCommentsToTextAreaAboutProductOrder() {
        new CheckoutPage().addCommentsToTextArea("Nothing to Say!");
    }

    @And("^I click checkbox of terms and condition$")
    public void iClickCheckboxOfTermsAndCondition() {
        new CheckoutPage().checkTermsAndConditionCheckBox();
    }

    @And("^I click on continue of checkout$")
    public void iClickOnContinueOfCheckout() {
        new CheckoutPage().clickContinue();
    }

    @Then("^I should see warning message regarding Payment method$")
    public void iShouldSeeWarningMessageRegardingPaymentMethod() {
        Assert.assertTrue("Payment Warning Message not Displayed:", new CheckoutPage().getWarningMessage());
    }
}
