package com.AQA_Ihnatova_2020.journeys;

import com.AQA_Ihnatova_2020.BaseTest;
import com.AQA_Ihnatova_2020.listeners.TestListener;
import com.AQA_Ihnatova_2020.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class FinalAssignmentTests extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private String searchFieldLocator = "//input[@id='twotabsearchtextbox']";
    private String searchButtonLocator = "//span[@id='nav-search-submit-text']";
    private String searchTerm = "go pro 4k";
    private String searchTermLocator = "//*[@class='a-color-state a-text-bold']";
    private String avgCustomerReview4PlusStarsButtonLocator = "//*[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private String searchMinPriceFieldLocator = "//input[@id='low-price']";
    private String searchMinPriceValue = "100";
    private String searchMinPriceButtonLocator = "//span[@id='a-autoid-1']";
    private String allTopMenuButtonLocator = "//select[@id='searchDropdownBox']";
    private String searchTermPC = "PC";
    private String all33DepartmentsButtonLocator = "//span[contains(text(),'See All 33 Departments')]";
    private String computerAndAccessoriesButtonLocator = "//span[contains(text(),'Computers & Accessories')]";
    private String monitorsButtonLocator = "//span[contains(text(),'Monitors')]";
    private String seeMoreButtonLocator = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/a/span";
    private AmazonHomePage amazonHomePage;
    private AmazonNewReleasesPage amazonNewReleasesPage;
    private String newReleasesButtonLocator = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[4]";
    private AmazonGiftIdeasPage amazonGiftIdeasPage;


    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getMainUrl());

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        amazonHomePage = new AmazonHomePage(driver);
        amazonNewReleasesPage = new AmazonNewReleasesPage(driver);
        amazonGiftIdeasPage = new AmazonGiftIdeasPage(driver);
    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 0)
    public void mainUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the Amazon Home Page clicks on button “ALL” on the left panel
        amazonHomePage.navigateToAllSection();
        this.wait = new WebDriverWait(driver, 15);

        //From the menu selects “New Releases”
        driver.findElement(By.xpath(newReleasesButtonLocator)).click();

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

        //From the home page searches for “go pro 4k” via search field=
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(searchTerm);
        driver.findElement(By.xpath(searchButtonLocator)).click();

        //On the “Search results” page selects Avg. Customer Review 4+ stars from the left section
        driver.findElement(By.xpath(avgCustomerReview4PlusStarsButtonLocator)).click();

        //On the “Search results” page sets min price as 100 and apply changes
        driver.findElement(By.xpath(searchMinPriceFieldLocator)).sendKeys(searchMinPriceValue);
        driver.findElement(By.xpath(searchMinPriceButtonLocator));

        //Verifies that all updated results (except Limited deals one) have an average rating 4+ and item price is higher than 100

    }

    @Test(groups = "main", suiteName = "Ultimate", priority = 1)
    public void thirdUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url

        //From the home page clicks on link “PC” from the Top menu
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(searchTermPC);
        driver.findElement(By.xpath(searchButtonLocator)).click();

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
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(searchTermPC);
        driver.findElement(By.xpath(searchButtonLocator)).click();

        //On “Computers & Accessories” page clicks on “Tablets”

        //On Results page selects “Prime” option checkbox from the left menu

        //In result list verifies that all listings on the first page either have “Prime option” or “FREE Delivery” in the listing body

    }
}
