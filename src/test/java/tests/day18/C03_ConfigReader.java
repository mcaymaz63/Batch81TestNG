package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test(groups = "group2")
    public void test01() {
        //Amazon sayfasına ve facebook sayfasına gidiniz
        String urlamzn = ConfigReader.getProperty("amznUrl");
        String urlFace = ConfigReader.getProperty("faceUrl");
        String urlhepsi = ConfigReader.getProperty("hepsiUrl");


        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlFace);
        Driver.getDriver().get(urlhepsi);
        Driver.closeDriver();
    }
}
