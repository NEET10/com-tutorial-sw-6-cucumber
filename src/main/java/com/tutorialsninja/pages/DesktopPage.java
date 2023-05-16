package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> products;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> products1;


    public List<String> getExpectedProductsNameInZtoAOrder() {
        Reporter.log("Get Expected Produts Name after sorted Z to A order");
        List<String> list = getTheListOfElementFromTheList(products);
        //Collections.reverse(list);
        System.out.println(list);
        log.info("Get Expected Product list in Z to A order" + products.toString());
        return list;
    }

    public void selectSortByOptionsFromDropDown(String text) {
        Reporter.log("Sort by " + text);
        selectByVisibleTextFromDropDown(sortBy, text);
    }

    public List<String> getActualProductsNameInZtoAOrder() {
        Reporter.log("Get Actual Produts Name after sorted Z to A order");
        List<String> list;
        list = getTheListOfElementFromTheList(products1);
        System.out.println(list);
        log.info("Actual sorted Product List in z to a order" + products1.toString());
        return list;
    }
}
