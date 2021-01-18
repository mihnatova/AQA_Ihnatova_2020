package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.AmazonHeader;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage extends Page{

    private AmazonHeader amazonHeader;

    public AmazonHomePage(RemoteWebDriver driver) {
        super(driver);
        this.amazonHeader = new AmazonHeader(driver);
    }

    public void navigateToAllSection() {
        amazonHeader.navigateToAllSection();
    }

    public void navigateToNewReleasesPage() {
        amazonHeader.navigateToNewReleasesPage();
    }
}
