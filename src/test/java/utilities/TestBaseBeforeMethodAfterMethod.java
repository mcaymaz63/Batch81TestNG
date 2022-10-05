package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public abstract class TestBaseBeforeMethodAfterMethod {
    protected static WebDriver driver;
    protected static String tarih;
    @BeforeClass(groups = {"group1","group2"})
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHH");
        tarih = date.format(formater);


    }

    @AfterClass(groups = {"group1","group2"})
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}