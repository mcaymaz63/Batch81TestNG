package tests.day21;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class HomeWork extends ReusableMethods {
    Actions actions;
    HepsiBuradaPage hepsiburada;
    @Test
    public void test01() throws InterruptedException, IOException {
        //Hepsiburada sayfasına gidiniz
       Driver.getDriver().get(ConfigReader.getProperty("hpsBruda"));
        hepsiburada = new HepsiBuradaPage();
        actions = new Actions(Driver.getDriver());
//Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım

hepsiburada.weList();
//Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım

//Sayfayı kapatalım
        Driver.closeDriver();
    }
}
