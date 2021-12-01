package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Cart extends Utility {
    By verifyCartPage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityUpdate =By.xpath("//input[@class='qty-input']");
    By updateCart  =By.xpath("//button[normalize-space()='Update shopping cart']");
    By verifyValue =By.xpath("//span[@class='product-subtotal']");
    By termsCondition =By.id("termsofservice");
    By checkOutButton =By.id("checkout");


    //  By verify
    public String setVerifyCartPage(){
        return getTextElement(verifyCartPage);
    }
    public void setQuantityUpdate(){

        doubleClickAndSendKeysOnElement(quantityUpdate,"2");
    }
    public void setUpdateCart(){
        clickOnElement(updateCart);
    }
    public String getValueofAmount(){
        return getTextElement(verifyValue);
    }
    public void setTermsCondition(){
        clickOnElement(termsCondition);
    }
    public void setCheckOutButton(){
        clickOnElement(checkOutButton);
    }

}