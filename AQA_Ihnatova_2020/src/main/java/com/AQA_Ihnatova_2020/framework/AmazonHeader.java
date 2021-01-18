package com.AQA_Ihnatova_2020.framework;

import com.AQA_Ihnatova_2020.pages.AmazonNewReleasesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHeader {

    protected RemoteWebDriver driver;
    private String allButtonLocator = "//a[@id='nav-hamburger-menu']";
    private String newReleasesTopMenuButtonLocator = "//a[contains(text(),'New Releases')]";
    private String mostGiftedButtonLocator = "//a[contains(text(),'Most Gifted')]";

    public AmazonHeader(final RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void navigateToAllSection() {
        driver.findElement(By.xpath(allButtonLocator)).click();
    }

    public void navigateToNewReleasesPage() {
        driver.findElement(By.xpath(newReleasesTopMenuButtonLocator)).click();
    }
}
