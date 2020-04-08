package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //list of elements and their locations
    By practiceLink = By.linkText("Practice");
    By loginLink = By.linkText("Login");
    By signUpbtn = By.linkText("Sign Up");

    //methods performing actions on elements
    public void clickOnPracticeLink () {
        clickOnElement(practiceLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnSignUpBtn() {
        clickOnElement(signUpbtn);
    }

}
