package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class DesktopPageSteps {
    @And("^I choose sort by name : Z to A$")
    public void iChooseSortByNameZToA() {
        new DesktopPage().selectSortByOptionsFromDropDown("Name (Z - A)");

    }

    @Then("^I should see products in descending order$")
    public void iShouldSeeProductsInDescendingOrder() {
        String expectedOrder = new DesktopPage().getExpectedProductsNameInZtoAOrder().toString();
        String actualOrder = new DesktopPage().getActualProductsNameInZtoAOrder().toString();
        Assert.assertEquals("List not matched", expectedOrder, actualOrder);
    }

    @And("^I Click on product HP LP(\\d+)$")
    public void iClickOnProductHPLP(int hplp3065) {
        new ShoppingCartPage().clickOnHpLp3065();

    }

    @Then("^I should redirected to the product$")
    public void iShouldRedirectedToTheProduct() {
        String expectedMessage = "HP LP3065";
        String actualMessage = new ShoppingCartPage().getHplp3065Text();
        Assert.assertEquals("Message not matched", expectedMessage, actualMessage);
    }


//    @And("^I select DeliveryDate$")
//    public void iSelectDeliveryDate() {
//        new ShoppingCartPage().selectDateFromTheCalender("2023","11","30");
//    }

//    @And("^I select DeliveryDate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//    public void iSelectDeliveryDate(String year, String month, String date)  {
//        new ShoppingCartPage().selectDateFromTheCalender("2023","11","30");
//    }

    @And("^I Click on product$")
    public void iClickOnProduct() {
        new ShoppingCartPage().clickOnHpLp3065();
    }

    @And("^I Click on product \"([^\"]*)\"$")
    public void iClickOnProduct(String hplp3065) {

    }

    @And("^I choose quantity one$")
    public void iChooseQuantityOne() {
        new ShoppingCartPage().changeQuantity("1");
    }

    @And("^I click on add to cart Button$")
    public void iClickOnAddToCartButton() {
        new ShoppingCartPage().clickOnAddToCartButton();
    }

    @Then("^I should get message that product added to cart successfully$")
    public void iShouldGetMessageThatProductAddedToCartSuccessfully() {
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        String actualMessage = new ShoppingCartPage().getProductAddedMessage();
        Assert.assertEquals("Message not matched", expectedMessage, actualMessage);
    }

}
