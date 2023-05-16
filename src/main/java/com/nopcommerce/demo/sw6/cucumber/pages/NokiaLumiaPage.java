package com.nopcommerce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(css = "div[class='product-name'] h1")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement price;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement cartBtn;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement shoppingCartMessage;

    @CacheLookup
    @FindBy(css = "span[title='Close']")
    WebElement greenBtnClick;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCart;

    public void verifyTextNokiaLumia1020(String expText) {

        verifyElements(nokiaLumia1020, expText, "Text not displayed");
        log.info("Verify Text from Webpage");
    }

    public void verifyThePrice(String expectedPrice) {

        verifyElements(price, expectedPrice, "Price not displayed as expected");
        log.info("Verify Text from Webpage");
    }

    public void changeQuantity(String qty) {

        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
        log.info("Send text to quantity: " + quantity.toString());
    }

    public void clickOnCartBtn() {

        clickOnElement(cartBtn);
        log.info("Click on add to cart " + cartBtn.toString());
    }

    public void verifyShoppingCartMessage(String expectedMessage) {

        verifyElements(shoppingCartMessage, expectedMessage, "Message is not displayed");
        log.info("Verify Text from Webpage");
    }

    public void clickOnGreenBtn() {

        clickOnElement(greenBtnClick);
        log.info("Click on add to cart " + greenBtnClick.toString());
    }

    public void mouseHoverOnShoppingCart() {

        mouseHoverToElement(shoppingCart);
        log.info("Mouse hover on shopping cart " + shoppingCart.toString());
    }

    public void clickOnGoToCart() {

        clickOnElement(goToCart);
        log.info("Click on add to cart " + goToCart.toString());
    }
}
