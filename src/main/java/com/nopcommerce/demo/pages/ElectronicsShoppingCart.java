package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsShoppingCart extends Utility {
    By Ele = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By Ele1 = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By ListView = By.xpath("//a[contains(text(),'List')]");
    By Nokia = By.xpath("(//a[text()='Nokia Lumia 1020'])");
    By clear = By.xpath("//input[@id='product_enteredQuantity_20']");
    By AddedItem = By.xpath("//input[@id='product_enteredQuantity_20']");
    By Addtocart = By.xpath("//button[@id='add-to-cart-button-20']");
    By close = By.xpath("//span[@class='close']");
    By gotoCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By gotoCart1 = By.xpath("//button[contains(text(),'Go to cart')]");
    By agree = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");

    public void mouseHoverToEletronicTab() {
        mouseHoverToElement(Ele);
        mouseHoverToClickElement(Ele1);
        mouseHoverToElement(ListView);
        mouseHoverToClickElement(Nokia);
    }

    public void clickToClearCartItem() {
        clearValue(clear);
    }

    public void enterCartItemValue(String value) {
        sendTextToElement(AddedItem, value);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(Addtocart);

    }
    public void clickOnCloseMessage(){
        clickOnElement(close);
    }

    public void mouseHoverOnGoToCart() {
        mouseHoverToElement(gotoCart);
    }

    public void clickOnGOToCart() {
        clickOnElement(gotoCart1);

    }
    public void clickOnTerms() {
        clickOnElement(agree);

    }
    public void clickOncheckout(){
        clickOnElement(checkout);
    }
}