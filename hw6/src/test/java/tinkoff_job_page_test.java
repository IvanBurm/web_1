import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;


public class tinkoff_job_page_test {

        private static ThreadLocal<WebDriver> tl = new ThreadLocal<>();
        WebDriver driver;
        String baseUrl, browserName = System.getProperty("browser");

        @Before
        public void setUp()  {

            driver = BrowserFactory.valueOf(browserName).create();
            baseUrl = "https://moscow-job.tinkoff.ru/";
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        @After

    public void tearDown() {
        driver.quit();
    }

}
