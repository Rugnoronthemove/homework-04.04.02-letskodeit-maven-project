package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.LoginPage;
import com.letskodeit.learn.pages.PracticePage;
import com.letskodeit.learn.pages.SignUpPage;
import com.letskodeit.learn.testbase.TestBase;

import org.testng.annotations.Test;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    PracticePage practicePage = new PracticePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    //TestCases
    @Test
    public void navigateSuccessfullyToPracticePage() {
        //click on Practice link
        homePage.clickOnPracticeLink();
        //verify text on Practice page
        practicePage.verifyTextPracticePage();
    }

    @Test
    public void navigateSuccessfullyToLoginPage() {
        //click on Login link
        homePage.clickOnLoginLink();
        //verify text on Login page
        loginPage.verifyTextLogInToLetsKodeIt();
    }

    @Test
    public void navigateSuccessfullyToSignupPage() {
        //click on SignUp button
        homePage.clickOnSignUpBtn();
        //verify text on SignUp page
        signUpPage.verifyTextSignUpToLetsKodeIt();
    }

    @Test
    public void userShouldSelectHondaElementFromDropDownMenu() throws InterruptedException {
        //click on Practice link
        homePage.clickOnPracticeLink();
        //select Honda from dropdown menu
        practicePage.selectFromDropDownMenu();
    }
}
