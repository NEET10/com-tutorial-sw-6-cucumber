package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class AccountLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());

    public AccountLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 div.row div.col-sm-6:nth-child(2) div.well form:nth-child(3) > input.btn.btn-primary:nth-child(3)")
    WebElement clickOnLogin;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> topMenuTabs;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopTab;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNotebookTab;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllComponents']")
    WebElement showAllComponents;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktopTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement showAllLaptopAndNotebookTab;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currencyLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    List<WebElement> currencyList1;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li")
    List<WebElement> myAccountOptions;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement getLogoutText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinueButton;

    public String getReturningCustomerTextFromLoginPage() {
        log.info("Verify the text “Returning Customer” " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);
    }


    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter email " + email + "to email field " + emailField.toString());
    }


    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password " + password + "to password field " + passwordField.toString());
    }


    public void clickOnLoginButton() {
        log.info("Clicking on Login Button " + clickOnLogin.toString());
        clickOnElement(clickOnLogin);
    }


    public String getMyAccountText() {
        log.info("Verify text “My Account” " + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = topMenuTabs;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuTabs;
        }
        log.info("Click " + menu + " from homepage Top menu  " + topMenuTabs.toString());
    }

    public void navigateToDesktopPage() {
        clickOnElement(desktopTab);
        clickOnElement(showAllDesktopTab);
        log.info("Mouse hover on “Desktops” Tab and click " + desktopTab.toString());
    }

    public void navigateToLaptopAndNotebooksPage() {
        clickOnElement(laptopAndNotebookTab);
        clickOnElement(showAllLaptopAndNotebookTab);
        log.info("Mouse hover on “Laptops & Notebooks” Tab and click " + laptopAndNotebookTab.toString());
    }

    public void navigateToComponentsPage() {
        clickOnElement(componentsTab);
        clickOnElement(showAllComponents);
        log.info(" Mouse hover on “Components” Tab and click " + componentsTab.toString());

    }

    public void clickOnShowAllDesktop() {
        clickOnElement(desktopTab);
        clickOnElement(showAllDesktopTab);
        log.info("Click on Show All Desktop tab " + showAllDesktopTab.toString());
    }

    public void clickOnShowAllLaptopAndNoteBook() {
        clickOnElement(laptopAndNotebookTab);
        clickOnElement(showAllLaptopAndNotebookTab);
        log.info("Click on Show All LaptopAndNotebook Tab " + showAllLaptopAndNotebookTab.toString());
    }

    public void clickOnCurrency(String text) {

        clickOnElement(currencyLink);
        log.info("Clicking on Currency on top of page " + currencyLink.toString());
        List<WebElement> currencyList = currencyList1;
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase(text)) {
                e.click();
                break;
            }
        }
        log.info("Select " + text + " from currency drop down list " + currencyList1.toString());
    }

    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = myAccountOptions;
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = myAccountOptions;
        }
        log.info("Select " + option + " from myAccount drop down list " + myAccountOptions.toString());
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Clicking on My Account Link " + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public String getAccountLogoutText() {

        log.info("Verify text \"Account Logout\" " + getLogoutText.toString());
        return getTextFromElement(getLogoutText);
    }

   public void clickOnContinueButton() {
       clickOnElement(clickContinueButton);
       log.info("Clicking on Continue Button " + clickContinueButton.toString());}
}
