package com.waverleysoftware.testcases;


import enams.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
import pages.LowcostAviaMainPage;

import java.util.concurrent.TimeUnit;

public class LowcostAviaTests {

    private WebDriver driver;
    @FindBy(id = "menu-item-19")
    private WebElement travelIdeasItem;

    @BeforeClass
    @Parameters("browser")
    public void setUpClass(Browser browser) {
        driver = BrowserProvider.createDriver(browser);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void openTravelIdeasTab() {
        LowcostAviaMainPage amazonMain = new LowcostAviaMainPage(driver);
        //travelIdeasItem.click();
        driver.findElement(By.id("menu-item-19")).click();
    }

    @AfterClass
    public void tearDownTest() {
        if(driver!=null) {
            driver.quit();
        }
    }

}
