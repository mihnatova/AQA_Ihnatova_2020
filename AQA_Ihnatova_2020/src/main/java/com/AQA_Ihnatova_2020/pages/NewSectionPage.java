package com.AQA_Ihnatova_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewSectionPage extends Page {

    private String newButtonLocator = "//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'NEW')]";
    private String productCollectionLocator = "//span[contains(text(),'Product Collection')]";

    public NewSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isNewCollectionDisplayed() {
        return driver.findElement(By.xpath(productCollectionLocator)).isDisplayed();
    }
}
