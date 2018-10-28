import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.opera.OperaDriver;


public enum BrowserFactory {
    chrome {
        public WebDriver create() {
            ChromeOptions options_chrome = new ChromeOptions();
            options_chrome.addArguments("--disable-notifications");
            return  new ChromeDriver(options_chrome);
        }
    },
    firefox {
        public WebDriver create() {
            FirefoxOptions options_ff = new FirefoxOptions();
            options_ff.addPreference("dom.webnotifications.enabled", false);
            return new FirefoxDriver(options_ff);
        }
    },
    opera{
        public WebDriver create() {
            OperaOptions options_opera = new OperaOptions();
            options_opera.setBinary("C:/Program Files/Opera/56.0.3051.52/Opera.exe");
            options_opera.addArguments("--disable-notifications");
            return new OperaDriver(options_opera);
        }
    }
    ;

    public WebDriver create() {
        return null;
    }

}
