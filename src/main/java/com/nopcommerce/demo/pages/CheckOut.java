package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOut extends Utility {
    By inputFirstName = By.id("BillingNewAddress_FirstName");
    By inputLastName = By.id("BillingNewAddress_LastName");
    By inputEMailAddress = By.id("BillingNewAddress_Email");
    By inputCompanyName = By.id("BillingNewAddress_Company");
    By inputCountyName = By.id("BillingNewAddress_CountryId");
    By inputStateName= By.id("BillingNewAddress_StateProvinceId");
    By inputCityName= By.id("BillingNewAddress_City");
    By inputAddressLineOne= By.id("BillingNewAddress_Address1");
    By inputAddressLineTwo= By.id("BillingNewAddress_Address2");
    By inputZipPostalCode= By.id("BillingNewAddress_ZipPostalCode");
    By inputPhoneNumber= By.id("BillingNewAddress_PhoneNumber");
    By inputFaxNumber= By.id("BillingNewAddress_FaxNumber");
    By clickSaveButton= By.xpath("//button[@onclick='Billing.save()']");
    By shippingMethodSelect =By.id("shippingoption_1");
    By clickOnContinueButton =By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
    By selectCreditCardOption =By.id("paymentmethod_1");
    By clickOnCreditCardContinueButton = By.xpath("(//button[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardDropDownList= By.id("CreditCardType");
    By cardHolderName=By.id("CardholderName");
    By cardHolderNumber=By.id("CardNumber");
    By cardHolderCVVCode=By.id("CardCode");
    By cardHolderExpYearDropDown=By.id("ExpireYear");
    By cardHolderExpMonthDropDown=By.id("ExpireMonth");
    By confirmCreditCardButton =By.xpath("//button[@onclick='PaymentInfo.save()']");
    By verifyCreditCardPayment =By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyAirShippingMethod =By.xpath("//span[contains(text(),'Next Day Air')]");
    By verifyTotalAmount=By.xpath("//span[contains(text(),'$2,950.00')]");
    By clickOnConfirmOrder =By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou =By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderSuccessfulMessage =By.xpath("//div[@class='page checkout-page order-completed-page']//div/strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnFinalContinueButton =By.xpath("//button[contains(text(),'Continue')]");
    By verifyWelcomeMessage=By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public void basicFormFillUp(){
        doubleClickAndSendKeysOnElement(inputFirstName,"BK");
        doubleClickAndSendKeysOnElement(inputLastName,"Patel");
        doubleClickAndSendKeysOnElement(inputEMailAddress,"bkpatel13@gmail.com");
        doubleClickAndSendKeysOnElement(inputCompanyName,"BK Corp.");
        selectValueFromdropDown(inputCountyName,"420");
        clickOnElement(inputStateName);
        doubleClickAndSendKeysOnElement(inputCityName,"London");
        doubleClickAndSendKeysOnElement(inputAddressLineOne,"12, sudbury Road");
        doubleClickAndSendKeysOnElement(inputAddressLineTwo,"Nr. webmley stadium");
        doubleClickAndSendKeysOnElement(inputZipPostalCode,"445566");
        doubleClickAndSendKeysOnElement(inputPhoneNumber,"07511128282");
        doubleClickAndSendKeysOnElement(inputFaxNumber,"0289998687");
        clickOnElement(clickSaveButton);
    }
    public void setShippingMethodSelect(){
        clickOnElement(shippingMethodSelect);
        clickOnElement(clickOnContinueButton);
    }
    public void selectCreditCardOption(){
        clickOnElement(selectCreditCardOption);
        clickOnElement(clickOnCreditCardContinueButton);
    }
    public void fillCreditCardDetails(){
        selectValueFromdropDown(creditCardDropDownList,"MasterCard");
        doubleClickAndSendKeysOnElement(cardHolderName,"BK Patel");
        doubleClickAndSendKeysOnElement(cardHolderNumber,"5555555555554444");
        selectValueFromdropDown(cardHolderExpMonthDropDown,"8");
        selectValueFromdropDown(cardHolderExpYearDropDown,"2023");
        doubleClickAndSendKeysOnElement(cardHolderCVVCode,"123");
        clickOnElement(confirmCreditCardButton);
    }
    public String setVerifyCreditCardPayment(){
        return getTextElement(verifyCreditCardPayment);
    }
    public String setVerifyAirShippingMethod(){
        return getTextElement(verifyAirShippingMethod);
    }
    public String setVerifyTotalAmount(){
        return getTextElement(verifyTotalAmount);
    }
    public void setClickOnConfirmOrder(){
        clickOnElement(clickOnConfirmOrder);
    }
    public String setVerifyThankyou(){
        return getTextElement(verifyThankYou);
    }
    public String setVerifyOrderSuccessfulMessage(){
        return getTextElement(verifyOrderSuccessfulMessage);
    }
    public void finalContinueButton(){
        clickOnElement(clickOnFinalContinueButton);
    }
    public String setVerifyWelcomeMessage(){
        return getTextElement(verifyWelcomeMessage);
    }
}