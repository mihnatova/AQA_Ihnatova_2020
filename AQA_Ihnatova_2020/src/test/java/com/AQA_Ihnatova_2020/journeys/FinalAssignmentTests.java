package com.AQA_Ihnatova_2020.journeys;

import com.AQA_Ihnatova_2020.BaseTest;
import com.AQA_Ihnatova_2020.listeners.TestListener;
import com.AQA_Ihnatova_2020.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class FinalAssignmentTests extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private String searchTermLocator = "//*[@class='a-color-state a-text-bold']";
    private String allTopMenuButtonLocator = "//select[@id='searchDropdownBox']";
    private String all33DepartmentsButtonLocator = "//span[contains(text(),'See All 33 Departments')]";
    private String computerAndAccessoriesButtonLocator = "//span[contains(text(),'Computers & Accessories')]";
    private String monitorsButtonLocator = "//span[contains(text(),'Monitors')]";
    private String seeMoreButtonLocator = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/a/span";
    private AmazonHomePage amazonHomePage;
    private AmazonNewReleasesPage amazonNewReleasesPage;
    private AmazonGiftIdeasPage amazonGiftIdeasPage;
    private AmazonAllSectionPage amazonAllSectionPage;
    private AmazonSearchResultsPage amazonSearchResultsPage;


    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getMainUrl());

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        amazonHomePage = new AmazonHomePage(driver);
        amazonNewReleasesPage = new AmazonNewReleasesPage(driver);
        amazonGiftIdeasPage = new AmazonGiftIdeasPage(driver);
        amazonAllSectionPage = new AmazonAllSectionPage(driver);
        amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 0)
    public void mainUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the Amazon Home Page clicks on button “ALL” on the left panel
        amazonHomePage.navigateToAllSection();
        this.wait = new WebDriverWait(driver, 15);

        //From the menu selects “New Releases”
        amazonAllSectionPage.clickOnNewReleasesLeftBarButton();

        //Verifies that ALL titles of the sections presented on the page are existing in the left List of links
        //Assert.assertTrue(driver.findElement(By.xpath("//button[@id='addToCartButton']")).isDisplayed());
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 1)
    public void firstUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the home page clicks on link “New Releases” from the Top menu
        amazonHomePage.navigateToNewReleasesPage();

        //From the “Hot New Releases” clicks on “Most Gifted” link from the Top menu
        amazonNewReleasesPage.clickOnMostGiftedButton();

        //From the “Amazon Gift Ideas” clicks on “Books” link from the left menu
        amazonGiftIdeasPage.clickOnBooksButton();

        //On the “Most Gifted in Books” page checks ALL listings and verifies that all of them have Ratings presented
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 1)
    public void secondUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the home page searches for “go pro 4k” via search field
        amazonHomePage.setSearchTerm().searchSearchTerm();

        //On the “Search results” page selects Avg. Customer Review 4+ stars from the left section
        amazonSearchResultsPage.selectFourPlusCustomerReviewRating();

        //On the “Search results” page sets min price as 100 and apply changes
        amazonSearchResultsPage.setMinimalPrice().submitPrice();

        //Verifies that all updated results (except Limited deals one) have an average rating 4+ and item price is higher than 100
        Assert.assertTrue(AmazonSearchResultsPage.isExpectedConditionsMet(), "Expected conditions were not met!");
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 1)
    public void thirdUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the home page clicks on link “PC” from the Top menu
        amazonHomePage.setSearchTermPC().searchSearchTerm();

        //on “Computers & Accessories” page clicks on “Monitors”
        driver.findElement(By.xpath(all33DepartmentsButtonLocator)).click();
        driver.findElement(By.xpath(computerAndAccessoriesButtonLocator)).click();
        driver.findElement(By.xpath(monitorsButtonLocator)).click();

        //On “Monitors” page clicks on “See more” link next to the “Top rated section”
        driver.findElement(By.xpath(seeMoreButtonLocator)).click();

        //On  “Monitors top rated results” page applies filter “Sort by: Avg. Customer Review” from the top of the page

        //Verifies that in refreshed list all listings on the first page are sorted according to the Customer review (e.g., most rated on the top, etc.)
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 1)
    public void fourthUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the home page clicks on link “PC” from the Top menu
        amazonHomePage.setSearchTermPC().searchSearchTerm();

        //On “Computers & Accessories” page clicks on “Tablets”

        //On Results page selects “Prime” option checkbox from the left menu

        //In result list verifies that all listings on the first page either have “Prime option” or “FREE Delivery” in the listing body

    }
}
