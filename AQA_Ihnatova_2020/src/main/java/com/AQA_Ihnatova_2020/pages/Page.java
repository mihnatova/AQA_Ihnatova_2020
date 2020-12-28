package com.AQA_Ihnatova_2020.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public Page(final RemoteWebDriver driver) {
        this.driver = driver;
        long timeOutInSeconds;
        this.wait = new WebDriverWait(driver, 30);
    }
}
