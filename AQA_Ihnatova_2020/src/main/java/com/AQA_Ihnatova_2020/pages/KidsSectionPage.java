package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KidsSectionPage extends Page {

    private String youth1460PascalMetallicBootsButtonLocator = "//a[@title='YOUTH 1460 PASCAL METALLIC BOOTS']";
    private String youth1460PascalMetallicBootsSizeLocator = "//a[@data-sku-code='190665361643']";
    //TODO don't think that this is an actual locator
    private String kidsBootsSizeLocator = "6";

    public KidsSectionPage(RemoteWebDriver driver) {
        super(driver);
    }

<<<<<<< HEAD
    public KidsSectionPage clickOnToddlersBoots() throws Exception {
=======
    //TODO this method shouldn't be void and if it's not redirecting us anywhere then it should return this;
    public void clickOnToddlersBoots() {
>>>>>>> 0967bd516036b054ae7e7432d97ca938ad906881
        driver.findElement(By.xpath(youth1460PascalMetallicBootsButtonLocator)).click();
        return PageFactory.newPage(driver, KidsSectionPage.class);
    }

    public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(youth1460PascalMetallicBootsSizeLocator)).getText().equals(kidsBootsSizeLocator);
    }
}
