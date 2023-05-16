package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountLoginPage;
import com.tutorialsninja.pages.AccountRegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class AccountRegisterPageSteps {
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new AccountLoginPage().clickOnMyAccountLink();
    }

    @And("^I select \"([^\"]*)\" option from my account options$")
    public void iSelectOptionFromMyAccountOptions(String option) {
        new AccountLoginPage().selectMyAccountOptions("Register");
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("Register page not displayed", "Register Account", new AccountRegisterPage().getRegisterText());
    }

    @And("^I filled all mandatory field of registration$")
    public void iFilledAllMandatoryFieldOfRegistration() {
        new AccountRegisterPage().enterFirstName("Admin");
        new AccountRegisterPage().enterLastName("Bhai");
        new AccountRegisterPage().enterEmail("admin12@gmail.com");
        new AccountRegisterPage().enterTelephone("01234567890");
        new AccountRegisterPage().enterPassword("Admin12");
        new AccountRegisterPage().enterConfirmPassword("Admin12");
        new AccountRegisterPage().clickOnSubscribeRadioButton("Yes");
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("^I click on continue button of registration page$")
    public void iClickOnContinueButtonOfRegistrationPage() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("^I should see account successfully created message$")
    public void iShouldSeeAccountSuccessfullyCreatedMessage() {
        Assert.assertEquals("Account not created successfully","Your Account Has Been Created!",new AccountRegisterPage().getAccountCreatedMessage());
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new AccountRegisterPage().clickOnContinue();
    }
    @Then("^I should logout successfully$")
    public void iShouldLogoutSuccessfully() {
        Assert.assertEquals("Not Log out","Account Logout",new AccountLoginPage().getAccountLogoutText());
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new AccountLoginPage().clickOnContinueButton();
    }
   }
