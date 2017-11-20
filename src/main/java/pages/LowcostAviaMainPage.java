package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LowcostAviaMainPage {

        private WebDriver driver;
        private static final String MAIN_URL = "http://lowcostavia.com.ua/";


        public LowcostAviaMainPage(WebDriver driver) {
            this.driver = driver;
            driver.navigate().to(MAIN_URL);
            PageFactory.initElements(driver, this);
        }

    }

