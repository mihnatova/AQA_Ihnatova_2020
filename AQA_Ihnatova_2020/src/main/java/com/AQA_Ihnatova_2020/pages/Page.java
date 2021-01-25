package com.AQA_Ihnatova_2020.pages;

import com.AQA_Ihnatova_2020.framework.PageFactory;
import com.sun.tools.corba.se.idl.toJavaPortable.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class Page {

    protected static RemoteWebDriver driver;
    protected static WebDriverWait wait;

    public Page(final RemoteWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    protected <T extends Page>T clickOnElement(By selector, Class<T> clazz) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            driver.findElement(selector).click();
            return PageFactory.newPage(driver, clazz);
        } catch (Exception ex) {
            com.AQA_Ihnatova_2020.framework.Helper.Logger.LogError("Element is not clickable", ex);
            return null;
        }
    }

    protected <T extends Page>T setText(By selector, String text, Class<T> clazz) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            driver.findElement(selector).sendKeys(text);
            return PageFactory.newPage(driver, clazz);
        } catch (Exception ex) {
            com.AQA_Ihnatova_2020.framework.Helper.Logger.LogError("Can't send keys", ex);
            return null;
        }
    }

    protected WebElement getElement(By selector) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            return driver.findElement(selector);
        } catch (Exception ex) {
            com.AQA_Ihnatova_2020.framework.Helper.Logger.LogError("Element is not present", ex);
            return null;
        }
    }

    protected static List<WebElement> getElements(By selector) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            return driver.findElements(selector);
        } catch (Exception ex) {
            com.AQA_Ihnatova_2020.framework.Helper.Logger.LogError("Elements are not present", ex);
            return null;
        }
    }
}

