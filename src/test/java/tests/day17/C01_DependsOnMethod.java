package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_DependsOnMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test1() {
        driver.get("https://www.wamazon1.com");
    }
    @Test(dependsOnMethods="test1")
    public void test2() {
        driver.get("https://www.facebook.com");
}
    @Test(dependsOnMethods="test2")
    public void test3() {
    driver.get("https://www.bestbuy.com") ;

    }

    @Test(priority = -1)
    public void test4() {
driver.get("https://www.youtube.com");


// Odev

//Bir class oluşturun: DependsOnTest
//https://www.amazon.com/ adresine gidin.
//Test : Amazon ana sayfaya gittiginizi test edin
//Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
//arama yapin ve aramanizin gerceklestigini Test edin
//Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
//$16.83 oldugunu test edin
    }
}