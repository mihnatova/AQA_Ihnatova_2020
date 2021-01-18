package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonNewReleasesPage extends Page {

    private String mostGiftedButtonLocator = "//a[contains(text(),'Most Gifted')]";

    public AmazonNewReleasesPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonNewReleasesPage clickOnMostGiftedButton() throws Exception {
        driver.findElement(By.xpath(mostGiftedButtonLocator)).click();
        return PageFactory.newPage(driver, AmazonNewReleasesPage.class);
    }
}
