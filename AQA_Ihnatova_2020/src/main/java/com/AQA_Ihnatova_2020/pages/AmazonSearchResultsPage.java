package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;

public class AmazonSearchResultsPage extends Page{

    private String avgCustomerReview4PlusStarsButtonLocator = "//*[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private String searchMinPriceFieldLocator = "//input[@id='low-price']";
    private String searchMinPriceValue = "100";
    private String searchMinPriceButtonLocator = "//span[@id='a-autoid-1']";
    private static String searchResultsListLocator = "//*[@data-component-type='s-search-result']";
    private static String sponsoredLabelLocator = "//span[contains(text(),'Sponsored')]";
    private static String item4PlusRaitingLocator = "//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']";
    private static String wholePriceLocator = "//span[@class='a-price-whole']";


    public AmazonSearchResultsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonSearchResultsPage selectFourPlusCustomerReviewRating() throws Exception {
        driver.findElement(By.xpath(avgCustomerReview4PlusStarsButtonLocator)).click();
        return PageFactory.newPage(driver, AmazonSearchResultsPage.class);
    }

    public AmazonSearchResultsPage setMinimalPrice() throws Exception {
        driver.findElement(By.xpath(searchMinPriceFieldLocator)).sendKeys(searchMinPriceValue);
        return PageFactory.newPage(driver, AmazonSearchResultsPage.class);
    }

    public AmazonSearchResultsPage submitPrice() throws Exception {
        driver.findElement(By.xpath(searchMinPriceButtonLocator));
        return PageFactory.newPage(driver, AmazonSearchResultsPage.class);
    }

    public static boolean isExpectedConditionsMet() {
        ArrayList<WebElement> elements = (ArrayList<WebElement>) getElements(By.xpath(searchResultsListLocator));
        boolean result = false;

        for (WebElement element : elements) {
            if (!element.findElement(By.xpath(sponsoredLabelLocator)).isDisplayed());{
                if (!element.findElement(By.xpath(item4PlusRaitingLocator)).isDisplayed()&&
                    Integer.parseInt(element.findElement(By.xpath(wholePriceLocator)).getText())<100) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
