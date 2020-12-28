package com.AQA_Ihnatova_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KidsSectionPage extends Page {

    private String toddler1460PascalMetallicBootsButtonLocator = "//a[@title='TODDLER 1460 PASCAL METALLIC BOOTS']";
    private String toddler1460PascalMetallicBootsSizeLocator = "//a[@data-sku-code='190665361339']";
    private String kidsBootsSizeLocator = "7";

    public KidsSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickOnToddlersBoots() {
        driver.findElement(By.xpath(toddler1460PascalMetallicBootsButtonLocator)).click();
    }

    public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(toddler1460PascalMetallicBootsSizeLocator)).getText().equals(kidsBootsSizeLocator);
    }
}
