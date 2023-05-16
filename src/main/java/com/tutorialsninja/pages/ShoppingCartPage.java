package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }


//    @CacheLookup
//    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[1]/form[1]/div[1]/button[1]")
//  //  @FindBy(xpath = "//span[normalize-space()='Currency']")
//    WebElement currency;
//    @CacheLookup
//    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
//   // @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
//    WebElement poundSterling;
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    List<WebElement> currencyList;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement hplp3065;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement hplb3065Text;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement calenderButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement calenderMonthAndYear;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButtonOnCalender;
    @CacheLookup
    @FindBys(@FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"))
    List<WebElement> datesOnCalender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement productAddedText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    WebElement shoppingCartButton;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='View Cart']")
    WebElement viewCartButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productname;
//    @CacheLookup
//    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/small[1]")
//    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement productModel;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    public void clickOnHpLp3065() {
        log.info("clicking on HPLP3065" + hplp3065.toString());
        clickOnElement(hplp3065);
    }

    public String getHplp3065Text() {
        log.info("Get product title" + hplb3065Text.toString());
        return getTextFromElement(hplb3065Text);

    }

//    public void clickOnCurrency() {
//        log.info("Clicking on currency" + currency.toString());
//        mouseHoverToElementAndClick(currency);
//    }
//
//    public void selectPoundSterling() {
//        log.info("Choosing Pounds Currency" + poundSterling.toString());
//        selectByContainsTextFromDropDown(poundSterling, "£Pound Sterling");
//    }
public void selectCurrency(String currency){

    log.info("Select currency " +currencyList.toString());
    clickOnElement(currencyTab);
    List<WebElement> ListOfElements =getListOfElements(currencyList);
    for (WebElement e:ListOfElements){
        if (e.getText().equalsIgnoreCase(currency)){
            e.click();
            break;
        }
    }
}


    public void clickOnCalenderButton() {
        log.info("Click On Calender Button" + calenderButton.toString());
        clickOnElement(calenderButton);
    }

    public void selectDateFromTheCalender(String year, String month, String date) {
        log.info("Select date from calender" + calenderMonthAndYear);
        while (true) {
            String monthAndYear = getTextFromElement(calenderMonthAndYear);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButtonOnCalender);
            }
        }
        List<WebElement> allDates = datesOnCalender;
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void changeQuantity(String qty) {
        log.info("Change Quantity" + quantity.toString());
        clearTextFromField(quantity);
        sendTextToElement(quantity, qty);
    }

    public void clickOnAddToCartButton() {
        log.info("Click on AddToCart Button" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getProductAddedMessage() {
        log.info("Get Product Added Message" + productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

//    public String getShoppingCartText() {
//        Reporter.log("Get Shopping Cart Text");
//
//        return getTextFromElement(shoppingCartText);
//    }


    public void clickOnShoppingCart() {
        Reporter.log("Click on Shopping Cart");

        clickOnElement(shoppingCartButton);
    }

    public void clickOnViewCart() {
        Reporter.log("Click on View Cart");

        clickOnElement(viewCartButton);
    }

    public String getProductTitle() {
        Reporter.log("Get Product title");

        return getTextFromElement(productname);
    }

    public String getDeliveryDate() {
        Reporter.log("Get Delivery Date");

        return getTextFromElement(deliveryDate);
    }

    public String getTotalText() {
        Reporter.log("Get Total");

        return getTextFromElement(total);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement productDesktopModel;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input[@type='text']")
    WebElement quantityField;
    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-refresh']")
    WebElement updateButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement updateSuccessText;
    @CacheLookup
    @FindBy(css = "a.btn.btn-primary")
    WebElement checkoutButton;

    public String getShoppingCartText() {
        log.info(" Verify the text Shopping Cart " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductText() {
        log.info("Verify the Product name HP LP3065 " + productText.toString());
        return getTextFromElement(productText);
    }

    public String getDeliveryDateOfProduct() {
        log.info("Verify the Delivery Date 2022-11-30 " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getProductModel() {
        log.info("Verify the Model Product21 " + productDesktopModel.toString());
        return getTextFromElement(productDesktopModel);
    }

    public String getTotalPrice() {
        log.info("Verify the Total £74.73 " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void changeQuantityForProduct(String text) {
        quantityField.clear();
        sendTextToElement(quantityField, text);
        log.info("Change Quantity " + text + " to quantity field " + quantityField.toString());
    }

    public void clickOnUpdateQuantity() {
        clickOnElement(updateButton);
        log.info(" Click on “Update” Tab " + updateButton.toString());
    }

    public String getUpdateSuccessfullyText() {
        log.info("Getting welcome back text " + updateSuccessText.toString());
        return getTextFromElement(updateSuccessText);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        log.info("Click on “Checkout” button " + checkoutButton.toString());
    }
}
