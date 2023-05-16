package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class TopMenuSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Desktops$")
    public void iClickOnDesktops() {
        new HomePage().clickOnDesktopsLink();
    }

    @And("^I choose show all desktops$")
    public void iChooseShowAllDesktops() {
        new HomePage().selectMenuAndClickShowAllDesktops();
    }

    @Then("^I should navigate to desktops successfully$")
    public void iShouldNavigateToDesktopsSuccessfully() {
        String expectedText = "Desktops";
        String actualText = new HomePage().getDesktopsText();
        Assert.assertEquals("Text not matched", expectedText, actualText);
    }

    @When("^I click on Laptops And Notebooks$")
    public void iClickOnLaptopsAndNotebooks() {
        new HomePage().clickOnLaptopsAndNotebooksLink();
    }

    @And("^I choose show all Laptops And Notebooks$")
    public void iChooseShowAllLaptopsAndNotebooks() {
        new HomePage().selectMenuAndClickShowAllLaptopAndNoteBooks();
    }

    @Then("^I should navigate to Laptops And Notebooks page successfully$")
    public void iShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        String expectedText = "Laptops & Notebooks";
        String actualText = new HomePage().getLaptopsAndNotebooksText();
        Assert.assertEquals("Text not matched", expectedText, actualText);
    }

    @When("^I click on Components$")
    public void iClickOnComponents() {
        new HomePage().clickOnComponentsLink();
    }

    @And("^I choose show all Components$")
    public void iChooseShowAllComponents() {
        new HomePage().selectMenuAndClickShowAllComponents();
    }

    @Then("^I should navigate to Components page successfully$")
    public void iShouldNavigateToComponentsPageSuccessfully() {
        String expectedText = "Components";
        String actualText = new HomePage().getComponentsText();
        Assert.assertEquals("Text not matched", expectedText, actualText);
    }

    @When("^I click on Tablets$")
    public void iClickOnTablets() {
        new HomePage().clickOnTablets();

    }

    @Then("^I should navigate to Tablets page successfully$")
    public void iShouldNavigateToTabletsPageSuccessfully() {
        String expectedText = "Tablets";
        String actualText = new HomePage().getTabletsText();
        Assert.assertEquals("Text not matched", expectedText, actualText);
    }

    @When("^I click on Software$")
    public void iClickOnSoftware() {
        new HomePage().clickOnSoftware();
    }

    @Then("^I should navigate to Software page successfully$")
    public void iShouldNavigateToSoftwarePageSuccessfully() {
        String expectedText = "Software";
        String actualText = new HomePage().getSoftwareText();
        Assert.assertEquals("Text not matched", expectedText, actualText);
    }
}
