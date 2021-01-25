package com.AQA_Ihnatova_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonAllSectionPage extends Page {

    private String newReleasesLeftBarButtonLocator = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[4]";

    public AmazonAllSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickOnNewReleasesLeftBarButton() {driver.findElement(By.xpath(newReleasesLeftBarButtonLocator)).click();}

}
