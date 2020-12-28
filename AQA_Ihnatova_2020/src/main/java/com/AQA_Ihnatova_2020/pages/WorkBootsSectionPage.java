package com.AQA_Ihnatova_2020.pages;

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

    public void clickOnSlipResistantWorkBoots() {
        driver.findElement(By.xpath(slip1460ResistantLeatherLaceUpBootsButtonLocator)).click();
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
