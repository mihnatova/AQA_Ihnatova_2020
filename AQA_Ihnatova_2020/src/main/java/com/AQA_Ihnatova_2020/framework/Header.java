package com.AQA_Ihnatova_2020.framework;

import com.AQA_Ihnatova_2020.pages.KidsSectionPage;
import com.AQA_Ihnatova_2020.pages.NewSectionPage;
import com.AQA_Ihnatova_2020.pages.WomenSectionPage;
import com.AQA_Ihnatova_2020.pages.WorkBootsSectionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header {

    protected RemoteWebDriver driver;
    private String newButtonLocator = "//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'NEW')]";
    private String kidsButtonLocator = "//span[contains(text(),'KIDS')]";
    private String womenButtonLocator = "//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'WOMEN')]";
    private String workBootsButtonLocator = "//span[contains(text(),'WORK BOOTS')]";

    public Header(final RemoteWebDriver driver) {
        this.driver = driver;
    }

<<<<<<< HEAD
    public NewSectionPage navigateToNewSectionPage() throws Exception {
=======
    //TODO if you're navigating to the specific page in the method then method name should reflect it, e.g. navigateToNewSectionPage(), please update all affected methods
    public NewSectionPage navigateToNewSection() throws Exception {
>>>>>>> 0967bd516036b054ae7e7432d97ca938ad906881
        driver.findElement(By.xpath(newButtonLocator)).click();
        return PageFactory.newPage(driver, NewSectionPage.class);
    }

    public KidsSectionPage navigateToKidsSectionPage() throws Exception {
        driver.findElement(By.xpath(kidsButtonLocator)).click();
        return PageFactory.newPage(driver, KidsSectionPage.class);
    }

    public WomenSectionPage navigateToWomenSectionPage() throws Exception {
        driver.findElement(By.xpath(womenButtonLocator)).click();
        return PageFactory.newPage(driver, WomenSectionPage.class);
    }

    public WorkBootsSectionPage navigateToWorkBootsSectionPage() throws Exception {
        driver.findElement(By.xpath(workBootsButtonLocator)).click();
        return PageFactory.newPage(driver, WorkBootsSectionPage.class);
    }
}
