package com.letskodeit.learn.testbase;

import com.letskodeit.learn.basepage.BasePage;
import com.letskodeit.learn.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://learn.letskodeit.com/";

    //opens Browser
    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    //closes Browser
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
