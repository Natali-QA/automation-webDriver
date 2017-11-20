package enams;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.remote.DesiredCapabilities;

    public enum Browser {

        FIREFOX {
            @Override
            public WebDriver initialize(DesiredCapabilities capabilities) {
                synchronized (BrowserManager.class) {
                    FirefoxDriverManager.getInstance().setup();
                    return new FirefoxDriver(capabilities);
                }
            }
        },

        CHROME {
            @Override
            public WebDriver initialize(DesiredCapabilities capabilities) {
                synchronized (BrowserManager.class) {
                    ChromeDriverManager.getInstance().setup();
                    return new ChromeDriver(capabilities);
                }
            }
        };

        public abstract WebDriver initialize(DesiredCapabilities capabilities);


        @Override
        public String toString() {
            switch (this) {
                case FIREFOX: return "FIREFOX";
                case CHROME: return "CHROME";
                default: throw new IllegalArgumentException();
            }
        }

    }
