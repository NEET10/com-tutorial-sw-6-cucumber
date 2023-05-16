package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> topMenu;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> options;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNoteBooks;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/a[1]")
    WebElement showAllLaptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h2[1]")
    //"//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopAndNoteBooksText;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement components;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
    WebElement tablets;
    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'Tablets')]")
    WebElement tabletsText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Software')]")
    WebElement software;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Software')]")
    WebElement softwareText;


    public void clickOnDesktopsLink() {
        log.info("Clicking on desktops tab " + desktop.toString());
        mouseHoverToElementAndClick(desktop);
    }

    public void selectMenuAndClickShowAllDesktops() {
        log.info("Selecting show all desktops " + options.toString());
        selectAndClickOnTheElementFromTheList(options, "Show AllDesktops");
    }

    public String getDesktopsText() {
        log.info("Getting Page text " + desktopText.toString());
        return getTextFromElement(desktopText);
    } public void clickOnLaptopsAndNotebooksLink() {
        log.info("Clicking on Laptops & notebooks tab " + laptopAndNoteBooks.toString());
        mouseHoverToElementAndClick(laptopAndNoteBooks);
    }

    public void selectMenuAndClickShowAllLaptopAndNoteBooks() {
        log.info("Selecting Show All Laptops & Notebooks " + options.toString());
        selectAndClickOnTheElementFromTheList(options, "Show AllLaptops & Notebooks");
    }

    public String getLaptopsAndNotebooksText() {
        log.info("Getting Page text " + laptopAndNoteBooksText.toString());
        return getTextFromElement(laptopAndNoteBooksText);
    } public void clickOnComponentsLink() {
        log.info("Clicking on Components tab " + components.toString());
        mouseHoverToElementAndClick(components);
    }

    public void selectMenuAndClickShowAllComponents() {
        log.info("Selecting show all desktops " + options.toString());
        selectAndClickOnTheElementFromTheList(options, "Show AllComponents");
    }

    public String getComponentsText() {
        log.info("Getting Page text " + componentsText.toString());
        return getTextFromElement(componentsText);
    }
    public void clickOnTablets(){
        log.info("Clicking on tablets "+tablets.toString());
        mouseHoverToElementAndClick(tablets);
    }
    public String getTabletsText(){
        log.info("Getting Page text " + tabletsText.toString());
        return getTextFromElement(tabletsText);
    }
    public void clickOnSoftware(){
        log.info("Clicking on software "+software.toString());
        mouseHoverToElementAndClick(software);
    }
    public String getSoftwareText(){
        log.info("Getting Page text " + softwareText.toString());
        return getTextFromElement(softwareText);
    }

}
