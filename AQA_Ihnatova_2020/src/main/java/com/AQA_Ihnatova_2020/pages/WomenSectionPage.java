package com.AQA_Ihnatova_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WomenSectionPage extends Page {

    private String womenButtonLocator = "//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'WOMEN')]";
    private String productCollectionLocator = "//span[contains(text(),'Product Collection')]";

    public WomenSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isWomenCollectionDisplayed () {
        return driver.findElement(By.xpath(productCollectionLocator)).isDisplayed();
    }

}
