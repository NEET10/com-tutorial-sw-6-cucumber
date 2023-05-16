package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class AccountLoginPageSteps {
    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        new AccountLoginPage().selectMyAccountOptions("Login");

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new AccountLoginPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new AccountLoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("Login not success","My Account",new AccountLoginPage().getMyAccountText());
    }

}
