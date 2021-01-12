package com.AQA_Ihnatova_2020.journeys;

import com.AQA_Ihnatova_2020.BaseTest;
import com.AQA_Ihnatova_2020.listeners.TestListener;
import com.AQA_Ihnatova_2020.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class DrMartensWebTests extends BaseTest {

    private String confirmButtonLocator = "//button[@id='country-modal-submit']";
    private HomePage homePage;
    private NewSectionPage newSectionPage;
    private KidsSectionPage kidsSectionPage;
    private WomenSectionPage womenSectionPage;
    private WorkBootsSectionPage workBootsSectionPage;


    @BeforeMethod (alwaysRun = true)
    public void setupTest() {
        driver.get(getMainUrl());

        if (driver.findElement(By.xpath(confirmButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(confirmButtonLocator)).click();
        }
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 0)
    public void mainUrlTest() {
        //Given user opens a browser and provides a valid url

        //Then user sees the "WOMEN" button
        Assert.assertTrue(homePage.isWomenButtonDisplayed());
    }

    @Test(groups = "main", priority = 1)
    public void firstTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on the "WOMEN" button
        womenSectionPage = homePage.navigateToWomenSection();

        //Then user is redirected to the page where the products are for women and sees the "PRODUCT COLLECTION" button
        Assert.assertTrue(womenSectionPage.isWomenCollectionDisplayed());
    }

    @Test(groups = "main", priority = 2)
    public void secondTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on the "NEW" button
        newSectionPage = homePage.navigateToNewSection();

        //Then user is redirected to the page where the new products are suggested and sees the "PRODUCT COLLECTION" button
        Assert.assertTrue(newSectionPage.isNewCollectionDisplayed());
    }
    @Test(groups = "regression", priority = 3)
    public void thirdTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on the "KIDS" button
        kidsSectionPage = homePage.navigateToKidsSection();

        //And user selects and clicks on “TODDLER 1460 PASCAL METALLIC BOOTS” button
        kidsSectionPage.clickOnToddlersBoots();

        //Then user is redirected to the page where the user can customize TODDLER 1460 PASCAL METALLIC BOOTS
        Assert.assertTrue(kidsSectionPage.isTitleCorrect());
    }

    @Test(groups = "regression", priority = 4)
    public void fourthTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on the "WORK BOOTS" button
        workBootsSectionPage = homePage.navigateToWorkBootsSection();

        //TODO methods below can be chained after corresponding methods on the page will be amended
        //And user selects and clicks on “1460 SLIP RESISTANT LEATHER LACE UP BOOTS” button
        workBootsSectionPage.clickOnSlipResistantWorkBoots();

        //And user is redirected to the page where the user can customize 1460 SLIP RESISTANT LEATHER LACE UP BOOTS - select size 6
        workBootsSectionPage.selectSize6();

        //And user clicks the "ADD TO BAG" button
        workBootsSectionPage.addToBag();

        //Then user gets to checkout pop-up
        Assert.assertTrue(workBootsSectionPage.isaddToCartButtonDisplayed());
    }
}
