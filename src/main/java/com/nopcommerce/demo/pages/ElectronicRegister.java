package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicRegister extends Utility {
    By register = By.xpath("//button[contains(text(),'Register')]");



    public void ClickOnRegisterButton(){
        clickOnElement(register);
    }
}