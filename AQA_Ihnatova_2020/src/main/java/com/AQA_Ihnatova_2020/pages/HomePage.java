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

    public NewSectionPage navigateToNewSectionPage() throws Exception {
       return header.navigateToNewSectionPage();
    }

    public KidsSectionPage navigateToKidsSectionPage() throws Exception {
        return header.navigateToKidsSectionPage();
    }

    public WomenSectionPage navigateToWomenSectionPage() throws Exception {
        return header.navigateToWomenSectionPage();
    }

    public boolean isWomenButtonDisplayed () {
        return driver.findElement(By.xpath(womenButtonLocator)).isDisplayed();
    }

    public WorkBootsSectionPage navigateToWorkBootsSectionPage() throws Exception {
        return header.navigateToWorkBootsSectionPage();
    }
}
