package com.AQA_Ihnatova_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstWebTests {

    private RemoteWebDriver driver;

    @BeforeMethod
    public void setup() {
        System.out.println("before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("after method");
    }

    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        //Given user opens a browser and provides a valid url
        driver.get("https://www.drmartens.com/us/en/ ");

        //When user clicks on the "Confirm" button on the pop-up
        driver.findElement(By.xpath("//button[@id='country-modal-submit']")).click();

        //Then user sees the "WOMEN" button
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'WOMEN')]")).isDisplayed());
    }

    @Test(priority = 1, suiteName = "regression")
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        //Given user opens a browser and provides a valid url
        driver.get("https://www.drmartens.com/us/en/ ");

        //When user clicks on the "Confirm" button on the pop-up
        driver.findElement(By.xpath("//button[@id='country-modal-submit']")).click();

        //And user clicks on the "WOMEN" button
        driver.findElement(By.xpath("//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'WOMEN')]")).click();

        //Then user is redirected to the page where the products are for women and sees the "PRODUCT COLLECTION" button
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Product Collection')]")).isDisplayed());
    }

    @Test(priority = 2, suiteName = "regression")
    public void secondTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        //Given user opens a browser and provides a valid url
        driver.get("https://www.drmartens.com/us/en/ ");

        //When user clicks on the "Confirm" button on the pop-up
        driver.findElement(By.xpath("//button[@id='country-modal-submit']")).click();

        //And user clicks on the "NEW" button
        driver.findElement(By.xpath("//ul[@id='dm-primary-nav']/li/span/a/span[contains(text(),'NEW')]")).click();

        //Then user is redirected to the page where the new products are suggested and sees the "PRODUCT COLLECTION" button
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Product Collection')]")).isDisplayed());
    }

    @Test(priority = 3, suiteName = "regression")
    public void thirdTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        //Given user opens a browser and provides a valid url
        driver.get("https://www.drmartens.com/us/en/ ");

        //When user clicks on the "Confirm" button on the pop-up
        driver.findElement(By.xpath("//button[@id='country-modal-submit']")).click();

        //And user clicks on the "KIDS" button
        driver.findElement(By.xpath("//span[contains(text(),'KIDS')]")).click();

        //And user selects and clicks on “TODDLER 1460 PASCAL METALLIC BOOTS” button
        driver.findElement(By.xpath("//a[@title='TODDLER 1460 PASCAL METALLIC BOOTS']")).click();

        //Then user is redirected to the page where the user can customize TODDLER 1460 PASCAL METALLIC BOOTS
        Assert.assertTrue(driver.findElement(By.xpath("//a[@data-sku-code='190665361339']")).isDisplayed());
    }

    @Test(priority = 4, suiteName = "regression")
    public void fourthTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        //Given user opens a browser and provides a valid url
        driver.get("https://www.drmartens.com/us/en/ ");

        //When user clicks on the "Confirm" button on the pop-up
        driver.findElement(By.xpath("//button[@id='country-modal-submit']")).click();

        //And user clicks on the "WORK BOOTS" button
        driver.findElement(By.xpath("//span[contains(text(),'WORK BOOTS')]")).click();

        //And user selects and clicks on “1460 SLIP RESISTANT LEATHER LACE UP BOOTS” button
        driver.findElement(By.xpath("//a[@id='img-24382001']")).click();

        //And user is redirected to the page where the user can customize 1460 SLIP RESISTANT LEATHER LACE UP BOOTS - select size 6
        driver.findElement(By.xpath("//a[@data-sku-code='190665198713']")).click();

        //And user clicks the "ADD TO BAG" button
        driver.findElement(By.xpath("//button[@id='addToCartButton']")).click();

        //Then user gets to checkout pop-up
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='addToCartButton']")).isDisplayed());
    }
}
