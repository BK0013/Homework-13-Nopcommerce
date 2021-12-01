package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By RegisterClick = By.xpath("//button[contains(text(),'Register')]");
    By firstname = By.xpath("//input[@id='FirstName']");
    By lastname = By.xpath("//input[@id='LastName']");
    By emailField = By.xpath("//input[@id='Email']");
    By PasswordField = By.xpath("//input[@id='Password']");
    By confirmpasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By RegisterButton = By.xpath("//button[@id='register-button']");
    By Continue = By.xpath("//a[contains(text(),'Continue')]");
    By TermsOfService = By.xpath("//input[@id='termsofservice']");
    By Checkout = By.xpath("//button[@id='checkout']");
    By company = By.xpath("//input[@id='BillingNewAddress_Company']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By state = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By address2 = By.xpath("//input[@id='BillingNewAddress_Address2']");
    By zipcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phonenumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By faxnumber = By.xpath("//input[@id='BillingNewAddress_FaxNumber']");
    By billing = By.xpath("//button[@onclick='Billing.save()']");
    By shippinoption = By.xpath("//input[@id='shippingoption_2']");
    By shippingmethod = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By paymentmethod = By.cssSelector("#paymentmethod_1");
    By nextstepbutton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void clickOnRegisterLink() {
        clickOnElement(RegisterClick);
    }

    public void enterFirstname(String name) {
        sendTextToElement(firstname, name);
    }

    public void enterLastname(String name) {
        sendTextToElement(lastname, name);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(PasswordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmpasswordField, confirmPassword);
    }

    public void ClickOnRegisterButton() {
        clickOnElement(RegisterButton);
    }
    public void clickOncontinueButton(){
        clickOnElement(Continue);
    }
    public void clickOnTermOfService(){
        clickOnElement(TermsOfService);
    }
    public void clickOnCheckout(){
        clickOnElement(Checkout);
    }
    public void enterCompanyName(String name){
        sendTextToElement(company,name);

    }
    public void enterCountryName(String id){
        selectValueFromdropDown(country,id);

    }
    public void enterStateId(String value){
        selectValueFromdropDown(state,value);

    }
    public void enterCityName(String name){
        sendTextToElement(city,name);

    }
    public void enterAddress1(String address){
        sendTextToElement(address1,address);

    }
    public void enterAddress2(String address){
        sendTextToElement(address2,address);

    }
    public void enterZipCode(String code){
        sendTextToElement(zipcode,code);

    }
    public void enterPhoneNumber(String number){
        sendTextToElement(phonenumber,number);

    }
    public void enterFaxNumber(String number){
        sendTextToElement(faxnumber,number);

    }
    public void clickOnBilling(){
        clickOnElement(billing);
    }
    public void clickShipping(){
        clickOnElement(shippinoption);
    }
    public void clickOnShippingMethod(){
        clickOnElement(shippingmethod);
    }
    public void clickOnPaymentMethod(){
        clickOnElement(paymentmethod);
    }
    public void clickOnNextStepButton(){
        clickOnElement(nextstepbutton);
    }


}
