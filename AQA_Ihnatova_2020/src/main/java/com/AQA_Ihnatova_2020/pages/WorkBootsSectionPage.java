package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WorkBootsSectionPage extends Page{

    private String workBootsButtonLocator = "//span[contains(text(),'WORK BOOTS')]";
    private String slip1460ResistantLeatherLaceUpBootsButtonLocator = "//a[@id='img-24382001']";
    private String size6ButtonLocator = "//a[@data-sku-code='190665198713']";
    private String addToBagButtonLocator = "//button[@id='addToCartButton']";
    private String addToCartButtonLocator = "//button[@id='addToCartButton']";

    public WorkBootsSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

<<<<<<< HEAD
    public WorkBootsSectionPage clickOnSlipResistantWorkBoots() throws Exception {
=======
    //TODO methods below should return void and either shall redirect us/return value or return this class - e.g. return this;
    public void clickOnSlipResistantWorkBoots() {
>>>>>>> 0967bd516036b054ae7e7432d97ca938ad906881
        driver.findElement(By.xpath(slip1460ResistantLeatherLaceUpBootsButtonLocator)).click();
        return PageFactory.newPage(driver, WorkBootsSectionPage.class);
    }

    public void selectSize6() {
        driver.findElement(By.xpath(size6ButtonLocator)).click();
    }

    public void addToBag() {
        driver.findElement(By.xpath(addToBagButtonLocator)).click();
    }

    public boolean isaddToCartButtonDisplayed () {
        return driver.findElement(By.xpath(addToCartButtonLocator)).isDisplayed();
    }
}
