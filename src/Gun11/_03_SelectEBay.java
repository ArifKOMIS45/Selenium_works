package Gun11;

/*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz. selectByValue
  3- Arama işlemini yaptırınız.
 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");
        driver.manage().deleteAllCookies();

        WebElement ddMenu=driver.findElement(By.id("gh-cat")); // select tag olduğu netleştiğinde
        // bu elemanı kullanmak için uygun olan select sınıfı kullanılabilir.

        Select menu=new Select(ddMenu);
        menu.selectByValue("2984");

        WebElement searchBtn=driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        Bekle(10);
        BekleVeKapat();
    }

}
