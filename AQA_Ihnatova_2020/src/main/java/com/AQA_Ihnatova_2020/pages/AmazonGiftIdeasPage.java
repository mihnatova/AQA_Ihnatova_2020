package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonGiftIdeasPage extends Page{

    private String booksButtonLocator = "/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/div[2]/ul/ul/li[7]/a";

    public AmazonGiftIdeasPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonGiftIdeasPage clickOnBooksButton() throws Exception {
        driver.findElement(By.xpath(booksButtonLocator)).click();
        return PageFactory.newPage(driver, AmazonGiftIdeasPage.class);
    }
}
