package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.AmazonHeader;
import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage extends Page{

    private AmazonHeader amazonHeader;
    private String searchFieldLocator = "//input[@id='twotabsearchtextbox']";
    private String searchButtonLocator = "//span[@id='nav-search-submit-text']";
    private String searchTerm = "go pro 4k";
    private String searchTermPC = "PC";

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

    public AmazonHomePage setSearchTerm() throws Exception {
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(searchTerm);
        return PageFactory.newPage(driver, AmazonHomePage.class);
    }

    public AmazonHomePage searchSearchTerm() throws Exception {
        driver.findElement(By.xpath(searchButtonLocator)).click();
        return PageFactory.newPage(driver, AmazonHomePage.class);
    }

    public AmazonHomePage setSearchTermPC() throws Exception{
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(searchTermPC);
        return PageFactory.newPage(driver, AmazonHomePage.class);
    }
}
