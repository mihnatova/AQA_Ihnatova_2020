package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page{

    private String womenButtonLocator = "//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'WOMEN')]";

    private Header header;

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    public NewSectionPage navigateToNewSection() throws Exception {
       return header.navigateToNewSection();
    }

    public KidsSectionPage navigateToKidsSection() throws Exception {
        return header.navigateToKidsSection();
    }

    public WomenSectionPage navigateToWomenSection() throws Exception {
        return header.navigateToWomenSection();
    }

    public boolean isWomenButtonDisplayed () {
        return driver.findElement(By.xpath(womenButtonLocator)).isDisplayed();
    }

    public WorkBootsSectionPage navigateToWorkBootsSection() throws Exception {
        return header.navigateToWorkBootsSection();
    }
}
