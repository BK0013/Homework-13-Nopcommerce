package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPayment extends Utility {
    By creditcard = By.id("CreditCardType");
    By cardholder = By.id("CardholderName");
    By cardnumber = By.id("CardNumber");
    By month = By.id("ExpireMonth");
    By year = By.id("ExpireYear");
    By cardcode = By.id("CardCode");
    By paymentbutton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By confirm = By.xpath("//button[normalize-space()='Confirm']");
    By continueconfirm = By.xpath("//button[@onclick='setLocation(\"/\")']");
    By Url = By.xpath("//a[@href='/']");


    public void selectCreditCardType(String card) {
        selectValueFromdropDown(creditcard, card);

    }

    public void selectCardholder(String name) {
        sendTextToElement(cardholder, name);

    }

    public void selectCreditCardnumber(String card) {
        sendTextToElement(cardnumber, card);

    }

    public void selectExpireMonth(String value) {
        selectValueFromdropDown(month, value);

    }

    public void selectyear(String value) {
        selectValueFromdropDown(year, value);

    }

    public void selctCardCode(String text) {
        sendTextToElement(cardcode, text);

    }

    public void clickOnPaymentButton() {
        clickOnElement(paymentbutton);

    }

    public void clickOnConfirmButton() {
        clickOnElement(confirm);
    }

    public void clickOnContinueConfirm() {
        clickOnElement(continueconfirm);
    }
    public void clickOnUrl(){
        clickOnElement(Url);
    }


}