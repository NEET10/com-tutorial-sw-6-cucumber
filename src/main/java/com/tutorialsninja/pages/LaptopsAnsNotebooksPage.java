package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LaptopsAnsNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAnsNotebooksPage.class.getName());
    public LaptopsAnsNotebooksPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopAndNotebookText;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement clickOnSortBy;
    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> productPriceList;
    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> productPriceList1;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement productMacBook;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macbookText;
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotebooksText;

    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> productsPrices;

    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    @FindBy(id = "input-sort")
    WebElement sortBy;
    public String getLaptopAndNotebookText() {
        log.info("Verify the text ‘Laptops & Notebooks’ " + laptopAndNotebookText.toString());
        return getTextFromElement(laptopAndNotebookText);
    }


    public void clickOnSortByPosition() {
        log.info("Clicking on Login Button " + clickOnSortBy.toString());
        clickOnElement(clickOnSortBy);
    }

    public void selectProductSortedPriceHighToLow(String text) {
        log.info("Select " + text + " option from drop down" + clickOnSortBy.toString());
        selectByVisibleTextFromDropDown(clickOnSortBy, text);

    }

    public List<Double> priceHighToLow() {

        List<WebElement> products = productPriceList1;
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        log.info("Verify Product sorted  price High to low " + productPriceList1.toString());
        return originalProductsPrice;
    }

    public List<Double> getPriceHighToLow() {
        Collections.sort(priceHighToLow(), Collections.reverseOrder());
        List<WebElement> products = productPriceList;
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return afterSortByPrice;
    }
    public void clickOnProductMacBook() {
       mouseHoverToElementAndClick(productMacBook);
        log.info("Select Macbook " + productMacBook.toString());
    }
    public String getMacbookText(){
        log.info("Verify the text  " +macbookText.toString());
        return getTextFromElement(macbookText);
    }

//    public String getLaptopsAndNotebooksText() {
//        CustomListeners.test.log(Status.PASS, "Get text " + laptopsAndNotebooksText);
//        Reporter.log("Get text " + laptopsAndNotebooksText.toString());
//        return getTextFromElement(laptopsAndNotebooksText);
//    }

//    public ArrayList<Double> getProductsPriceList() {
//        CustomListeners.test.log(Status.PASS, "Get product prices " + productsPrices);
//        Reporter.log("Get product prices" + productsPrices.toString());
//        List<WebElement> products = getListOfElements(productsList);
//        ArrayList<Double> originalProductPrice = new ArrayList<>();
//        for (WebElement e : products) {
//            String[] arr = e.getText().split("Ex Tax:");
//            originalProductPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
//        }
//        return originalProductPrice;
//    }

//    public void selectSortByOption(String option) {
//        selectByVisibleTextFromDropDown(sortBy, option);
//        CustomListeners.test.log(Status.PASS, "Select option " + option);
//        Reporter.log("Select option from " + sortBy.toString());
//    }

    public void selectProductByName(String product) {
          log.info("Select Macbook" + product + "from " + productsList.toString());
        List<WebElement> products = getListOfElements(productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }
}
