package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KidsSectionPage extends Page {

    private String junior1460PascalMetallicBootsButtonLocator = "//a[@title='JUNIOR 1460 PASCAL METALLIC BOOTS']";
    private String junior1460PascalMetallicBootsSizeLocator = "//a[@data-sku-code='190665361544']";
    private String kidsBootsSizeLocator = "11";

    public KidsSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

    public KidsSectionPage clickOnToddlersBoots() throws Exception {
        driver.findElement(By.xpath(junior1460PascalMetallicBootsButtonLocator)).click();
        return PageFactory.newPage(driver, KidsSectionPage.class);
    }

    public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(junior1460PascalMetallicBootsSizeLocator)).getText().equals(kidsBootsSizeLocator);
    }
}
