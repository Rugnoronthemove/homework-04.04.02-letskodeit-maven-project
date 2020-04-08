package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class PracticePage extends Utility {

    //list of elements and their locations
    By practicePageText = By.xpath("//div//h1[contains(text(),'Practice Page')]");
    By bmwRadioBtn = By.id("bmwradio");
    By hondaDropDownMenuLink = By.id("carselect");

    //methods performing actions on elements
    public void verifyTextPracticePage() {
        verifyTextAssertMethod(practicePageText, "Practice Page");
    }

    public void clickOnBmwRadioBtn() {
        clickOnElement(bmwRadioBtn);
    }

    public void selectFromDropDownMenu() {
        selectByIndexFromDropDown(hondaDropDownMenuLink, 2);
    }

}
