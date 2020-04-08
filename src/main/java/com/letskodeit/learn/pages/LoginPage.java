package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //list of elements and their locations
    By logInToLetsKodeIt = By.cssSelector("h1.text-center");

    //methods performing actions on elements
    public void verifyTextLogInToLetsKodeIt() {
        verifyTextAssertMethod(logInToLetsKodeIt, "Log In to Let's Kode It");
    }

}
