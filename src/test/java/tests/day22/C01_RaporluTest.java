package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    @Test
    public void test01() {
        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı");

        /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

       //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar Sitesine Gidildi");


        //-login butonuna bas
        BrcPage brcPage = new BrcPage();
        brcPage.brclogin.click();
        extentTest.info("Login Butunona Basildi");

        //-test data user email: customer@bluerentalcars.com ,
       brcPage.userEmail.sendKeys(ConfigReader.getProperty("userEmail"));

     //test data password : 12345 dataları girip login e basın
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pass")).
                sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru Kullanici email Girildi ve passwor girildi");
        extentTest.info(" Ikinci Login Tiklandi");
      // brcPage.brcPassword.sendKeys(ConfigReader.getProperty("pass"));
      //  -login butonuna tiklayin
      // brcPage.brcLogin2.click();

      //-Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
       String actualUserName=brcPage.basariliGiris.getText();
       String expectedUserName="John Walker";
      Assert.assertEquals(expectedUserName, actualUserName);
      extentTest.pass("Sayfaya Basarili bir sekilde girildi");

    }
}
